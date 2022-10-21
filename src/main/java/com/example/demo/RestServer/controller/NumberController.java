package com.example.demo.RestServer.controller;

import com.example.demo.RestServer.RandomNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
    @GetMapping("/Number")
    //3
//    public RandomNumber random(){
//        return new RandomNumber();
//    }
    //4
    public RandomNumber random(@RequestParam(value = "min", defaultValue = "0") int min,
                               @RequestParam(value = "max", defaultValue = "50") int max){
        return new RandomNumber(min, max);
    }
    //5

}
