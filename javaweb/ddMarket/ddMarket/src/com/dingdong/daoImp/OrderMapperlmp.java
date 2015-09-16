package com.dingdong.daoImp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dingdong.dao.OrderMapper;
import com.dingdong.dao.ReceiverMapper;
import com.dingdong.mybatis.MybatisUtil;
import com.dingdong.pojo.Order;

public class OrderMapperlmp {

	public boolean createOrder(Order Order) {
		boolean isAdd = false;
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		isAdd = orderMapper.createOrder(Order);
		sqlSession.commit();
		sqlSession.close();
		return isAdd;
	}

	public boolean updateOrder(Order Order) {
		boolean isUpdate = false;
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		isUpdate = orderMapper.updateOrder(Order);
		sqlSession.commit();
		sqlSession.close();
		return isUpdate;
	}

	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * 通过订单号查找订单信息
	 * @param id
	 * @return
	 */
	public Order findOrderByID(int id) {
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		Order order = orderMapper.findOrderByID(id);
		sqlSession.commit();
		sqlSession.close();
		return order;
	}
	//FDF
	/**
	 * 通过用户id查找订单信息
	 * @param userID
	 * @return
	 */
	public List<?> findOrdersByUserID(int userID) {
		List<Order> list = new ArrayList<Order>();
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
	    list = (List<Order>) orderMapper.findOrdersByUserID(userID);
		sqlSession.commit();
		sqlSession.close();
		return list;
	}

	public List<?> findOrdersByUserID(int userID, Date startDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<?> findOrdersByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
