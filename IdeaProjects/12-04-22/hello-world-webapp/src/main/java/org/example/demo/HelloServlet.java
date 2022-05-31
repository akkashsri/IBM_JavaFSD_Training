package org.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public HelloServlet() {
        super();

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        out.println("<h1>Hello World Hello Servlet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
