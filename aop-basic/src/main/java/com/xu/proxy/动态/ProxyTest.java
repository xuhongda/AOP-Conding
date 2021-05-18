package com.xu.proxy.动态;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>
 * JDK 动态代理测试;JDK 动态代理只提供基于接口的代理
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
        Person stu = new Student("yan");
        //Person tea = new Teacher();
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler personInvocationHandler = new ObjInvocationHandler<>(stu);
        //创建代理对象
        Person p = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, personInvocationHandler);
        //执行目标方法
        p.giveMoney();
    }

    @Test
    public void test2() throws Throwable {
        //实际对象
        Person person = new Student("yan");
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler personInvocationHandler = new ObjInvocationHandler<>(person);
        //创建代理对象
        Person p = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, personInvocationHandler);
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(p);
        Boolean b = Proxy.isProxyClass(p.getClass());
        Assert.assertEquals(true,b);
        invocationHandler.invoke(person.getClass(),person.getClass().getMethod("giveMoney"),null);
    }

}
