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
public class ST10461176AssignmentTest {
    
    public ST10461176AssignmentTest() {
    }
 
    /**
     * Test of main method, of class ST10461176Assignment.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ST10461176Assignment.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainMenu method, of class ST10461176Assignment.
     */
    @Test
    public void testMainMenu() {
        System.out.println("mainMenu");
        int expResult = 0;
        int result = ST10461176Assignment.mainMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of menuItem method, of class ST10461176Assignment.
     */
    @Test
    public void testMenuItem() {
        System.out.println("menuItem");
        int expResult = 0;
        int result = ST10461176Assignment.menuItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of captureStudent method, of class ST10461176Assignment.
     */
    @Test
    public void testCaptureStudent() {
        System.out.println("captureStudent");
        ST10461176Assignment.captureStudent();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
