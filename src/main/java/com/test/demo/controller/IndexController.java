
package com.test.demo.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.service.UserService;

@RestController
public class IndexController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/demo")
	String index() {
		service.getUserDetails("hari");
		System.out.println("ukegfiewqhfilejd;lq");
		return "Demo";
	}

}
