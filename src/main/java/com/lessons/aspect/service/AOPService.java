package com.lessons.aspect.service;

import com.lessons.aspect.DTO.AOP;
import org.springframework.stereotype.Service;

@Service
public class AOPService {
    public AOP simpleMethod(AOP aop){
        if(aop.getFname().isBlank()) {
            System.out.println(this.names(aop));
        }
        else {
            throw new RuntimeException();
        }
        return aop;
    }

    public void throwsRuntimeException(AOP aop){
        if (aop.getFname().equalsIgnoreCase("Sylvester"))
        throw new RuntimeException();
    }

    private String names(AOP aop){
        return "Hey. Call me "+aop.getFname()+" "+ aop.getLname();
    }
}
