package dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import entity.User;
import mapper.UserMapper;
import utility.MyBatisUtils;

public class UserDAO {
	public boolean isValid(User user) throws IOException {
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		boolean flag = false;
		if (mapper.doesExist(user) == 1) {
			flag = true;
		}
		session.close();
		return flag;
	}
}
