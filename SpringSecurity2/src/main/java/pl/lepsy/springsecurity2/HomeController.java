package pl.lepsy.springsecurity2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "hello everyone";
    }

    @GetMapping
    public String user(){
        return "hello user";
    }
    @GetMapping
    public String admin(){
        return "hello Admin";
    }

}
