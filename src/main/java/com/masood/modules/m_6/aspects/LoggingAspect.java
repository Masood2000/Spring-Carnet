package com.masood.modules.m_6.aspects;


import com.masood.modules.m_6.entities.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.masood.modules.m_6.services.*.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {


        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();

        //Comment cm = (Comment) args[0];


        logger.info("Method " + methodName + " with parameters " + Arrays.asList(args) + " will execute");

        Object returnedByMethod = proceedingJoinPoint.proceed();

        logger.info("Method executed and returned " + returnedByMethod);

        return returnedByMethod;

    }

}
