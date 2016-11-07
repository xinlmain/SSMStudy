package controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDAO;
import entity.User;

@Controller
public class UserController {
	
	UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Resource
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@RequestMapping("/check.do")
	public String check(HttpSession session, User user) throws IOException {
		
		String path = "login";
		
		if (userDAO.isValid(user)) {
			session.setAttribute("name", user.getName());
			path = "welcome";
		}
		//通过跳转方式，视图解析器不起作用
		//return "redirect:" + path;
		return path;
	}


}
