package com.example.estore;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

public class ServletDemo3 extends HttpServlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        if(servletConfig != null){
            Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
            while (initParameterNames.hasMoreElements()){
                String name = initParameterNames.nextElement();
                String value = servletConfig.getInitParameter(name);
                System.out.println("name:" + name +"\nvalue:" + value);
            }
        }else {
            System.out.println("配置文件获取失败！");
        }

    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void destroy() {
        System.out.println("已断开服务器连接");
    }
}
