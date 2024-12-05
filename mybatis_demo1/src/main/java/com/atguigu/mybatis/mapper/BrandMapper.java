package com.atguigu.mybatis.mapper;

import java.util.List;


import com.atguigu.mybatis.pojo.Brand;


public interface BrandMapper {

     List<Brand> selectAll();

     Brand selectById(int id);

     List<Brand> selectByCondition(Brand brand);


}