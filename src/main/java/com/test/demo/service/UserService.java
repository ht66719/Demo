package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.User;
import com.test.demo.repository.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public User getUserDetails(String userName) {
		System.out.println("username   --------"+userName);
		User user= dao.findUserByUsername(userName);
		System.out.println("user==========="+user.toString());
		
		return user;
		
	}
}
