package com.bdqn.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.dao.BookDao;
import com.bdqn.entity.Book;
import com.bdqn.service.BookService;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	@Resource
	private BookDao bookDao;

	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.getBooks();
	}

	public Book getBookById(int bid) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(bid);
	}

	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}

	public int removeBoodById(int bid) {
		// TODO Auto-generated method stub
		return bookDao.removeBoodById(bid);
	}

	public int addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}

}
