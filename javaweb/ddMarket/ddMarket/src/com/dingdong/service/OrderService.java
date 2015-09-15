package com.dingdong.service;

import java.util.Date;
import java.util.List;

import com.dingdong.dao.OrderMapper;
import com.dingdong.daoImp.OrderMapperlmp;
import com.dingdong.pojo.Order;

public class OrderService {

	/**
	 * 创建订单
	 * @param Order
	 * @return
	 */
	public boolean createOrder(Order Order){
		OrderMapperlmp orderMapperlmp = new OrderMapperlmp();
		return orderMapperlmp.createOrder(Order);
	}
	
	/**
	 * 根据订单id更新订单信息
	 * @param Order
	 * @return
	 */
	public boolean updateOrder(Order Order){
		OrderMapperlmp orderMapperlmp = new OrderMapperlmp();
		return orderMapperlmp.updateOrder(Order);
	}
	
	/**
	 * 根据订单id删除订单
	 * @param id
	 * @return
	 */
	public boolean deleteOrder(String id){
		return false;
	}
	
	/**
	 * 根据订单id号查找订单
	 * @param id
	 * @return
	 */
	public Order findOrderByID(String id){
		OrderMapperlmp orderMapperlmp = new OrderMapperlmp();
		return orderMapperlmp.findOrderByID(Integer.parseInt(id));
	}
	
	/**
	 * 根据用户id查找订单信息
	 * @param userID
	 * @return
	 */
	public List<?> findOrdersByUserID(String userID){
		OrderMapperlmp orderMapperlmp = new OrderMapperlmp();
		return orderMapperlmp.findOrdersByUserID(Integer.parseInt(userID));
	}
	
	/**
	 * 
	 * @param userID
	 * @param startDate 查看startDate 到今日，该用户的所有订单
	 * @return
	 */
	public List<?> findOrdersByUserID(String userID,Date startDate){
		return null;
	}
	
	//管理员用
	public List<?> findOrdersByDate(Date date){
		return null;
	}
	
	
	
	

}
