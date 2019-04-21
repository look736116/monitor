package com.my.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.dao.UserDao;
import com.my.model.User;
import com.my.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	@Resource
	UserDao userDao;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public boolean checkUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.checkUserName(userName);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	@Override
	public String callProcedure() {
		// TODO Auto-generated method stub
		return userDao.callProcedure();
	}

}
