package com.imlewis.dao;

import java.util.List;

import com.imlewis.model.User;

public interface UserDao {
	
	List<User> getAllUser();
	
	User getUserById(int id);
	
	void saveOrUpdateUser(User user);
	
	void deleteUser(User user);
}
