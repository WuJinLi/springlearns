package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import wjl.User;

@Configuration//声明当前类为配置类，类是以xml配置的xml文件
@ComponentScan("wjl")//扫面"wjl"下所有的组件
@Import(ApplicationConfig1.class)//面对多人员协同开发。配置文件不止一个，可以使用Import来放置一个制定类中进行统一管理，类是与xml中的import标签
public class ApplicationConfig {
    @Bean//类似xml中的<bean>标签
    public User user() {
        return new User();
    }
}
