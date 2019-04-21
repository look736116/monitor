package com.my.service;

import java.util.List;

import com.my.model.User;

public interface UserService {

	// 添加新用户
	public User addUser(User user);

	// 检查用户名是否存在
	public boolean checkUserName(String userName);
	
	//获取所有用户
	public List<User> getAllUsers();
	
	//调用存储过程	
	public String callProcedure();
	
	
}
