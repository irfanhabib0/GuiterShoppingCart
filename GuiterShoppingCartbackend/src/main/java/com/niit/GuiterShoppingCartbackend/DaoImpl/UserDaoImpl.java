package com.niit.GuiterShoppingCartbackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.GuiterShoppingCartbackend.dao.UserDao;
import com.niit.GuiterShoppingCartbackend.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	
    @Transactional
	public void insert(User user) {
    	sessionFactory.getCurrentSession().persist(user);
		// TODO Auto-generated method stub
		
	}
    @Transactional
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}
    @Transactional
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}
    @Transactional
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
    @Transactional
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
