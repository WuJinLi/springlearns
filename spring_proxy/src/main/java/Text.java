import proxy2.IUserService;
import proxy2.ProxyInh;
import proxy2.UserServiceImpl;

/**
 * 动态代理实现
 */
public class Text {

    public static void main(String[] args) {
        UserServiceImpl target = new UserServiceImpl();
        ProxyInh proxyInh = new ProxyInh();
        proxyInh.setiUserService(target);

        IUserService service = (IUserService) proxyInh.getServiceProxy();

        service.add();
        service.query();
        service.delete();
        service.update();
    }
}
