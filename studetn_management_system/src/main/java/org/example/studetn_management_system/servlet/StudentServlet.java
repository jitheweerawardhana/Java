package org.example.studetn_management_system.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.studetn_management_system.dto.StudentDto;
import org.example.studetn_management_system.service.impl.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "studentApi", value = "/student/*")

public class StudentServlet extends HttpServlet {

    private StudentServiceImpl studentService;
    private ObjectMapper objectMapper;
    public StudentServlet() {
        this.studentService = new StudentServiceImpl();
        this.objectMapper = new ObjectMapper();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();

        switch (pathInfo) {
            case "/get-all-student":
                List<StudentDto> allStudents = studentService.getAllStudents();
                response.getWriter().write("All student");
                objectMapper.writeValue(response.getWriter(),allStudents);
                response.setStatus(200);

            case"/get-student-by-id" :
                int id = Integer.parseInt(request.getParameter("id"));
                StudentDto studentDto = studentService.getStudentById(id);
                response.getWriter().write("Student founded");
                objectMapper.writeValue(response.getWriter(), studentDto);
                System.out.println("get-student-by-id");
                response.setStatus(200);

            default:
                response.getWriter().write("Unknown path");
                response.setStatus(404);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Student doPost Running!");
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        StudentDto studentDto = new StudentDto();
        studentDto.setId(id);
        studentDto.setName(name);
        studentDto.setAge(age);
        studentService.addStudent(studentDto);
        objectMapper.writeValue(response.getWriter(),studentDto);
        response.setStatus(201);
        System.out.println("Student Created");
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        StudentDto studentDto = new StudentDto();
        studentDto.setId(id);
        studentDto.setName(name);
        studentDto.setAge(age);
        StudentDto updatedStudentDto = studentService.updateStudent(studentDto);
        objectMapper.writeValue(response.getWriter(),updatedStudentDto);
        response.getWriter().write("Student Updated");
        response.setStatus(204);
        System.out.println("Student Updated");
    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean status = studentService.deleteStudent(id);
        if (status) {
            response.getWriter().write("Student Deleted");
            response.setStatus(202);
        }
        else{
            response.getWriter().write("Student Not Deleted");
            response.setStatus(404);
        }
    }
}
