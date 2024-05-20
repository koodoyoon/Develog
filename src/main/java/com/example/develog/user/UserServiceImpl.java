package com.example.develog.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void join(UserDto dto) throws Exception {
        userMapper.join(dto);
    }


}
