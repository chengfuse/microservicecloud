package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.User;

public interface UserService {
    List<User> getUsers();
    User getUserById(int id);
    User getUserByUserNameAndPassWord(User user);
    int addUser(User user);
    int updataUser(User user);
}
