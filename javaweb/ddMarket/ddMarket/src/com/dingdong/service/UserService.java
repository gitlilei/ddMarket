package com.dingdong.service;

import java.util.HashMap;
import java.util.Map;

import com.dingdong.daoImp.UserMapperlmp;
import com.dingdong.pojo.User;

public class UserService {
	/**
	 * 登录，验证密码
	 * @param name
	 * @param psw
	 * @return
	 */
	public int login(String name,String psw){
		UserMapperlmp userMapperlmp = new UserMapperlmp();
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", name);
		map.put("psw", psw);
		 User user = userMapperlmp.login(map);
		 if (user.getPassword().equals(psw)) {
			 return 1;
		 }
		 return 0;
	}
	/**
	 *注册
	 * @param u
	 * @return
	 */
	public boolean register(User u){
		UserMapperlmp userMapperlmp = new UserMapperlmp();
		int result = userMapperlmp.insert(u);
		if (result != 0) {
			return true;
		}
		return false;
	}
	/**
	 * 更新用户信息
	 * @param u
	 * @return
	 */
	public boolean update(User u){
		UserMapperlmp userMapperlmp = new UserMapperlmp();
		int result = userMapperlmp.update(u);
		if (result != 0) {
			return true;
		}
		return false;
	}
	
	

}
