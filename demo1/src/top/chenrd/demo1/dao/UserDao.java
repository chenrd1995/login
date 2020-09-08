package top.chenrd.demo1.dao;

import top.chenrd.demo1.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
