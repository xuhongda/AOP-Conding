package com.xu.proxy.cglib;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 被代理对象
 * </p>
 *
 * @author xuhongda on 2018/11/22
 * AOP-Conding
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String name;

    public void giveMoneyToGirl(String name) {
        System.out.println("偷电瓶车养你" + name);
    }
}
