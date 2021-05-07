package com.bdqn.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bdqn.entity.User;
import com.bdqn.service.UserService;

@RestController
public class UserController {
	@Autowired
	@Resource
	private UserService userService;
	@Autowired
	private DiscoveryClient client;
	@RequestMapping(value = "/getusers",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @RequestMapping(value = "/getuser/{id}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable int id){
        return userService.getUserById(id);
    }
    @RequestMapping(value = "/getuserlogin",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserLogin(@PathVariable User user){
        return userService.getUserByUserNameAndPassWord(user);
    }
    @RequestMapping(value = "/updateuser",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int updateUser(@PathVariable User user){
        return userService.updataUser(user);
    }
    @RequestMapping(value = "/adduser",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int addUser(@PathVariable User user){
        return userService.addUser(user);
    }


}
