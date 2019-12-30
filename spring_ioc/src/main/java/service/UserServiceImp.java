package service;

import dao.UserDao;
import dao.UserDaoImp;
import dao.UserMySalImp;
import dao.UserMyorImp;

//引出控制反转概念，将对象的创建有主动变为三方自动创建（ioc容器）
//该实例重点1.set用法的精妙之处；2引出控制反转的概念，在beans.xml文件中进行配置，实现ioc
public class UserServiceImp implements UserService {

//    UserDao userDao = new UserDaoImp();
//    UserDao userDao = new UserMySalImp();
//    UserDao userDao = new UserMyorImp();

    UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
