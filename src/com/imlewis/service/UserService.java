package com.imlewis.service;

import java.util.List;

import com.imlewis.model.User;

public interface UserService {
	
	List<User> getAllUser();
	
	User getUserById(int id);
	
	void createUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(User user);
	
}
