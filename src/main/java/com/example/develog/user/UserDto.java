package com.example.develog.user;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserDto {

    private String userId;
    private String password;
    private String username;
    private String birthday;
    private String email;
    private String phoneNo;
    private String role;
    private LocalDateTime createdAt;
    private String gender;

}
