import config.ApplicationConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wjl.User;

/**
 * 实现纯java方式完成Spring中ioc容器注解
 */
public class ConfigTest {
    @Test
    public void config() {
        //AnnotationConfigApplicationContext为通过纯java方式实现注解的类，通过它可以获取当前ioc容器中的组件
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
