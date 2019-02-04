package com.hottur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ControllerRegistration {

    @RequestMapping("/")
    public String registration(Map<String, Object> model) {
        return "/";
    }
}
