package com.example.tomcat_server_test;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static com.example.tomcat_server_test.Values.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
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

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        String response = PROTOCOL_VERSION + DELIMITER + STATUS_CODE_OK + DELIMITER + "OK\r\n" +
////                TEXT_CONTENT_TYPE + "\r\n" +
////                CONNECTION_STATUS + "\r\n\r\n";
////        String result = response + s + STYLE_CSS_PAGE;
////        outputStream.write(result.getBytes());
////        outputStream.flush();
//    }

    public void destroy() {
    }
}