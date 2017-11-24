package com.service.service8.controller;

import org.springframework.stereotype.Component;


@Component
public class Server8Delegate implements Server8 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
