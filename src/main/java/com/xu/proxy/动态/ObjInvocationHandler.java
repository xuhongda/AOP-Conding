package com.xu.proxy.动态;

import com.xu.proxy.fuc.MyFunction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xuhongda on 2018/11/20
 * com.xu.proxy.动态
 * AOP-Conding
 */
public class ObjInvocationHandler<T> implements InvocationHandler {
    /**
     * 被代理对象
     */
    private T target;

    public ObjInvocationHandler(T target) {
        this.target = target;
    }

    /**
     *<p>
     * 将横切代码与业务代码编织，可以在业务代码上下任意的添加横切逻辑代码
     * 这就是动态代理的优点。。。。。。
     *</p>
     * @param proxy 动态代理对象
     * @param method 正在执行的方法
     * @param args 调用目标方法时传入的实参
     * @return Object
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //横切逻辑代码1
        MyFunction.start();
        //业务逻辑代码
        Object result = method.invoke(target, args);
        // 横切逻辑代码2
        MyFunction.end();
        return result;

    }
}
