package com.springboot.service;

import java.util.List;

import com.springboot.pojo.User;

public interface UserService {
	List<User> findAll();
}
