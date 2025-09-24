package com.example.MinhaLista.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
public  class Indexcontrole {

@RequestMapping("/")
    public String index(){
        return "index";
    }
}