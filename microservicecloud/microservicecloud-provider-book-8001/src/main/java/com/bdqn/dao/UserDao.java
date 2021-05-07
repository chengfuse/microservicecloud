package com.bdqn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bdqn.entity.User;

public interface UserDao {
	 	@Select("select * from user")
	    List<User> getUsers();
	    @Select("select * from user where id=#{id}")
	    User getUserById(int id);
	    @Select("select * from user where username=#{username} and password={password}")
	    User getUserByUserNameAndPassWord(User user);
	    @Insert("insert into user values(null,#{username},#{password})")
	    int addUser(User user);
	    @Update("Updata user set username=#{username},password=#{password} where id=#{id} ")
	    int updataUser(User user);
}
