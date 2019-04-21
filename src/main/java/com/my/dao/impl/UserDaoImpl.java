package com.my.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.SessionFactoryUtils;
import org.springframework.stereotype.Repository;

import com.my.dao.UserDao;
import com.my.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

	@Override
	@Transactional
	public User addUser(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return user;
	}

	@Override
	public boolean checkUserName(String userName) {
		// TODO Auto-generated method stub
		boolean exist = false;
		Session session = sessionFactory.getCurrentSession();		
		Criteria criteria = session.createCriteria(User.class);
		List<User> users = criteria.list();
		if(userName!= null && userName.length()>0){
			if(users!=null || users.size() >0){
				for (User user : users) {
					if(userName.equals(user.getUserName())){
						exist = true;
					}
				}
			}			
		}
		
		
		return exist;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = null;
		Session session =sessionFactory.getCurrentSession();
		//标准查询
		//Criteria criteria =session.createCriteria(User.class);
		
		 //sql 查询
		 //String sql = "SELECT * FROM tbl_user where user_type =:user_type";//或者 user_type =？1
		 //Query query = session.createSQLQuery(sql).addEntity(User.class);
		 //query.setString("user_type", "U");
		 //users = query.list();
		
		//hql查询
		String hql =" FROM User u where u.userType =?1";
		Query query = session.createQuery(hql);
		query.setString("1", "U");
		
		
		
		return query.list();
	}

	@Override
	@Transactional
	public String callProcedure() {
		// TODO Auto-generated method stub
		String sql = "{CALL PRO_TEST(?,?,?)}";
		Connection con = null;
		CallableStatement cs = null;
		String flag = "0";
		try {
			con = SessionFactoryUtils.getDataSource(sessionFactory).getConnection();
			cs = con.prepareCall(sql);
			cs.setInt(1, 1);
			cs.setString(2,"55");  
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.execute();
			if(!cs.getMoreResults()){
				flag = cs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
