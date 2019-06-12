package com.lessons.aspect.tracing;

import com.lessons.aspect.DTO.AOP;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterReturningAdvice {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(pointcut = "execution(String names(..))", returning = "string")
    public void logResult(String string) {
        logger.info("Result "+ string);
    }
}
