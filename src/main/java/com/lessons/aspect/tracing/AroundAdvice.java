package com.lessons.aspect.tracing;

import com.lessons.aspect.DTO.AOP;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAdvice {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* simpleMethod(..))")
    public Object trace(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        String methodInfo = proceedingJoinPoint.getStaticPart().getSignature().toString();

        logger.info("(AROUND ADVICE)Entering "+methodInfo);
        try {
            logger.info("(AROUND ADVICE)Returning "+proceedingJoinPoint.proceed().toString());
            return proceedingJoinPoint.proceed();
        }
        catch (Throwable ex){
            logger.error("Exception in {} with cause {} ", methodInfo, ex.getCause());
            return new AOP(
                    "Default",
                    "Name"
            );
        }
        finally {
            logger.info("(AROUND ADVICE)Exiting "+methodInfo);
        }

    }
}
