package com.froyo.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloWorldServlet
 */
@WebServlet(
        name = "HelloWorldServlet",
        urlPatterns = {"/hello"}
)
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServletOutputStream out = resp.getOutputStream();
        try {
            out.write("Servlet: Hello Webappstarter World".getBytes());
        } finally {
            out.flush();
            out.close();
        }
    }

}
