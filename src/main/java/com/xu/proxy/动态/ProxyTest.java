package com.xu.proxy.动态;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>
 * 动态代理测试
 * </p>
 *
 * @author xuhongda on 2018/11/20
 * com.xu.proxy.动态
 * AOP-Conding
 */
public class ProxyTest {

    @Test
    public void  test(){
        //实际对象
        Person person = new Student("yan");
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler personStuInvocationHandler = new StuInvocationHandler<>(person);
        //创建代理对象
        Person p = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, personStuInvocationHandler);
        //执行目标方法
        p.giveMoney();
    }

    @Test
    public void test2() throws Throwable {
        //实际对象
        Person person = new Student("yan");
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler personStuInvocationHandler = new StuInvocationHandler<>(person);
        //创建代理对象
        Person p = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, personStuInvocationHandler);
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(p);
        Boolean b = Proxy.isProxyClass(p.getClass());
        Assert.assertEquals(true,b);
        invocationHandler.invoke(person.getClass(),person.getClass().getMethod("giveMoney"),null);
    }

}
