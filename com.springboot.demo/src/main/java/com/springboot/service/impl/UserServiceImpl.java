package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;
import com.springboot.pojo.User;
import com.springboot.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findAll() {
		List<User> list = this.userDao.findAll();
		return list;
	}

}
