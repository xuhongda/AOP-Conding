package com.xu.advisor;

/**
 * @author xuhongda on 2018/11/21
 * com.xu.advisor
 * AOP-Conding
 */
public class Waiter {

    public void greetTo(String clientName) {
        System.out.println("Waiter:greet to " + clientName + "...");
    }

    public void serveTo(String clientName) {
        System.out.println("Waiter:serve to " + clientName + "...");
    }

}
