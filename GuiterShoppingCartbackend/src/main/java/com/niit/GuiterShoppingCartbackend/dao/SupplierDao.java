package com.niit.GuiterShoppingCartbackend.dao;

import java.util.List;

import com.niit.GuiterShoppingCartbackend.model.Supplier;

public interface SupplierDao {
public  void save(Supplier supplier);
	
	public  void update(Supplier supplier);
	
	public  void delete(Supplier supplier);
	
	public  Supplier search(String id); //returns one category object from the database  
	
	public  List<Supplier> getSupplier(); //returns list of category objects

}
