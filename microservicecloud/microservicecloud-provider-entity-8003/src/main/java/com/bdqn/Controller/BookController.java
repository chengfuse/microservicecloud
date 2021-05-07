package com.bdqn.Controller;

import com.bdqn.entity.Book;
import com.bdqn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {
	@Autowired
	@Resource
	private BookService bookService;
	
	@RequestMapping(value = "/getbooks",method = RequestMethod
			.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @RequestMapping(value = "/getbook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBook(@PathVariable int bid){
        return bookService.getBookById(bid);
    }
    @RequestMapping(value = "/addbook/",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int addBook(@PathVariable Book book){
        return bookService.addBook(book);
    }
    @RequestMapping(value = "/updatebook/",method = RequestMethod.GET,
                   produces = MediaType.APPLICATION_JSON_VALUE)
    public int updateBook(@PathVariable Book book){
        return bookService.updateBook(book);
    }
    @RequestMapping(value = "/reomvebook/",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int reomveBook(@PathVariable int bid){
        return bookService.removeBoodById(bid);
    }
}
