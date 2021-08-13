package com.traininglogger.demo.dao;

import com.traininglogger.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    List<Student> studentList = new ArrayList<>();


    @Override
    public int insertStudent(Student student) {
        studentList.add(student);
        return 1;
    }
}
