/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rc.st10461176assignment;
import javax.swing.*;

/**
 *
 * @author kmmak
 */
public class ST10461176Assignment {
 static Student studentObj = new Student();
 static Member memberObj = new Member();
    public static void main(String[] args) {
        boolean menuLoop = true;
        mainMenu();
        while(menuLoop){
            int choice = menuItem(); 
            switch (choice){
                case 1 -> captureStudent();
                case 2 -> {
                    int search = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to search"));
                    studentObj.SearchStudent(search);
                }
                case 3 -> {
                    int search = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to Delete"));
                    studentObj.DeleteStudent(search);
                } case 4 ->{
                    studentObj.StudentReport();
                }      
                case 5 -> {
                    studentObj.Exit();
                    menuLoop = false;
                }
                default -> {
                    menuLoop = true;
                }
                    
            }
                
            
        }
        
       //Part Two
       //Store sport member sytem
       String name = JOptionPane.showInputDialog("PLease Enter Name of sport member");
       String surname = JOptionPane.showInputDialog("PLease Enter Surname of sport member");
       String id = JOptionPane.showInputDialog("Please Enter ID of Sport Member");
       String sport_name = JOptionPane.showInputDialog("Please Enter Name of Sport for the Member");
       int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age of Sport Member"));
       
       //initialize the member
       memberObj.assignValues(name, surname, id, sport_name, age);
       
       //display member details
       memberObj.display();
      
        
        
    }
    public static int mainMenu(){
        int item = 0;
        try{
        item = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION" + '\n'
                                   +"**************************************************" + '\n'
                                   +"Enter (1) to launch menu or any other key to exit"));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return item;
        }
    public static int menuItem(){
        int item = 0;
        try{
           item = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items:" + '\n' +
                                    "(1) Capture a new student." + '\n' + 
                                    "(2) Search for a student." + '\n' +
                                    "(3) Delete a student." + '\n' +
                                    "(4) Print student report." + '\n' +
                                    "(5) Exit Application.")); 
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
   return item;
    }
    
    public static void  captureStudent(){
        int item = 0;
        /*try{
        JOptionPane.showInputDialog(        "CAPTURE A NEW STUDENT" + '\n'
                                           +"***********************************" + '\n'
                                           +"Enter the student id: " + studentID + '\n'
                                           +"Enter the student name: " + studentName + '\n'
                                           +"Enter the student age " + studentAge + '\n'
                                           +"Enter the student email: " + studentEmail + '\n'
                                           +"Enter the student course: " + studentCourse + '\n'
                                           +"Enter (1) to launch menu or any other key to exit");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }*/
            boolean ageValid = false;
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Student ID"));
            String name = JOptionPane.showInputDialog("Enter Student Name");
            int age = 0;
            while(ageValid == false){
                
                try{
                 age = Integer.parseInt(JOptionPane.showInputDialog("Enter Student age greater than 16 years old"));
                if(age>=16){
                    ageValid = true;
                }else{
                    System.out.println("You have entered incorrect student age!!! : " + age);
                }
                }catch(Exception e){
                    System.out.println("You have entered an incorrect student age!!! : " + e);
                }
            }
            String email = JOptionPane.showInputDialog("Enter student email");
            String course = JOptionPane.showInputDialog("Enter student course");
            
            studentObj.SaveStudent(id, name, age, email, course);
            
        
        }
    
    /*public static int invalidAge(String Exception){
        int age = 0;
        try{
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter the student age: " + Exception + '\n'
                                                              +"You have enetered a incorrect student age!!!" + '\n'
                                                              +"Please re-enter the student age >>"));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return age;
    } */
    
    
    
}

