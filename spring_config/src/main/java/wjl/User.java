package wjl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//将当前类声明为组件
public class User {

    @Value("Rose")//为当前属性赋值
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
