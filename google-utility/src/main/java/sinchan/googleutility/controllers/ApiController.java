package sinchan.googleutility.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/apis/test")
    public String test(){
       return "Process is deployed";
    }
}
