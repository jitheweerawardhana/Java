package org.example.studetn_management_system.service.impl;

import org.hibernate.SessionFactory;
import org.example.studetn_management_system.dto.StudentDto;
import org.example.studetn_management_system.entity.Student;
import org.example.studetn_management_system.service.StudentService;
import org.example.studetn_management_system.utill.GetSessionFactory;
import org.hibernate.Session;



import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

   private GetSessionFactory getSessionFactory = new GetSessionFactory();




    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        SessionFactory sessionFactory = (SessionFactory) getSessionFactory.getSessionFactory();
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

        try(Session session = (Session) getSessionFactory.getSessionFactory()){
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
        SessionFactory sessionFactory = (SessionFactory) getSessionFactory.getSessionFactory();
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
        List<StudentDto> studentDtoList = new ArrayList<>();
        SessionFactory sessionFactory = (SessionFactory) getSessionFactory.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            session.beginTransaction();

            List<Student> studentList = session.createQuery("FROM Student",Student.class).list();
            for(Student student : studentList){
                studentDtoList.add(new StudentDto(student.getId(),student.getName(),student.getAge()));
            }
            session.getTransaction().commit();
        }
        return studentDtoList;
    }

    @Override
    public StudentDto getStudentById(int id) {
        StudentDto studentDto;
        SessionFactory sessionFactory = (SessionFactory) getSessionFactory.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            session.beginTransaction();

            Student student = session.get(Student.class,id);
            if(student == null){
                throw new IllegalAccessException("Student with ID "+ id + "not found.");
            }
            studentDto = new StudentDto(student.getId(),student.getName(),student.getAge());
            session.getTransaction().commit();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return studentDto;
    }
}
