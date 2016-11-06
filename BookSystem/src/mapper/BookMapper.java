package mapper;

import java.util.ArrayList;

import entity.Book;

public interface BookMapper {
	
	public ArrayList<Book> find(String pattern);
}
