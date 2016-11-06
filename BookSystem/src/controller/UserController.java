package controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import dao.UserDAO;
import entity.User;

@Controller
public class UserController {
	
	@RequestMapping("/check.do")
	public String check(HttpSession session, User user) throws IOException {
		
		String path = "login";
		UserDAO dao = new UserDAO();
		if (dao.isValid(user)) {
			session.setAttribute("name", user.getName());
			path = "welcome";
		}
		//通过跳转方式，视图解析器不起作用
		//return "redirect:" + path;
		return path;
	}


}
