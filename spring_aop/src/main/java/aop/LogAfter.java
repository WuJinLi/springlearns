package aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * aop面向切面编程
 * 1.xml进行切面配置
 * a.xml配置文件进行aop的导包；
 * b.aop实现原理是动态代理，即代理的是接口
 * b-1.创建接口，接口实现类，业务实现类
 * b-2.创建aop实现的方法添加比如执行原方法之前或者之后进行一些业务操作，在不该原有代码马基础上进行新业务的添加
 * c.在xml中进行这些类的的自动注册，配置到ioc容器中
 * d.在xml配置文件中进行aop切面的注册
 */
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
