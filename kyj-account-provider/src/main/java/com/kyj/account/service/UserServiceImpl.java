package com.kyj.account.service;

import com.kyj.account.api.UserService;
import com.kyj.account.bean.User;
import org.springframework.stereotype.Service;

/**
 * Created by zhangbinpc on 2016/12/2.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user) {
        return user;
    }
}
