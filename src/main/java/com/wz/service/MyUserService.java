package com.wz.service;

import com.wz.pojo.MyUser;

import java.util.List;

public interface MyUserService {
    public List<MyUser> selectUserByName(MyUser myUser);
}
