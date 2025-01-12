package org.example.studetn_management_system.utill;

import org.example.studetn_management_system.dto.StudentDto;
import org.example.studetn_management_system.entity.Student;
import org.modelmapper.ModelMapper;

public class Converter {
    private ModelMapper modelMapper;

    public Converter() {
        this.modelMapper = new ModelMapper();
    }

    public Student studentDtoToStudent(StudentDto studentDto) {
        return modelMapper.map(studentDto, Student.class);
    }

    public StudentDto studentToStudentDto(Student student) {
        return modelMapper.map(student, StudentDto.class);
    }
}
