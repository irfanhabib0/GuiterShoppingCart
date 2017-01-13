package com.niit.GuiterShoppingCartbackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.GuiterShoppingCartbackend.dao.SupplierDao;
import com.niit.GuiterShoppingCartbackend.model.Supplier;
@Repository
@Transactional
public class SupplierDaoImpl implements SupplierDao{
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Supplier supplier) {
		sessionFactory.getCurrentSession().persist(supplier);
		// TODO Auto-generated method stub
		
	}

	public void update(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}

	public Supplier search(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Supplier> getSupplier() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
