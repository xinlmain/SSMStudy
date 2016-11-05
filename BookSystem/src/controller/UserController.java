package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	 @RequestMapping("/check.do")
	public String check(HttpSession session, String name, String pwd) {
		String path = "login.jsp";
		if ("zhang".equals(name)) {
			session.setAttribute("name", name);
			path = "welcome.jsp";
		}
		return "redirect:" + path;
	}
}
