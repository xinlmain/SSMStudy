package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;

@Controller
public class UserController {
	
	 @RequestMapping("/check.do")
	public String check(HttpSession session, User user) {
		String path = "login.jsp";
		if ("zhang".equals(user.getName())) {
			session.setAttribute("name", user.getName());
			path = "welcome.jsp";
		}
		return "redirect:" + path;
	}
}
