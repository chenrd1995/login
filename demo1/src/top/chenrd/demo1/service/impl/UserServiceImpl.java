package top.chenrd.demo1.service.impl;

import top.chenrd.demo1.dao.UserDao;
import top.chenrd.demo1.dao.impl.UserDaoImpl;
import top.chenrd.demo1.domain.User;
import top.chenrd.demo1.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用DAO
        return dao.findAll();
    }
}
