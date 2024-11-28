package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户信息
     */
    int insertUser();

    /*
    * 查询所有用户
    * */
    List<User> selectAll();
}