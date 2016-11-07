package dao;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import entity.User;
import mapper.UserMapper;

@Component
public class UserDAO {
	
	UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public boolean isValid(User user) throws IOException {

		boolean flag = false;
		if (userMapper.doesExist(user) == 1) {
			flag = true;
		}
		return flag;
	}
}
