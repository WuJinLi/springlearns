package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class logBefore implements MethodBeforeAdvice {


    /**
     * @param method 要执行的目标对象的方法
     * @param args   方法参数
     * @param target 目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("目标对象：" + target.getClass().getName() + ",执行方法:" + method.getName());
    }
}
