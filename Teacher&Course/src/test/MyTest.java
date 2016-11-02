package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javastudy.Course;
import javastudy.CourseMapper;
import javastudy.Teacher;
import javastudy.TeacherMapper;
import utility.MyBatisUtils;

public class MyTest {

	@Test
	public void testAdd() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
		CourseMapper courseMapper = session.getMapper(CourseMapper.class);
		
		Teacher teacher = new Teacher();
		teacher.setName("谭浩强");
		teacher.setSex("男");
		teacher.setPhone("13908765429");
		teacherMapper.add(teacher);
		
		Course course = new Course();
		course.setName("C语言入门教程");
		course.setType("考查课");
		course.setHours(30);
		course.setTeacher(teacher);
		courseMapper.add(course);
		
		course = new Course();
		course.setName("Java基础");
		course.setType("考试课");
		course.setHours(50);
		course.setTeacher(teacher);
		courseMapper.add(course);
		
		session.commit();
		session.close();
	}
	
	@Test
	public void testGetCourse() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		CourseMapper courseMapper = session.getMapper(CourseMapper.class);
		Course course = courseMapper.get(5);
		System.out.println(course);
		session.close();
	}
	
	@Test
	public void testGetTeacher() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
		Teacher teacher = teacherMapper.get(3);
		System.out.println(teacher);
		session.close();
	}
	

}
