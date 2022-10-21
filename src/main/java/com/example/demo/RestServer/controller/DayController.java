package com.example.demo.RestServer.controller;

import com.example.demo.RestServer.CurrentDay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayController {
    @GetMapping("/weekDays")
    //1
//    public CurrentDay day(){
//        System.out.println();
//        return new CurrentDay(lang);
//    }
    //2
    public CurrentDay day(String lang){
        return new CurrentDay(lang);
    }

}
