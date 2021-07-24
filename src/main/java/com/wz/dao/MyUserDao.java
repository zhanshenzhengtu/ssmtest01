package com.wz.dao;

import com.wz.pojo.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("myUserDao")
@Mapper
public interface MyUserDao {
    public List<MyUser> selectByName(MyUser myUser);
}
