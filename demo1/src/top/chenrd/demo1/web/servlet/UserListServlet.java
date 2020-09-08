package top.chenrd.demo1.web.servlet;

import top.chenrd.demo1.domain.User;
import top.chenrd.demo1.service.UserService;
import top.chenrd.demo1.service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet("/userListServlet")
public class UserListServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //1.调用UserService完成查询
        System.out.println(" userListServlet 开始");
        UserService userService = new UserServiceImpl();
        List<User> users = userService.findAll();
        //2.将list存入request域
        request.setAttribute("users",users);
        //3.转发达页面
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
