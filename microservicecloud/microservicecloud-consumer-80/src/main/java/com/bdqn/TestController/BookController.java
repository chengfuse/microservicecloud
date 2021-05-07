package com.bdqn.TestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bdqn.entity.Book;

@RestController
public class BookController {
	private final static String REST_URL_PREFIX="http://MICROSERVICECLOUD-BOOK";
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/consumer/getbooks",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBooks(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/getbooks", List.class);
    }
    @RequestMapping(value = "/consumer/getbook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBook(@PathVariable int bid){
        return restTemplate.getForObject(REST_URL_PREFIX+"/getbook/"+bid, Book.class);
    }
    @RequestMapping(value = "/consumer/addbook",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int addBook(@PathVariable Book book){
        return restTemplate.patchForObject(REST_URL_PREFIX+"/addbook", book, Integer.class);
    }
    @RequestMapping(value = "/consumer/updatebook",method = RequestMethod.GET,
                   produces = MediaType.APPLICATION_JSON_VALUE)
    public int updateBook(@PathVariable Book book){
        return restTemplate.patchForObject(REST_URL_PREFIX+"/updatebook", book, Integer.class);
    }
    @RequestMapping(value = "/consumer/reomvebook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int reomveBook(@PathVariable int bid){
        return restTemplate.getForObject(REST_URL_PREFIX+"/reomvebook"+bid, Integer.class);
    }
	
}
