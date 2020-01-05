package proxy2;

public class UserServiceImpl implements IUserService{
    public void add() {
        System.out.println("添加操作");
    }

    public void delete() {
        System.out.println("删除操作");
    }

    public void query() {
        System.out.println("查询操作");
    }

    public void update() {
        System.out.println("更新操作");
    }
}
