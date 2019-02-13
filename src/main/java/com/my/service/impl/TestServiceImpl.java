package com.my.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.dao.TestDao;
import com.my.model.BaseTest;
import com.my.service.TestService;

@Service(("testService"))
public class TestServiceImpl implements TestService {

	@Resource
	TestDao testDao;
	
	@Override
	public BaseTest getTestById(int testId) {
		// TODO Auto-generated method stub
		return testDao.getTestById(testId);
	}

}
