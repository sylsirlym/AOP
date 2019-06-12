package com.lessons.aspect.tracing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAdvice {
Logger logger = LoggerFactory.getLogger(this.getClass());
//Advice
@Before("execution(* AopTest(..))")
public void entering (JoinPoint joinPoint){
    logger.info("(BEFORE ADVICE)Entering "+ joinPoint.getStaticPart().getSignature().toString());
}
}
