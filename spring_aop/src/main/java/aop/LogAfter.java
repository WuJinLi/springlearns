package aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {
    /**
     * @param returnValue 方法返回值
     * @param method      执行目标对象的方法
     * @param args        方法参数
     * @param target      目标对象
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了目标对象:" + target.getClass().getName() + ",方法:" + method.getName() + "，返回值：" + returnValue);
    }
}
