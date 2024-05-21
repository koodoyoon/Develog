package com.example.develog;

import com.example.develog.user.UserDto;
import com.example.develog.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String main() {
        return "/main";
    }

    @GetMapping("/loginPage")
    public String showLoginPage() {
        return "loginPage";
    }

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute UserDto dto) {
        try {
            userService.join(dto);

        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/join?error";
        }

        return "redirect:/dashboard";
    }
}
