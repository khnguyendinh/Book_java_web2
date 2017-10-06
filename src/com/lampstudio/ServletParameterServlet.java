package com.lampstudio;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by KHOAND_ADMIN on 10/6/2017.
 */
@WebServlet(
    name = "servletParameterServlet",
    urlPatterns = {"/servletParameters"},
        initParams = {
        @WebInitParam(name = "database", value = "CustomerSupport"),
        @WebInitParam(name = "server", value = "10.0.12.5")
}
)
public class ServletParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig c = this.getServletConfig();
        PrintWriter writer = resp.getWriter();
        writer.append("database: ").append(c.getInitParameter("database"))
                .append(", server: ").append(c.getInitParameter("server"));
    }
}
