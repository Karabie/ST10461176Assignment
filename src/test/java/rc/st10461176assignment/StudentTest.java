/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rc.st10461176assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kmmak
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
   

    /**
     * Test of SaveStudent method, of class Student.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("SaveStudent");
        int id = 0;
        String name = "";
        int age = 0;
        String email = "";
        String course = "";
        Student instance = new Student();
        instance.SaveStudent(id, name, age, email, course);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of SearchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("SearchStudent");
        int id = 0;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.SearchStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("DeleteStudent");
        int id = 0;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.DeleteStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of StudentReport method, of class Student.
     */
    @Test
    public void testStudentReport() {
        System.out.println("StudentReport");
        Student instance = new Student();
        instance.StudentReport();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Exit method, of class Student.
     */
    @Test
    public void testExit() {
        System.out.println("Exit");
        Student instance = new Student();
        instance.Exit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
