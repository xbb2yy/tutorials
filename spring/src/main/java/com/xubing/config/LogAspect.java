package com.xubing.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/24 18:35
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* doS*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        System.out.println("before");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp) {
        System.out.println(pjp.getSignature());
        System.out.println("hello aspect");
        try {
            Object proceed = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
