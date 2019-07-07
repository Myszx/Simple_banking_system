package com.myszx.servlet;

import com.myszx.dao.UserDao;
import com.myszx.model.User;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/init")
public class InitializeDatabaseWithSomeDataServlet extends HttpServlet {

    @Inject
    private UserDao userDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = new User(20000L, "Maciej", "Myszkowski", "Myszx", "password");

        userDao.save(user);

    }
}
