package com.example;
 
// import java.io.IOException;
// import java.io.PrintWriter;

// import javax.servlet.*;
// import javax.servlet.http.*;

// public class HelloController extends HttpServlet {
//     private static final long serialVersionUID = 1L;

//     public void doGet(HttpServletRequest req, HttpServletResponse res)
//     throws ServletException, IOException {
//     PrintWriter out;

//     res.setContentType("text/html; charset=utf-8");
//     out = res.getWriter();

//     out.println("<html><body>");
//     out.println("<h1>Hello Kumasan</h1>");
//     out.println("</body></html>");
//   }
// }

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HelloController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        getServletContext().getRequestDispatcher("/Hello.jsp").include(request, response);
    }
}