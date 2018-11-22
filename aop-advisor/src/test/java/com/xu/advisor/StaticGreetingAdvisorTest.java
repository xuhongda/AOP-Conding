package com.xu.advisor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xuhongda on 2018/11/22
 * com.xu.advisor
 * AOP-Conding
 */
public class StaticGreetingAdvisorTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Waiter waiter = (Waiter) applicationContext.getBean("waiter");
        waiter.greetTo("yan");
        Seller seller = (Seller) applicationContext.getBean("seller");
        seller.greetTo("yan");
    }
}
