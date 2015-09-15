package com.dingdong.dao;

import java.util.Date;
import java.util.List;

import com.dingdong.pojo.Order;

public interface OrderMapper {
	public boolean createOrder(Order Order);
	

	public boolean updateOrder(Order Order);
	
	
	public boolean deleteOrder(int id);
	
	
	//花式查询
	public Order findOrderByID(int id);
	
	public List<?> findOrdersByUserID(int userID);
	/**
	 * 
	 * @param userID
	 * @param startDate 查看startDate 到今日，该用户的所有订单
	 * @return
	 */
	public List<?> findOrdersByUserID(int userID,Date startDate);
	
	//管理员用
	public List<?> findOrdersByDate(Date date);
}