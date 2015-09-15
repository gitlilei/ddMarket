package com.dingdong.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dingdong.pojo.User;
import com.dingdong.service.UserService;

public class UserTest {

	@Test
	public void InsertTest() {
		User user = new User();
		user.setCredit(100);
		user.setEmail("865618222@qq.com");
		user.setName("aha");
		user.setPassword("123456");
		user.setStatus(3);
		user.setTelephone("2222222");
		UserService userService = new UserService();
		userService.register(user);
	}
	@Test
	public void loginTest() {
		String name = "aha";
		String psw = "123456";
		UserService userService = new UserService();
		int result = userService.login(name, psw);
		System.out.println(result);
	}
	@Test
	public void updateTest(){
		User user = new User();
		user.setUserId(2);
		user.setCredit(100);
		user.setEmail("865618222@qq.com");
		user.setName("ahafdsfs");
		user.setPassword("123456");
		user.setStatus(3);
		user.setTelephone("3333333");
		UserService userService = new UserService();
		userService.update(user);
	}
}
