package com.bdqn.service;

import com.bdqn.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@FeignClient(value ="MICROSERVICECLOUD-BOOK",fallbackFactory = BookClientServiceFallbackFactroy.class)
public interface BookClientService {
    @RequestMapping(value = "/getbook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookById(@PathVariable int bid);
    @RequestMapping(value = "/getbooks",method =RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> listBook();
    @RequestMapping(value = "/addbook",method =RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean addBook(Book book);
}
