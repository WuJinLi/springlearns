package proxy1;


//代理类实现和真实对象同样使接口
public class ProxyLog implements IUserService {
    private UserServiceImpl userService;


    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        Log("add");
        userService.add();
    }

    public void select() {
        Log("select");
        userService.select();
    }

    public void delete() {
        Log("delete");
        userService.delete();
    }

    public void update() {
        Log("update");
        userService.update();
    }


    private void Log(String msg) {
        System.out.println("调用了" + msg + "方法");
    }
}
