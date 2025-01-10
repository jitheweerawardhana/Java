package org.example.studetn_management_system.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import org.example.studetn_management_system.service.impl.StudentServiceImpl;

@WebServlet(name = "studentApi", value = "/student/*")

public class StudentServlet extends HttpServlet {

    private StudentServiceImpl studentService;



}
