package com.xu.proxy.静态;

/**
 * @author xuhongda on 2018/11/20
 * com.xu.proxy.静态
 * AOP-Conding
 */
public class StudentProxy implements Person {

   private Student student;

    public StudentProxy(Person p) {

        if (p.getClass() == Student.class){
            this.student = (Student) p;
        }
    }

    /**
     * 上交班费
     */
    @Override
    public void giveMoney() {
        System.out.println("do something...");
        student.giveMoney();
        System.out.println("bye bye ...");
    }
}
