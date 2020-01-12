package custom;

/**
 * 自定义方法实现aop
 */
public class Custom {
    public void before() {
        System.out.println("--------方法执行前--------");
    }

    public void after() {
        System.out.println("--------方法执行后--------");
    }
}
