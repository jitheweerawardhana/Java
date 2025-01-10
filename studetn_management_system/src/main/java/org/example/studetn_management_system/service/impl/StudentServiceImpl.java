package org.example.studetn_management_system.service.impl;

import com.mysql.cj.xdevapi.SessionFactory;
import org.example.studetn_management_system.dto.StudentDto;
import org.example.studetn_management_system.entity.Student;
import org.example.studetn_management_system.service.StudentService;
import org.example.studetn_management_system.utill.GetSessionFactory;
import org.hibernate.Session;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final GetSessionFactory getSessionFactory;

    public StudentServiceImpl() {
        this.getSessionFactory = new GetSessionFactory();
    }

    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        SessionFactory sessionFactory = getSessionFactory.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            session.beginTransaction();

            Student student = new Student();
            student.setId(studentDto.getId());
            student.setName(studentDto.getName());
            student.setAge(studentDto.getAge());

            session.persist(student);
            session.getTransaction().commit();
        }
        return studentDto;
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto) {
        SessionFactory sessionFactory = getSessionFactory.getSessionFactory();
        try(Session session = getSessionFactory.getSessionFactory()){
            session.beginTransaction();

            Student currentStudent = session.createQuery("FROM Student where id =:id",Student.class)
                    .setParameter("id",studentDto.getId())
                    .uniqueResult();

            if(currentStudent == null){
                throw new IllegalAccessException("Student with ID "+studentDto.getId()+"not found.");
            }
            currentStudent.setName(studentDto.getName());
            currentStudent.setAge(studentDto.getAge());
            session.update(currentStudent);

            session.getTransaction().commit();

            studentDto.setName(currentStudent.getName());
            studentDto.setAge(currentStudent.getAge());
        }
        catch (Exception e){
            throw new RuntimeException("Failed to update student: "+e.getMessage(),e);
        }
        return studentDto;
    }

    @Override
    public boolean deleteStudent(Integer id) {
        boolean status;
        SessionFactory sessionFactory = getSessionFactory.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            session.beginTransaction();

            Student student = session.get(Student.class,id);
            if(student != null){
                session.remove(student);
                session.getTransaction().commit();
                status = true;
            }
            else {
                throw new IllegalAccessException("Student with ID "+ id + "not found.");
            }
        }
        catch (Exception e){
            throw new RuntimeException("Failed to delete student: "+e.getMessage(),e);
        }
        return status;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return List.of();
    }

    @Override
    public StudentDto getStudentById(int id) {
        return null;
    }
}
