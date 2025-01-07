/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author Mr.Nobody
 */
public abstract class Person {
    
    String name;
    String surname;
    
    public Person (String name,String surname){
 
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    protected void displayPersonInfo(){
        System.out.println("Name : " + name + " Surname : " + surname);}
}