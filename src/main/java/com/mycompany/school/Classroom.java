package com.mycompany.school;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mr.Nobody
 */
public class Classroom {

    String classroomCode;
    String classroom;
    
    public Classroom(String classroomCode, String classroom) {
    }

    public String getClassroomCode() {
        return classroomCode;
    }

    public void setClassroomCode(String classroomCode) {
        this.classroomCode = classroomCode;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    protected void displayClassroomInfo(){
        System.out.println("Classroom code: " + classroomCode + " Classroom: " + classroom);}
    
}
