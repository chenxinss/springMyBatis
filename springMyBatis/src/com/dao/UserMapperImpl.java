package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.User;

public class UserMapperImpl implements UserMapper {

	private SqlSessionTemplate sqlSession;
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(UserMapper.class).getUserList(user);
	}

}
