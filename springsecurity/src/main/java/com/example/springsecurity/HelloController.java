package com.example.springsecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("hello")
public String homee(HttpServletRequest request){
    return "Hello" + request.getSession().getId();
}
@GetMapping("About")
public String about(HttpServletRequest request){
    return "About" + request.getSession().getId();
}


}
