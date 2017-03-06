package com.kyj.controller.user;

import com.alibaba.fastjson.JSON;
import com.kyj.account.api.UserService;
import com.kyj.account.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping(value="/user")
public class UserController {

//	@Autowired
//	private IUserService userService;

	@Autowired
	private UserService userService;

	@RequestMapping(value="/getUser",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getUserByName(String name) throws IOException{
//		List<User> list = userService.getUserByName(name);
//		String string = JSON.toJSONString(list);
		User user = new User();
		user.setUserName("张斌");
		userService.getUser(user);
		return JSON.toJSONString(user);
	}
}
