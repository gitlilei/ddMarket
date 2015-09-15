package com.dingdong.daoImp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dingdong.dao.AdminMapper;
import com.dingdong.dao.ItemMapper;
import com.dingdong.mybatis.MybatisUtil;
import com.dingdong.pojo.Admin;
import com.dingdong.pojo.Item;

public class ItemMapperlmp implements ItemMapper{

	private SqlSessionFactory sqlSessionFactory =  MybatisUtil.getSessionFactory();
	public int addItem(Item item) {
		SqlSession session =  sqlSessionFactory.openSession();
		ItemMapper itemMapper = session.getMapper(ItemMapper.class);
		int result = itemMapper.addItem(item);
		session.commit();
		session.close();
		return result;
	}

	@Override
	public boolean updateItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItem(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Item findItemByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findItemsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findItemsByClassifyID(String classifyID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findItemsByName(String name, String orderMethod) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
