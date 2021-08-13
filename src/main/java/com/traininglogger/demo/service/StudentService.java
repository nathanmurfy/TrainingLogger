package com.traininglogger.demo.service;

import com.traininglogger.demo.dao.StudentDAO;
import com.traininglogger.demo.model.Student;

public class StudentService {

    private StudentDAO studentDAO;
    public int insertStudent(Student student){
        return studentDAO.insertStudent(student);
    }
}
