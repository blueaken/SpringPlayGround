package com.blueaken.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Author: blueaken
 * Date: 8/31/14 1:22 下午
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o)
            throws Throwable {
        System.out.println("HijackBeforeMethod: Before method hijacked!");
    }
}
