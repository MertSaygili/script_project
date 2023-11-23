package com.example.restservice.service;

import com.example.restservice.model.Student;

import java.util.ArrayList;

public interface StudentService {
    Student getStudentByName(String name);

    ArrayList<Student> getStudents();
}
