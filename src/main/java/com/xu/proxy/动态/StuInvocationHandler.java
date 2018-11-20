package com.xu.proxy.动态;

import com.xu.proxy.fuc.MyFunction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xuhongda on 2018/11/20
 * com.xu.proxy.动态
 * AOP-Conding
 */
public class StuInvocationHandler<T> implements InvocationHandler {
    /**
     * 被代理对象
     */
    private T target;

    public StuInvocationHandler(T target){
        this.target = target;
    }

    /**
     *
     * @param proxy 动态代理对象
     * @param method 正在执行的方法
     * @param args 调用目标方法时传入的实参
     * @return Object
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        MyFunction.start();
        Object result = method.invoke(target, args);
        MyFunction.end();
        return result;

    }
}
