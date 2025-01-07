/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author Mr.Nobody
 */
public class Tutor extends Person{
    
   String amka;
   Lesson lesson;
   public Tutor(String name, String surname, String amka, Lesson lesson){
   super(name, surname);
   
    
}

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }
    protected void displayTutorInfo(){
    displayPersonInfo();
        System.out.println("Amka " + amka + " Lesson " + lesson);}
}