package com.xu.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * <p>
 * 静态普通方法匹配切面
 * </p>
 *
 * @author xuhongda on 2018/11/21
 * com.xu.advisor
 * AOP-Conding
 */
public class StaticGreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
    /**
     * 切点匹配方法
     *
     * @param method
     * @param targetClass
     * @return
     */
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return "greetTo".equals(method.getName());
    }

    /**
     * 切点匹配规则为 {@link Waiter} 的类或子类
     *
     * @return
     */
    public ClassFilter classFilter() {
        return Waiter.class::isAssignableFrom;
    }
}
