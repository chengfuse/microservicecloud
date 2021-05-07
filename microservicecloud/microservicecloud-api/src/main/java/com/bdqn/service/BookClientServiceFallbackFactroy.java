package com.bdqn.service;

import com.bdqn.entity.Book;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookClientServiceFallbackFactroy implements FallbackFactory<BookClientService> {
    @Override
    public BookClientService create(Throwable throwable) {

        return new BookClientService() {
            @Override
            public Book getBookById(int bid) {
                Book book=new Book();
                book.setBid(bid);
                book.setBname("该ID："+bid+"没有没有对应的信息,Consumer客户端提供的降级信息，此刻服务Provider已经关闭");
                book.setData_source("no this database in mysql");
                return book;
            }

            @Override
            public List<Book> listBook() {

                return null;
            }

            @Override
            public boolean addBook(Book book) {
                return false;
            }
        };
    }
}
