/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.school;

import java.util.ArrayList;

/**
 *
 * @author Mr.Nobody
 */
public class School {

    public static void main(String[] args) {
        
        Classroom class1 = new Classroom("L1", "Classroom 1");
        Classroom class2 = new Classroom("L1", "Classroom 2");
        Classroom class3 = new Classroom("L1", "Classroom 3");
        Classroom class4 = new Classroom("L1", "Classroom 4");
        Classroom class5 = new Classroom("L1", "Classroom 5");
        
        Lesson lesson1 = new Lesson("M1", "Math1",class1);
        Lesson lesson2 = new Lesson("E1", "English1",class2);
        Lesson lesson3 = new Lesson("H1", "History1",class3);
        Lesson lesson4 = new Lesson("G1", "Geography1",class4);
        Lesson lesson5 = new Lesson("P1", "Physics1",class5);
        
        ArrayList<Lesson> lessons = new ArrayList<>(5);
        lessons.add(0, lesson1);
        lessons.add(1, lesson2);
        lessons.add(2, lesson3);
        lessons.add(3, lesson4);
        lessons.add(4, lesson5);
        
        Tutor tut1 = new Tutor("Elias", "Prekas", "041268123", lesson1);
        Tutor tut2 = new Tutor("Maria", "Dami", "180689123", lesson2);
        Tutor tut3 = new Tutor("Eleni", "Gaki", "150165123", lesson3);
        Tutor tut4 = new Tutor("George", "Georgiou", "201084123", lesson4);
        Tutor tut5 = new Tutor("George", "Papageorge", "250275123", lesson5);
        
        Student stud1 = new Student("George", "Bush", "0001", lessons);
        Student stud2 = new Student("John", "Lenon", "0002", lessons);
        Student stud3 = new Student("Jim", "Carry", "0003", lessons);
        Student stud4 = new Student("Dennis", "Dennison", "0004", lessons);
        Student stud5 = new Student("Elon", "Musk", "0005", lessons);
        Student stud6 = new Student("Jeff", "Bezos", "0006", lessons);
        Student stud7 = new Student("Bill", "Gates", "0007", lessons);
        Student stud8 = new Student("Donald", "Duck", "0008", lessons);
        Student stud9 = new Student("Joe", "Biden", "0009", lessons);
        Student stud10 = new Student("Marcous", "Aurelious", "0010", lessons);
        Student stud11 = new Student("Steve", "Jobs", "0011", lessons);
        Student stud12 = new Student("Chris", "Kyle", "0012", lessons);
        Student stud13 = new Student("Genaro", "Contaldo", "0013", lessons);
        Student stud14 = new Student("Vincenzo", "Apetito", "0014", lessons);
        Student stud15 = new Student("Charl", "Bukowski", "0015", lessons);
        Student stud16 = new Student("Valentina", "Pelegrini", "0016", lessons);
        Student stud17 = new Student("Ferderica", "Lombardi", "0017", lessons);
        Student stud18 = new Student("Rezarta", "Duka", "0018", lessons);
        Student stud19 = new Student("Teuta", "Misania", "0019", lessons);
        Student stud20 = new Student("Natalie", "Lamerio", "0020", lessons);
    }
}
