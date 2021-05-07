package com.bdqn.Controller;

import com.bdqn.entity.Book;
import com.bdqn.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
	
	@RequestMapping(value = "/getbooks",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @RequestMapping(value = "/getbook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Book getBook(@PathVariable int bid){
	    Book book=bookService.getBookById(bid);
	    if(book==null){
            throw new RuntimeException("该ID："+bid+"没有没有对应的信息");
        }
	    return book;
    }
    @RequestMapping(value = "/addbook",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int addBook(@PathVariable Book book){
        return bookService.addBook(book);
    }
    @RequestMapping(value = "/updatebook",method = RequestMethod.GET,
                   produces = MediaType.APPLICATION_JSON_VALUE)
    public int updateBook(@PathVariable Book book){
        return bookService.updateBook(book);
    }
    @RequestMapping(value = "/reomvebook",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int reomveBook(@PathVariable int bid){
        return bookService.removeBoodById(bid);
    }

    public Book processHystrix_Get(@PathVariable  int bid){
	    Book book=new Book();
	    book.setBid(bid);
	    book.setBname("该ID："+bid+"没有没有对应的信息,null---HystrixCommand");
	    book.setData_source("no this database in mysql ");
        return book;
    }
}
