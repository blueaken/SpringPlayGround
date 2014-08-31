package com.blueaken.aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * Author: blueaken
 * Date: 8/31/14 2:02 下午
 */
public class HijackThrowException implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("HijackThrowException : Throw exception hijacked!");
    }
}
