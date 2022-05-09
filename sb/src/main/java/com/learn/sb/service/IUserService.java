package com.learn.sb.service;

import com.learn.sb.entity.User;

public interface IUserService {
	
	public abstract User getUserName(Integer id);

	public abstract String deleteUser(Integer id);

	public abstract User createUser(User user);

}
