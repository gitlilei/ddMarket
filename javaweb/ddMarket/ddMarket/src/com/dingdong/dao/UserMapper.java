package com.dingdong.dao;

import java.util.Map;

import com.dingdong.pojo.User;

public interface UserMapper {
	
	public User login(Map<String,String> map);
	
	public int insert(User u);
	
	public int update(User u);
}