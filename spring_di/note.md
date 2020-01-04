## 依赖注入di

1.创建实体类
  + Address
  + Student
   
2.创建配置文件beans.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="address" class="Address">
        <property name="city" value="北京市"/>
        <property name="street" value="霍营街道"/>
    </bean>
    <bean id="student" class="Student">
        <!--普通数据注入-->
        <property name="name" value="张三"/>
        <!--引用对象注入-->
        <property name="address" ref="address"/>
        <!--集合注入-->
        <property name="books">
            <array>
                <value>红楼梦</value>
                <value>西游记</value>
                <value>水浒传</value>
                <value>三国演义</value>
            </array>
        </property>
        <!--map-->
        <property name="cards">
            <map>
                <entry key="银行卡" value="123456789"></entry>
                <entry key="身份证" value="1234567890"></entry>
            </map>
        </property>
        <!--list-->
        <property name="hobbys">
            <list>
                <value>篮球</value>
                <value>足球</value>
                <value>乒乓球</value>
                <value>羽毛球</value>
            </list>
        </property>
        <!--null-->
        <property name="wife">
            <null></null>
        </property>
        <!--set-->
        <property name="loveColor">
            <set>
                <value>red</value>
                <value>blue</value>
                <value>black</value>
            </set>
        </property>
        <!--props-->
        <property name="properties">
            <props>
                <prop key="学号">20190511</prop>
            </props>
        </property>
    </bean>

</beans>
```
xml配置即将实体类配置到ioc容器，通过ioc容器统一管理容器中的对象
+ <bean> 配置每一个对象的标签，具体对象的注册，属性配置都需要在bean标签中完成配置

    + id：是配置对象的表示，便于在java代码中通过id来获取
    + class： 需要注册类的类型，即注册类在项目的绝对路径
    + property:属性注入标签
        + name：属性名称
        + value：属性具体值
        + ref：引用ioc容器中已经注册的对象
        + array：数组注入，其子标签 <value>***</value>配合使用
        + map：map注入方式，其子标签  <entry key="***" value="****"></entry>配合使用，类是java代码中的key-value对应行书
        + list：集合注入，其子标签  <value>***</value>配合使用，注入其集合子元素的值
        + set：类似意list注入方式
        + null： 表示当前注入属性可以为空
        + props：配置注入，与子标签 <prop key="***">******</prop>配合使用
    + 拓展命名空间配置：
        + P命名空间 类似属性配置
            1.导入命名空间配置包
            ```xml
              xmlns:p="http://www.springframework.org/schema/p"
              xmlns:c="http://www.springframework.org/schema/c"
            ```
            2.使用p标签进行配置
            ```xml
             <!--P命名空间 类似属性配置-->
             <bean id="address" class="Address" p:city="北京市" p:street="清河街道"/>
             <bean id="user" class="User" p:name="张三" p:address-ref="address"/>
            ```
            3.使用C标签进行配置
             ```xml
                <!--C命名空间  也就是构造器-->
                <bean id="user_c" class="User" c:name="Rose" c:address-ref="address_c"></bean>
                <bean id="address_c" class="Address" c:city="上海市" c:street="大同街"/>
            ```
          