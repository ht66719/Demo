package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.test.demo.entity.User;

@Component
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserService service;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=service.getUserDetails(username);
		System.out.println("user details  === "+user.toString());
		UserDetails details=new UserDetailsImpl(user.getUsername(), user.getPassword(), user.getRole());
		return details;
	}
	

}
