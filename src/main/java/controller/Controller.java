package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    
    @RequestMapping("/welcome")

    @GetMapping("")
    public String welcome(){
        return "welcome";
    }
}
