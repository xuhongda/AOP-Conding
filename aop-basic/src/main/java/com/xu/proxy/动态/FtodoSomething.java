package com.xu.proxy.动态;

/**
 * 接口作为参数
 * @author by xuhongda 2021/5/2
 * com.xu.proxy.动态
 * AOP-Conding
 **/
public class FtodoSomething {


    /**
     * 接口作为参数效果与动态代理有何不同 ？？？
     *
     * 动态代理可在 代理对象 invoke 方法中添加进自己的实现的一些逻辑,
     * 因为在 invoke(Object proxy, Method method, Object[] args) 方法中有参数可知道具体信息
     * 但是接口参数，参数只是个接口，接口能调用方法有限，我们也不可以接口 转为对象
     * @param person 实现了接口的类
     */
    public static void m(Person person){
        person.giveMoney();
    }

    public static void main(String[] args) {
        Student student = new Student("xu");
        Teacher teacher = new Teacher("zhang");
        m(student);
        m(teacher);

        //lambda 表达式 只关注参数与返回值 取代匿名内部类
        Person xx = () -> {
            System.out.println("xx");
        };
        xx.giveMoney();

        Person person = new Person() {
            @Override
            public void giveMoney() {
                System.out.println(xx);
            }
        };
        person.giveMoney();


    }
}
