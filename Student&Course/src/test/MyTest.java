package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javastudy.Course;
import javastudy.CourseMapper;
import javastudy.Student;
import javastudy.StudentCourse;
import javastudy.StudentCourseMapper;
import javastudy.StudentMapper;
import utility.MyBatisUtils;

public class MyTest {

	@Test
	public void testGetStudent() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student student = studentMapper.get(2);
		System.out.println(student);
		session.close();
	}
	
	@Test
	public void testGetCourse() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		CourseMapper courseMapper = session.getMapper(CourseMapper.class);
		Course course = courseMapper.get(4);
		System.out.println(course);
		session.close();
	}
	
	@Test
	public void testAdd() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		StudentCourseMapper mapper = session.getMapper(StudentCourseMapper.class);
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		CourseMapper courseMapper = session.getMapper(CourseMapper.class);
		
		//建立2号学生和4号课程的联系
		StudentCourse sc = new StudentCourse();
		sc.setStudent(studentMapper.get(2));
		sc.setCourse(courseMapper.get(4));
		mapper.add(sc);
		
		//建立2号学生和5号课程的联系
		sc = new StudentCourse();
		sc.setStudent(studentMapper.get(2));
		sc.setCourse(courseMapper.get(5));
		mapper.add(sc);
		
		session.commit();
		session.close();
	}
	
	@Test
	public void testDelete() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		StudentCourseMapper mapper = session.getMapper(StudentCourseMapper.class);
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		CourseMapper courseMapper = session.getMapper(CourseMapper.class);
		
		//删除2号学生和4号课程的联系
		StudentCourse sc = new StudentCourse();
		sc.setStudent(studentMapper.get(2));
		sc.setCourse(courseMapper.get(4));
		mapper.delete(sc);
		
		session.commit();
		session.close();
	}

}
