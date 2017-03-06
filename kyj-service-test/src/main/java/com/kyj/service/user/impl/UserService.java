package com.kyj.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyj.dao.user.UserDao;
import com.kyj.domain.user.User;
import com.kyj.service.user.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getUserByName(String name) {
		return userDao.getUserByName(name);
	}
	
}
