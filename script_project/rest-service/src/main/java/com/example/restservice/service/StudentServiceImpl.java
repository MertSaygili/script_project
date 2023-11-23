package com.example.restservice.service;

import com.example.restservice.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class StudentServiceImpl implements  StudentService{

    ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("1", "Mert", "Saygili", "mert71719601@gmail.com", "09.12.2019", "09.01.2001"),
            new Student("2", "Melih", "Acil", "melih_acil@gmail.com", "24.12.2019", "15.07.2001"),
            new Student("3", "Saltuk", "Ozelgul", "saltuk@gmail.com", "13.07.2018", "24.08.2001"),
            new Student("4", "Isa", "Aslanol", "isa@gmail.com", "24.01.2018", "12.03.2003"),
            new Student("5", "Melisa", "Kirik", "melisa@gmail.com", "02.09.2017", "08.03.2002")

    ));
    public Student getStudentByName(String id){
        for(int i=0; i<students.size(); i++) {
            if (id.compareTo(students.get(i).getId()) == 0) {
                return students.get(i);
            }
        }
        return null;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }
}
