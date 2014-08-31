package com.blueaken.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Author: blueaken
 * Date: 8/31/14 1:57 下午
 */
public class HijackAfterMethod implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("HijackedAfterMethod: After method hijacked!");
    }
}
