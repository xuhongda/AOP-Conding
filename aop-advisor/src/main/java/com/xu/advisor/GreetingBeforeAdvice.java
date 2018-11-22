package com.xu.advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author xuhongda on 2018/11/21
 * com.xu.advisor
 * AOP-Conding
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    /**
     * 前置增强
     *
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "\t" + method.getName());
        String name = (String) args[0];
        System.out.println("前置：欢迎。。。:\t" + name);
    }
}
