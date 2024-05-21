package com.example.develog;

import com.example.develog.user.UserDto;
import com.example.develog.user.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;

import static org.mockito.Mockito.verify;

class MainControllerTest {

    @Mock
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void join() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setUserId("testUserId");
        userDto.setPassword("testPassword");
        userDto.setUsername("testUsername");
        userDto.setBirthday("1990-01-01");
        userDto.setEmail("test@example.com");
        userDto.setPhoneNo("010-1234-5678");
        userDto.setRole("USER");
        userDto.setCreatedAt(LocalDateTime.now());
        userDto.setGender("M");

        userService.join(userDto);

        verify(userService).join(userDto);
    }
}