package com.wz.service.impl;

import com.wz.dao.MyUserDao;
import com.wz.pojo.MyUser;
import com.wz.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("myUserService")
@Transactional
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    private MyUserDao myUserDao;
    @Override
    public List<MyUser> selectUserByName(MyUser myUser) {
        return myUserDao.selectByName(myUser);
    }
}
