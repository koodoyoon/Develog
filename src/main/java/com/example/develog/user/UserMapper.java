package com.example.develog.user;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void join(UserDto dto) throws Exception;

}
