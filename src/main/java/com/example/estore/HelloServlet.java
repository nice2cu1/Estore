package com.example.estore;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        if(!account.isEmpty() && !password.isEmpty()){

            req.setAttribute("account", account);
            req.setAttribute("password", password);

            RequestDispatcher dispatcher = req.getRequestDispatcher("./index2.jsp");
            dispatcher.include(req, resp);

        }
    }

    public void destroy() {
    }
}