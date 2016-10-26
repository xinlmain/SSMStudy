package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javastudy.User;
import javastudy.UserMapper;
import utility.MyBatisUtils;

public class MapperTest {

	@Test
	public void testSelectAll() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectAll();
		System.out.println(list);
		session.close();
	}
	
	@Test
	public void testSelectUser() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectUser(1);
		System.out.println(user);
		session.close();
	}
	
	@Test
	public void testAddUser() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setUserName("Ã«Ôó¶«");
		user.setUserPwd("1212");
		mapper.addUser(user);
		session.commit();
		session.close();
	}
	
	@Test
	public void testUpdateUser() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setId(4);
		user.setUserName("ÖÜ¶÷À´");
		user.setUserPwd("hello");
		mapper.updateUser(user);
		session.commit();
		session.close();
	}
	
	@Test
	public void testDeleteUser() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.deleteUser(4);
		session.commit();
		session.close();
	}

}
