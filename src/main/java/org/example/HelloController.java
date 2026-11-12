package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Привет! Я написал свой первый бэкенд на Java!";
    }
    @GetMapping("/sum")
    public String sum() {
        int a = 5;
        int b = 10;
        return "Сумма чисел равна: " + (a + b);
    }
}