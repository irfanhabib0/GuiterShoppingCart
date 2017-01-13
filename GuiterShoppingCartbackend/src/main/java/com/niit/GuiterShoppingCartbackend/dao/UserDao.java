package com.niit.GuiterShoppingCartbackend.dao;

import java.util.List;

import com.niit.GuiterShoppingCartbackend.model.User;

public interface UserDao {
	public void insert (User user);
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public List<User> getAll();
	

}
