/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc.st10461176assignment;

import java.util.ArrayList;

/**
 *
 * @author kmmak
 */
public class Student {
   ArrayList<Person> Students = new ArrayList<Person>();
   Person persons [];
   public void SaveStudent(int id, String name,int age,String email, String course){
       Person p = new Person();
       p.setAge(age);
       p.setName(name);
       p.setCourse(course);
       p.setId(id);
       p.setEmail(email);
       Students.add(p);
   }
   public boolean SearchStudent(int id){
       for (int i = 0; i < Students.size(); i++){
           Person f = Students.get(i);
           
           if(f != null){
               if(f.id == id){
                    System.out.println("Found Student ID : " + id);
                    return true;
               }
            }
       }
     return false;
     
   }
   public boolean DeleteStudent(int id){
       for(int c = 0; c < Students.size(); c++){
           Person f = Students.get(c);
           if(f.id == id){
               Students.remove(c);
               System.out.println("Student Removed Succesfully");
               return true;
           }
       }
       return false;
   }
   public void StudentReport(){
       for(int c = 0; c < Students.size();c++){
           Person f = Students.get(c);
           System.out.println("STUDENT " + c);
           System.out.println("-----------------------------------");
           System.out.println("STUDENT ID : " + f.id);
           System.out.println("STUDENT NAME : " + f.name);
           System.out.println("STUDENT AGE : " + f.age);
           System.out.println("STUDENT EMAIL : " + f.email);
           System.out.println("STUDENT COURSE : " + f.course);
           System.out.println("-----------------------------------");
       }
       
   }
   public void Exit(){
       
   }
}
