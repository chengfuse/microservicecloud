package com.bdqn.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.dao.UserDao;
import com.bdqn.entity.User;
import com.bdqn.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	@Resource
	private UserDao userDao;

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	public User getUserByUserNameAndPassWord(User user) {
		// TODO Auto-generated method stub
		return userDao.getUserByUserNameAndPassWord(user);
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	public int updataUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updataUser(user);
	}

}
