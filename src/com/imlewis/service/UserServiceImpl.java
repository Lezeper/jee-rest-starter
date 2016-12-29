package com.imlewis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imlewis.dao.UserDao;
import com.imlewis.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	public void createUser(User user) {
		userDao.saveOrUpdateUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.saveOrUpdateUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}
}
