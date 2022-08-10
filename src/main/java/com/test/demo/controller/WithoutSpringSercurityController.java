package com.test.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicd")
public class WithoutSpringSercurityController {

	List<Zenpulse> list = Arrays.asList(new Zenpulse(1, "23", 200, "Shishir"), new Zenpulse(2, "45", 400, "Harshali"),
			new Zenpulse(3, "30", 3546, "Rahule"));

	@GetMapping("/get/zenpulse")
	public List<Zenpulse> getZenpulseDetails() {

		return list;
	}

	@GetMapping("/test")
	public String testEndpoint() {
		return "UP AND RUNNING";
	}

	@PostMapping("/greet")
	public String greet(@RequestParam("name") String name) {

		return "Hello...Mr " + name + "..! Welcome to the test page";
	}

}
