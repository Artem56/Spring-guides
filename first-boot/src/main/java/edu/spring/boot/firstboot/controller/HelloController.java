package edu.spring.boot.firstboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController сочетает в себе @Controller и @ResponseBody, две аннотации в результате web запросов возвращают данные,
 * а не представление.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "Greetings from Spring Boot!";
    }
}
