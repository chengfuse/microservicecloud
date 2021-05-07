package com.bdqn.service;

import com.bdqn.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(int id);
    User getUserByUserNameAndPassWord(User user);
    int addUser(User user);
    int updataUser(User user);
}
