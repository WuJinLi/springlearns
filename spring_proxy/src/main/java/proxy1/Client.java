package proxy1;


/**
 * 实现需求  在调用UserServiceImpl方法时，添加打印日志的功能 不修改UserServiceImpl类代码前提下
 *
 * 实现方法：静态代理方法实现
 * 实现思路：创建代理类，使用代理里实现日志功能的添加
 */
public class Client {
    public static void main(String[] args){
        UserServiceImpl userService=new UserServiceImpl();
        ProxyLog proxyLog= new ProxyLog();
        proxyLog.setUserService(userService);


        proxyLog.add();
        proxyLog.delete();
        proxyLog.select();
        proxyLog.update();
    }
}
