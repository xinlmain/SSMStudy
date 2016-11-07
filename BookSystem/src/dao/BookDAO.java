package dao;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import entity.Book;
import mapper.BookMapper;

@Component
public class BookDAO {

	BookMapper bookMapper;
	
	public BookMapper getBookMapper() {
		return bookMapper;
	}

	@Resource
	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	public ArrayList<Book> find(String pattern) throws IOException {
		
		ArrayList<Book> list = bookMapper.find(pattern);
		return list;
	}
}
