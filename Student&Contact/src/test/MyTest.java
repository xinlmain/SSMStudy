package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javastudy.Contact;
import javastudy.ContactMapper;
import javastudy.Student;
import javastudy.StudentMapper;
import utility.MyBatisUtils;

public class MyTest {

	@Test
	public void testAdd() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student student = new Student();
		student.setName("刘德华");
		student.setGrade("二年级");
		student.setPhone("12325566");
		student.setPwd("abc");		
		student.setSex("男");
		studentMapper.add(student);
		
		ContactMapper contactMapper = session.getMapper(ContactMapper.class);
		Contact contact = new Contact();
		contact.setName("朱丽倩");
		contact.setPhone("8757689");
		contact.setRelation("夫妻");
		contact.setStudent(student);
		contact.setSex("女");
		contactMapper.add(contact);
		session.commit();
		session.close();
	}

	@Test
	public void testSelect() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student student = studentMapper.get(8);
		System.out.println(student.getContact());
		
		ContactMapper contactMapper = session.getMapper(ContactMapper.class);
		Contact contact = contactMapper.get(1);
		System.out.println(contact);
		session.close();
	}
	
	@Test
	public void testDelete() throws IOException {
		SqlSession session = MyBatisUtils.openSession();		
		ContactMapper contactMapper = session.getMapper(ContactMapper.class);
		contactMapper.delete(5);
		
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		studentMapper.delete(14);
		session.commit();
		session.close();
	}
	
	@Test
	public void testUpdate() throws IOException {
		SqlSession session = MyBatisUtils.openSession();		
		ContactMapper contactMapper = session.getMapper(ContactMapper.class);
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//		Contact contact = new Contact();
//		contact.setId(7);
//		contact.setName("孙俪");
//		contact.setSex("女");
//		contactMapper.update1(contact);

		Contact contact = new Contact();
		contact.setId(7);
		contact.setStudent(studentMapper.get(16));
		
		contactMapper.update2(contact);
		session.commit();
		session.close();
	}
}
