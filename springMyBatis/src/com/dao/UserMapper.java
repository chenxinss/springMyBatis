package com.dao;

import java.util.List;

import com.pojo.User;

public interface UserMapper {
	/**
	 * 查询用户列表(参数：对象入参)
	 * 
	 * @return
	 */
	public List<User> getUserList(User user);
}
