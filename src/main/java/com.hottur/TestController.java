package com.hottur;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Map;

@Controller
public class TestController {

    String massage = "hello";

    @RequestMapping("/")
    public String greeting(Map<String, Object> model) {
        model.put("massage", this.massage);
        return "welcome";
    }
}