package com.lessons.aspect.controller;

import com.lessons.aspect.DTO.AOP;
import com.lessons.aspect.service.AOPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class AopController {
    @Autowired
    AOPService aopService;

    @PostMapping("/AOPExample")
    public AOP AopTest(@RequestBody AOP aops) {
        AOP aop = aopService.simpleMethod(aops);
        return aop;
    }

    @PostMapping("/AOPException")
    public void exeptionTest(@RequestBody AOP aops) {
         aopService.throwsRuntimeException(aops);
    }

    @GetMapping("/{name}")
    public String names(@PathVariable String name){
        return "Hey. Call me "+name;
    }

}
