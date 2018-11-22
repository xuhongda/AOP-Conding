package com.xu.proxy.静态;

/**
 * <p>
 *     静态代理测试
 * </p>
 * @author xuhongda on 2018/11/20
 * com.xu.proxy.静态
 * AOP-Conding
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        //被代理对象
        Student student = new Student("yan");
        //代理对象
        StudentProxy studentProxy = new StudentProxy(student);
        //代理执行
        studentProxy.giveMoney();
    }
}
