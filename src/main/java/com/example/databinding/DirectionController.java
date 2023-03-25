package com.example.databinding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value={"/user"})
public class DirectionController {
    @GetMapping({"/","/sign-up"})
    public String Home(){
        return "singupform";
    }
    @PostMapping("/sign-up")
    public String Singup(User user){
        System.out.println(user);
        return "result";
    }
}
