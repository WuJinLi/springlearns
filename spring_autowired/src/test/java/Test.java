import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

//    @org.junit.Test
//    public void personTest() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Person person = context.getBean("person", Person.class);
//
//        person.getCat().sound();
//        person.getDog().sound();
//    }
//
//
//    @org.junit.Test
//    public void personByName() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Person person = context.getBean("person", Person.class);
//        person.getCat().sound();
//        person.getDog().sound();
//    }
//
//
    @org.junit.Test
    public void personByType() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Person person = context.getBean("person", Person.class);
        person.getCat().sound();
        person.getDog().sound();
    }

}
