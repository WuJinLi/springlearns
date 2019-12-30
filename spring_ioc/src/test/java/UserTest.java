import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserServiceImp;

public class UserTest {
    public static void main(String args[]) {


        /**
         * 实现调用对象通过调用者（三方）自己提供
         */
        //        UserService userService = new UserServiceImp();
        //        //    UserDao userDao = new UserDaoImp();
        //        //    UserDao userDao = new UserMySalImp();
        //        //    UserDao userDao = new UserMyorImp();
        //
        //        ((UserServiceImp) userService).setUserDao(new UserMyorImp());
        //
        //        userService.getUser();


        /**
         * spring ioc控制反转实现
         */
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
        UserServiceImp userServiceImp= (UserServiceImp) context.getBean("userServiceImp");
        userServiceImp.getUser();
    }
}
