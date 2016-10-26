package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javastudy.User;
import utility.MyBatisUtils;

public class MyTest {

	@Test
	public void test() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		String statement = "javastudy.UserMapper.selectUser";
		User user = session.selectOne(statement, 1);
		System.out.println(user);
		session.close();
	}
	
	@Test
	public void testAll() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		String statement = "javastudy.UserMapper.selectAll";
		List<User> list = session.selectList(statement);
		System.out.println(list);
		session.close();
	}

	@Test
	public void testInsert() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		String statement = "javastudy.UserMapper.addUser";
		User user = new User();
		user.setUserName("刘德华");
		user.setUserPwd("12345678");
		session.insert(statement, user);
		session.commit();
		session.close();
	}
	
	@Test
	public void testUpdate() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		String statement = "javastudy.UserMapper.updateUser";
		User user = new User();
		user.setId(3);
		user.setUserName("周润发");
		user.setUserPwd("888");
		session.update(statement, user);
		session.commit();
		session.close();
	}

	@Test
	public void testDelete() throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		String statement = "javastudy.UserMapper.deleteUser";
		session.delete(statement, 2);
		session.commit();
		session.close();
	}
}
