package com.example.restservice.model;

public class Student {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String entryDate;

    private String birthDate;

    public Student(String id, String name, String surname, String email, String entryYear, String birthDate){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.entryDate = entryYear;
        this.birthDate = birthDate;
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getEmail(){return this.email;}
    public String getEntryDate() {return this.entryDate;}
    public String getBirthDate() {return this.birthDate; }

}