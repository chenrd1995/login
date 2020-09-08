package top.chenrd.demo1.service;

import top.chenrd.demo1.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();
}
