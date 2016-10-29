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
		student.setName("���»�");
		student.setGrade("���꼶");
		student.setPhone("12325566");
		student.setPwd("abc");		
		student.setSex("��");
		studentMapper.add(student);
		
		session.commit();
		
		ContactMapper contactMapper = session.getMapper(ContactMapper.class);
		Contact contact = new Contact();
		contact.setName("����ٻ");
		contact.setPhone("8757689");
		contact.setRelation("����");
		contact.setStudent(student);
		contact.setSex("Ů");
		contactMapper.add(contact);
		session.commit();
		session.close();
	}

}
