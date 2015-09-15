package com.dingdong.test;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.dingdong.pojo.Order;
import com.dingdong.service.OrderService;

public class OrderTest {
	/**
	 * 创建订单测试
	 */
	@Test
	public void createOrderTest(){
		Order order = new Order();
		order.setExpressinfo("what");
		order.setOrderstates(100);
		order.setOrdertime(new Date());
		order.setReceiverId(2);
		order.setTotalamount(100L);
		order.setUserId(2);
		OrderService orderService = new OrderService();
		orderService.createOrder(order);
	}
	
	/**
	 * 更新订单测试
	 */
	@Test
	public void updateOrderTest(){
		Order order = new Order();
		order.setExpressinfo("发货");
		order.setOrderstates(100);
		order.setOrdertime(new Date());
		order.setReceiverId(2);
		order.setTotalamount(100L);
		order.setUserId(2);
		order.setOrderId(1);
		OrderService orderService = new OrderService();
		orderService.updateOrder(order);
	}
	
	/**
	 * 通过订单号查找订单
	 */
	@Test
	public void findOrderByIDTest(){
		OrderService orderService = new OrderService();
		Order order = orderService.findOrderByID("1");
		System.out.println(order.getOrderstates());
	}
}
