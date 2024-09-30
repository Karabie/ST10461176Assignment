/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc.st10461176assignment;

/**
 *
 * @author kmmak
 */
abstract class Sport {
    
    protected String name = "";
    protected String surname = "";
    protected String id = "";
    protected String sport_name = "";
    protected int age = 0;
    
    
    public void assignValues(String name, String surname, String id, String sport_name, int age){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.sport_name = sport_name;
        this.age = age;
    }
    
    abstract protected void display();
}
