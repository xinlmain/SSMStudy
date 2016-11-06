package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import entity.Book;
import mapper.BookMapper;
import utility.MyBatisUtils;

public class BookDAO {

	public List<Book> find(String pattern) throws IOException {
		
		SqlSession session = MyBatisUtils.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> list = mapper.find(pattern);
		session.close();
		return list;
	}
}
