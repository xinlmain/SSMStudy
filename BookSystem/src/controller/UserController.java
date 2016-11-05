package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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

	@RequestMapping("/check1.do")
	public ModelAndView check1(User user, HttpSession session) {

		String path = "login.jsp";
		if ("zhang".equals(user.getName())) {
			path = "welcome.jsp";
			session.setAttribute("name", user.getName());
		}
		ModelAndView mav = new ModelAndView(new RedirectView(path));
		// 通过下面这种方式可以在容器内跳转时传递数据
		// mav.addObject("name", user.getName());
		return mav;
	}
}
