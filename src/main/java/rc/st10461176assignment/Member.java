/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc.st10461176assignment;

/**
 *
 * @author kmmak
 */
public class Member extends Sport {

    @Override
    protected void display() {
        System.out.println(this);
        System.out.println("Name : " + name + '\n' +
                            "Surname : " + surname + '\n' +
                            "ID : " + id + '\n' +
                            "Sport Name : " + sport_name + '\n' + 
                            "Age : " + age);
    }
    
}
