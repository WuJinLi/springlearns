package proxy;


//客户端  也就是租房的人
public class Client {
    public static void main(String[] args) {
        //真实对象
        Landlord landlord = new Landlord();
        //代理对象
        Intermediary intermediary = new Intermediary(landlord);
        intermediary.rent();
    }
}

/**
 * 代理模式：
 * 优点：
 * 使真实角色业务量更加纯粹，不用去关注一些公共的业务
 * 公共业务可以交给代理角色去统一管理
 * 公共业务进行拓展的话便于统一修改，维护
 * <p>
 * 缺点：
 * 一个真实角色对应一个代理角色，代码量增加，开发效率低
 * <p>
 * 解决方法：动态代理
 */
