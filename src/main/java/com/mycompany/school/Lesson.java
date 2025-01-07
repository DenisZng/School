/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author Mr.Nobody
 */
public class Lesson {
    
    String lessonCode;
    String lesson;
    Classroom classroom;
    public Lesson(String lessonCode, String lesson, Classroom classroom){}

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getLessonCode() {
        return lessonCode;
    }

    public void setLessonCode(String lessonCode) {
        this.lessonCode = lessonCode;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
    protected void displayLessonInfo(){
        System.out.println("Lesson code: " + lessonCode + " Lesson: " + lesson + " Classroom: " + classroom);}
}
