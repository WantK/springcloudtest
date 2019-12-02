package com.jinbin.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String Hi(@RequestParam String name){
        return "hi "+name+",i am from port:" +port;
    }
}
