package com.kyj.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kyj.domain.user.User;

public interface UserDao {

	List<User> getUserByName(@Param("name")String name);
}
