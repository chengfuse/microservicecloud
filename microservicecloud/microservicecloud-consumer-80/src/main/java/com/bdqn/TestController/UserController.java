package com.bdqn.TestController;

import java.util.List;

import com.bdqn.util.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bdqn.entity.User;

import javax.annotation.Resource;

@RestController
//@RibbonClient(name = "mincroservicecloud-entity", configuration = ConfigBean.class)
public class UserController {
	private final static String REST_URL_PREFIX="http://MICROSERVICECLOUD-BOOK";
	@Autowired
	private RestTemplate restTemplate;
	
	 @RequestMapping(value = "consumer/showuser/{id}",method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(int id) {
		return restTemplate.getForObject(REST_URL_PREFIX+"/getuser"+id, User.class);
	}
	 @RequestMapping(value = "consumer/showusers",method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/getusers", List.class);
	}
	 @RequestMapping(value = "consumer/loginuser",method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserByPassWordAndUserName(User user) {
		return restTemplate.patchForObject(REST_URL_PREFIX+"/getuserlogin", user, User.class);
	}
	 @RequestMapping(value = "consumer/addusers",method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	public int addUser(User user) {
		return restTemplate.patchForObject(REST_URL_PREFIX+"adduser", user, Integer.class);
	}
	 @RequestMapping(value = "consumer/updateusers",method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	public int updateUser(User user) {
		return restTemplate.patchForObject(REST_URL_PREFIX+"updateuser", user, Integer.class);
	}
}
