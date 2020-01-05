package proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInh implements InvocationHandler {

    //目标对象（为接口）
    private Object target;

    /**
     * 初始化目标对象
     *
     * @param target 初始化目标对象的对象，为接口的实现类
     */
    public void setiUserService(Object target) {
        this.target = target;
    }


    //获取动态代理对象
    public Object getServiceProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //通过反射实现目标对象方法调用
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    //新增功能
    public void log(String msg) {
        System.out.println("调用方法:" + msg);
    }
}
