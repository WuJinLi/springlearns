package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import wjl.User;

@Configuration//声明当前类为配置类，类是以xml配置的xml文件
@ComponentScan("wjl")//扫面"wjl"下所有的组件
public class ApplicationConfig1 {
    @Bean//类似xml中的<bean>标签
    public User user() {
        return new User();
    }
}
