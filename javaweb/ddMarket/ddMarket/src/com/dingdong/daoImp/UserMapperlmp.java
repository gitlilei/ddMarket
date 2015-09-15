package com.dingdong.daoImp;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dingdong.dao.UserMapper;
import com.dingdong.mybatis.MybatisUtil;
import com.dingdong.pojo.User;
public class UserMapperlmp {

	
	public User login(Map<String,String> map) {
		// TODO Auto-generated method stub
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.login(map);
		sqlSession.commit();
		sqlSession.close();
		return user;
	}

	
	public int insert(User u) {
		// TODO Auto-generated method stub
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int result = userMapper.insert(u);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	
	public int update(User u) {
		// TODO Auto-generated method stub
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int result = userMapper.update(u);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

}
