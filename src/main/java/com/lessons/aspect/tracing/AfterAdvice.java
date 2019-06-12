package com.lessons.aspect.tracing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAdvice {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(* simpleMethod(..))")
    public void exiting(JoinPoint joinPoint) {
        logger.info("(AFTER ADVICE)Hey. Am exiting " + joinPoint.getSignature());
        for (Object args : joinPoint.getArgs()) {
            logger.info("Args: " + args);
        }
    }
}
