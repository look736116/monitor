package com.my.dao.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.my.dao.TestDao;
import com.my.model.BaseTest;

@Transactional
@Repository("testDao")
public class TestDaoImpl implements TestDao {
	
	@Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

	@Override
	public BaseTest getTestById(int testId) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();		
		BaseTest bt = (BaseTest) session.load(BaseTest.class, 0);
		
		return bt;
	}

}
