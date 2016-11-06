package dao;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import entity.Book;
import mapper.BookMapper;
import utility.MyBatisUtils;

public class BookDAO {

	public ArrayList<Book> find(String pattern) throws IOException {
		
		SqlSession session = MyBatisUtils.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		ArrayList<Book> list = mapper.find(pattern);
		session.close();
		return list;
	}
}
