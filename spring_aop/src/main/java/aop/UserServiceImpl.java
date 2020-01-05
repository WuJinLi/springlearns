package aop;

public class UserServiceImpl implements IUserService {
    public void add() {
        System.out.println("添加数据");
    }

    public void delete() {
        System.out.println("删除数据");
    }

    public void select() {
        System.out.println("查询数据");
    }

    public void update() {
        System.out.println("更新数据");
    }
}
