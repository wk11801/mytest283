package com.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pojo.User;
import com.springboot.service.UserService;

@RestController
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("user")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	
}
