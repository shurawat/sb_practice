package com.learn.sb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.learn.sb.entity.User;
import com.learn.sb.helper.IUserHelper;
import com.learn.sb.repository.IUserRepository;
import com.learn.sb.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User getUserName(Integer id) {
		User user = userRepository.findById(id).get();
		IUserHelper uh = (IUserHelper) context.getBean("userHelper");
		return uh.appendUserName(user);
	}

	@Override
	public String deleteUser(Integer id) {
		userRepository.deleteById(id);
		return "user " + id +" deleted.";
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
}
