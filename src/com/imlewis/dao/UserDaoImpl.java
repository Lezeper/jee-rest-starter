package com.imlewis.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imlewis.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUserById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM User WHERE userId=?");
		query.setInteger(0, id);
		return (User)query.uniqueResult();
	}

	@Override
	public void saveOrUpdateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		session.flush();
	}

	@Override
	public void deleteUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);
		session.flush();
	}

	@Override
	public List<User> getAllUser() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM User");
		return query.list();
	}

}
