package com.lanclass.dao;

import com.lanclass.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface UserMapper {
     List<User> selectUser();
}
