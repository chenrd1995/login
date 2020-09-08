package top.chenrd.demo1.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.chenrd.demo1.dao.UserDao;
import top.chenrd.demo1.domain.User;
import top.chenrd.demo1.util.JDBCUtils;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //JDBC操作数据库
        //1.定义sql
        String sql = "select * from user ";
        return template.query(sql, new BeanPropertyRowMapper<>(User.class));
    }
}
