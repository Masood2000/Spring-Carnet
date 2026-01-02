package com.masood.modules.m_6.aspects;

import com.masood.modules.m_6.annotations.ToLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

   /* @Around("execution(* com.masood.modules.m_6.services.*.*(..))") old
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {


        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();

        Comment cm = new Comment();
        cm.setText("brothers karamazov");
        cm.setAuthor("dovotseky");

        Object[] arsNew = {cm};


        logger.info("Method " + methodName + " with parameters " + Arrays.asList(args) + " will execute");

        Object returnedByMethod = proceedingJoinPoint.proceed(arsNew);

        String k = (returnedByMethod.toString())+"Failed also";

        logger.info("Method executed and returned " + returnedByMethod);

        return k;

    }
*/


    @Around("@annotation(com.masood.modules.m_6.annotations.ToLog)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        String interceptedMethodName = proceedingJoinPoint.getSignature().getName();
        Object[] interceptedMethodArgs = proceedingJoinPoint.getArgs();

        logger.info("Method "+ interceptedMethodName.toString() + "Started");

        Object interceptedMethodReturnValue = proceedingJoinPoint.proceed();

        logger.info("Method "+ interceptedMethodName.toString() + "Ended");

        return interceptedMethodReturnValue+" from aspect";

    }
}

