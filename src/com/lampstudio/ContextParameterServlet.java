package com.lampstudio;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
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
    name = "contextParameterServlet",
    urlPatterns = {"/contextParameters"}
)
public class ContextParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext c = this.getServletContext();
        PrintWriter writer = resp.getWriter();

        writer.append("settingOne: ").append(c.getInitParameter("settingOne"))
                .append(", settingTwo: ").append(c.getInitParameter("settingTwo"));
    }
}
