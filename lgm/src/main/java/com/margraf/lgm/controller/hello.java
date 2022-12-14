package com.margraf.lgm.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class hello {

    @GetMapping("/")  
    public String ola(){
        return "bom dia, hoje aula 05/06/07             "+new Date();
    }

}
    