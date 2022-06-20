/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author ST10240848
 */
public class Mary_Tshivhula_Prog5121_Task3Test extends TestCase 
{
    
    public Mary_Tshivhula_Prog5121_Task3Test(String testName) 
    {
     String expectedString ="Add ask Feature";
     String Actual= new String();
        Object actual = null;
     assertEquals(expectedString,actual);
        
        
    }

    public boolean testMain() 
    {
        String expectedString = "Create add Task ta ad task Users";
        return(expectedString.length() <= 50);
        
        
        
    }

    public void testGetUserDetais() 
    {
    String expectedString = "Mike Smith";
        System.out.println("Mike Smith");    
        
        
    }

    public boolean testLogin(boolean returntotalHours) 
    {
     int totalHours = 10;
     return returntotalHours;
     
        
        
    }
    
    
}
