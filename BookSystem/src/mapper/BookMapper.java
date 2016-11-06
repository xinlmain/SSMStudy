package mapper;

import java.util.List;

import entity.Book;

public interface BookMapper {
	
	public List<Book> find(String pattern);
}
