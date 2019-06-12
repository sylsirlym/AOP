package com.lessons.aspect.tracing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowingAdvice {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterThrowing(pointcut = "execution(* throwsRuntimeException(..))", throwing = "ex")
    public void logException(RuntimeException ex) {
        logger.error("Logging an exception ", ex);
    }
}
