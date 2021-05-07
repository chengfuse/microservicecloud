package com.bdqn.dao;

import java.util.List;

import com.bdqn.entity.Book;
import com.bdqn.entity.User;
import org.apache.ibatis.annotations.*;


public interface BookDao {
	@Select("select * from book")
    @Results(value = {
            @Result(id=true,column = "bid",property = "bid"),
            @Result(column = "bname",property = "bname"),
            @Result(column = "price",property = "price"),
            @Result(column = "createTime",property = "createTime"),
            @Result(column = "data_source",property = "data_source"),
            @Result(property = "user",column = "uid",javaType = User.class,
                    one = @One(select = "com.bdqn.dao.UserDao.getUserById"))
    })
    List<Book> getBooks();
    @Select("select * from book where bid=#{bid}")
    Book getBookById(int bid);
    @Update("update book set bname=#{bname},price=#{price},createTime=#{creatTime} where bid=#{bid}")
    int updateBook(Book book);
    @Delete("delect fomr book where bid=#{bid}")
    int removeBoodById(int bid);
    @Insert("insert into book values(null,#{bname},#{uid},#{price},#{createTime})")
    int addBook(Book book);
}
