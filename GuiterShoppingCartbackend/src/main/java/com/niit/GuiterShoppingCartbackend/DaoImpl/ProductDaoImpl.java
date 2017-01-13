package com.niit.GuiterShoppingCartbackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.GuiterShoppingCartbackend.dao.ProductDao;
import com.niit.GuiterShoppingCartbackend.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public List<Product> getAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Product").list();
	}

	public Product getById(int var) {
		return sessionFactory.getCurrentSession().get(Product.class, var);
	}

	public void insert(Product product) {

		sessionFactory.getCurrentSession().persist(product);
	}

	public void update(Product product) {
		sessionFactory.getCurrentSession().update(product);
		
	}

	public void delete(int i) {
		sessionFactory.getCurrentSession().delete(getById(i));
		
	}
	

	
}
