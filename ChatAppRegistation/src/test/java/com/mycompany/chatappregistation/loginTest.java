/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatappregistation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class loginTest {
    
    public loginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class login.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("Username successfully captured");
        String username = "kyl_1";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("Password successfully captured.");
        String password = "Ch&&sec@ke99!";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkCellphoneNumber method, of class login.
     */
    @Test
    public void testCheckCellphoneNumber() {
        System.out.println("Cellphone number successfully");
        String cellphone = "+278338968976";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkCellphoneNumber(cellphone);
        assertEquals(expResult, result);
    }

    /**
     * Test of registeredUser method, of class login.
     */
    @Test
    public void testRegisteredUser() {
        System.out.println("User successfully registered");
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        String cellphone = "+27838968976";
        login instance = new login();
        String expResult = "User successfully registered";
        String result = instance.registeredUser(username, password, cellphone);
        assertEquals(expResult, result);
    }

    /**
     * Test of loginUser method, of class login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("");
        String registeredUser = "kyl_1";
        String registeredPassword = "Ch&&sec@ke99";
        String loginUsername = "kyl_1";
        String loginPassword = "Ch&&sec@ke99";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.loginUser(registeredUser, registeredPassword, loginUsername, loginPassword);
        assertEquals(expResult, result);
    }

    /**
     * Test of returnLoginStatus method, of class login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String firstName = "";
        String lastName = "";
        String registeredUser = "kyl_1";
        String registeredPassword = "Ch&&sec@ke99";
        String loginUsername = "kyl_1";
        String loginPassword = "Ch&&sec@ke99";
        login instance = new login();
        String expResult = "Welcome " + firstName + " " + lastName + ", it is great to see you again: ";
        String result = instance.returnLoginStatus(firstName, lastName, registeredUser, registeredPassword, loginUsername, loginPassword);
        assertEquals(expResult, result);
    }
    
}
