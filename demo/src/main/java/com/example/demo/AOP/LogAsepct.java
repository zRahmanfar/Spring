package com.example.demo.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAsepct {

    @Pointcut("execution(public * com.example.demo.*.* (..))")
    public void allMethode(){}
  @Around("allMethode()")
    public  Object logAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        proceedingJoinPoint.getThis();
        return null;
    }
}
