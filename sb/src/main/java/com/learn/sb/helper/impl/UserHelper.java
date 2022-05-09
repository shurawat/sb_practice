package com.learn.sb.helper.impl;

import org.springframework.stereotype.Component;

import com.learn.sb.entity.User;
import com.learn.sb.helper.IUserHelper;

@Component
public class UserHelper implements IUserHelper{

	@Override
	public User appendUserName(User user) {
		user.setName("User name is " + user.getName());
		return user;
	}

}
