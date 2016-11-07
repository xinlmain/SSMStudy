package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.BookDAO;
import entity.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	
	BookDAO bookDAO;
		
	public BookDAO getBookDAO() {
		return bookDAO;
	}

	@Resource
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@RequestMapping("/get.do")
	@ResponseBody
	public ArrayList<Book> find(String pattern) throws IOException {
		ArrayList<Book> list = bookDAO.find("%" + pattern + "%");
		return list;		
	}
}
