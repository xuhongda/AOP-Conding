package com.xu.proxy.动态;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xuhongda on 2018/11/20
 * com.xu.proxy.静态
 * AOP-Conding
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Person {

    private String name;

    /**
     * 上交班费
     */
    @Override
    public void giveMoney() {
        System.out.println("上交班费。。。");
    }
}
