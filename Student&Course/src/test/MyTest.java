package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javastudy.Course;
import javastudy.CourseMapper;
import javastudy.Student;
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

}
