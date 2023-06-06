package com.example.netflix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class myhotel {
    @GetMapping("/myhotel")
    public String getData(){
        return  "Please book you hotel tickets from makemytrip";
    }
}