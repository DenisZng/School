/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

import java.util.ArrayList;

/**
 *
 * @author Mr.Nobody
 */
public class Student extends Person{

    String studentId;
    ArrayList<Lesson> lessons;
    public Student(String name, String surname, String studentId,ArrayList<Lesson> lessons) {
        super(name, surname);
       
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = new ArrayList<Lesson>(5);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    protected void displayStudentInfo(){
    displayPersonInfo();
        System.out.println("Student ID: " + studentId + " Lessons "+ lessons);}
    
}
