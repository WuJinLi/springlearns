import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试依赖注入
public class TestMain {
    @Test
    public void student() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    //拓展命名空间p
    @Test
    public void user_p() {
        //p命名扩展空间
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    //拓展命名空间c
    @Test
    public void user_c() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = context.getBean("user_c", User.class);
        System.out.println(user);
    }


    //bean的作用域 默认单例模式
    @Test
    public void user_scopes_single() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = context.getBean("user_c", User.class);
        User user2 = context.getBean("user_c", User.class);
        System.out.println(user == user2);
    }

    //bean的作用域 prototype
    @Test
    public void user_scopes_prototype() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = context.getBean("user_p", User.class);
        User user2 = context.getBean("user_p", User.class);
        System.out.println(user == user2);
    }
}
