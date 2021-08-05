package com.chb.service;

import com.chb.entity.User;

//Service层接口
public interface UserService {

    //检验用户登录
    User checkLogin(String username,String password);
    void Regist(User user);
}