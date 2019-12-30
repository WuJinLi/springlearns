package service;

import dao.UserDao;
import dao.UserDaoImp;
import dao.UserMySalImp;
import dao.UserMyorImp;

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
