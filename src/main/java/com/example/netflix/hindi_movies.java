package com.example.netflix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class hindi_movies {
    @GetMapping("/hindi_movies")
    public String getData(){
        return  "Please book hhhhhh holidays tickets from makemytrip";
    }
}