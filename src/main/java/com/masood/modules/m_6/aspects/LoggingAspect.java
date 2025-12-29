package com.masood.modules.m_6.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.masood.modules.m_6.services.*.*(..))")
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        logger.info("Method will execute");
        proceedingJoinPoint.proceed();
        logger.info("Method executed");

    }

}
