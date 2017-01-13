package com.niit.GuiterShoppingCartbackend.dao;

import java.util.List;

import com.niit.GuiterShoppingCartbackend.model.Product;

public interface ProductDao {
	public  List<Product> getAll();
	public  Product getById(int productid); //returns one category object from the database  
public  void insert(Product product);
	
	public  void update(Product product);
	
	public  void delete(int id );
	
	
	
	

}
