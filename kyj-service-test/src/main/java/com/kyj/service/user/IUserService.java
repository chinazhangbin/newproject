package com.kyj.service.user;

import java.util.List;

import com.kyj.domain.user.User;

public interface IUserService {

	List<User> getUserByName(String name);
}
