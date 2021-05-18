package com.xu.proxy.cglib;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author xuhongda on 2018/11/22
 * com.xu.proxy.cglib
 * AOP-Conding
 */
public class CglibTest {
    @Test
    public void test1() {
        Enhancer enhancer = new Enhancer();
        //设置代理目标
        enhancer.setSuperclass(Student.class);
        //设置回调
        enhancer.setCallback(new ObjInterceptor());
        Student student = (Student)enhancer.create();
        student.giveMoneyToGirl("yan");
    }
}
