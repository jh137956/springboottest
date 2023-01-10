package com.example.firstpro.controller;


import com.example.firstpro.dto.Testapi;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @GetMapping(value="/value")
    public Testapi test(){
        Testapi testapi = new Testapi();
        testapi.setId("ok");
        testapi.setPassword("success");

        return testapi;
    }

    @GetMapping(value="/values")
    public String getRequestParam(@RequestParam String id, @RequestParam String password){
        return id + " , " + password;
    }

    @GetMapping(value="/values2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + ":" + map.getValue());
        });


        return sb.toString();
    }
}
