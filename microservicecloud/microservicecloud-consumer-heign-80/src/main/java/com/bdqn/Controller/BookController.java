package com.bdqn.Controller;

import com.bdqn.entity.Book;

import com.bdqn.service.BookClientService;
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
    private BookClientService service;

    @RequestMapping(value = "/consumer/getbook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookById(@PathVariable  int bid){
        return service.getBookById(bid);
    }
    @RequestMapping(value = "/consumer/getbooks",method =RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> listBook(){
        return service.listBook();
    }
    @RequestMapping(value = "/consumer/addbook",method =RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean addBook(Book book){
        return service.addBook(book);
    }
}
