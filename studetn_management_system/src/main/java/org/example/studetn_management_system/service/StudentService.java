package org.example.studetn_management_system.service;

import org.example.studetn_management_system.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto addStudent(StudentDto studentDto);
    StudentDto updateStudent(StudentDto studentDto);
    boolean deleteStudent(Integer id);
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(int id);
}
