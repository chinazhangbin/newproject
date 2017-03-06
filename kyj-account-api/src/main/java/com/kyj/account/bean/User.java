package com.kyj.account.bean;

import java.io.Serializable;

/**
 * Created by zhangbinpc on 2016/12/2.
 */
public class User implements Serializable {
    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
