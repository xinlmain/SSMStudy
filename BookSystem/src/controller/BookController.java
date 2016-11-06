package controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.BookDAO;
import entity.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping("/get.do")
	@ResponseBody
	public List<Book> find(String pattern) throws IOException {
		BookDAO dao = new BookDAO();
		List<Book> list = dao.find("%" + pattern + "%");
		return list;		
	}
}
