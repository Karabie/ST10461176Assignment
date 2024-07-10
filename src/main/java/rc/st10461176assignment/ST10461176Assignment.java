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

    public static void main(String[] args) {
        System.out.println("Hello World!");
        mainMenu();
        menuItem();
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
    
    public static int captureStudent(int studentID, String studentName, int studentAge, String studentEmail, String studentCourse){
        int item = 0;
        try{
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
        }
        return item;
        }
    
    public static int invalidAge(String Exception){
        int age = 0;
        try{
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter the student age: " + Exception + '\n'
                                                              +"You have enetered a incorrect student age!!!" + '\n'
                                                              +"Please re-enter the student age >>"));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return age;
    } 
    
    
}

