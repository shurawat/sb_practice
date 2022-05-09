package com.learn.sb.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.sb.entity.User;
import com.learn.sb.service.IUserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping({"/user/{id}", "/user"})
	public User getUserName(@PathVariable(required = false ) String id) {
		return userService.getUserName(Integer.parseInt(id));
	}
	
	@DeleteMapping("/user/{id}")	
	public String deleteUser(@PathVariable(required = true) Integer id) {
		return userService.deleteUser(id);
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

}
