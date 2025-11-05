package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/apitest", method = RequestMethod.GET)
    public String apitest() {
        System.out.println("111111");
        return "success";
    }

}
