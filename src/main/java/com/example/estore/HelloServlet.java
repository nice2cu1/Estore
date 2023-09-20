package com.example.estore;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

//@WebSe    rvlet(name = "login", value = "/login")
public class HelloServlet extends HttpServlet {

    public void init() {
    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        if (!account.isEmpty() && !password.isEmpty()) {

            req.setAttribute("account", account);
            req.setAttribute("password", password);

            RequestDispatcher dispatcher = req.getRequestDispatcher("./index2.jsp");
            dispatcher.include(req, resp);

        } else {
            resp.setContentType("text/html");

            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1>不要提交空数据！</h1>");
            out.println("</body></html>");
        }
    }

    public void destroy() {
    }
}