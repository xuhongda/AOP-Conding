package com.xu.proxy.cglib;

import com.xu.proxy.fuc.MyFunction;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>
 * 拦截器
 * </p>
 *
 * @author xuhongda on 2018/11/22
 * com.xu.proxy.cglib
 * AOP-Conding
 */
public class ObjInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        MyFunction.start();
        //这里要使用 invokeSuper 方法
        Object invoke = methodProxy.invokeSuper(o, objects);
        MyFunction.end();
        return invoke;
    }
}
