package com.xu.proxy.动态;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xuhongda on 2018/11/21
 * com.xu.proxy.动态
 * AOP-Conding
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Person {

    private String name;

    /**
     * 上交班费
     */
    @Override
    public void giveMoney() {
        System.out.println("收钱");
    }
}
