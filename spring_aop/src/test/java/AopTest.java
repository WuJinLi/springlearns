import aop.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void aopByXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
//        userService.add();
        userService.delete();
    }
}
