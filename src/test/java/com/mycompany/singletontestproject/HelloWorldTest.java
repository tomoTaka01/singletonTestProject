/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singletontestproject;

import java.util.Locale;
import java.util.Locale;
import mockit.Expectations;
import mockit.NonStrictExpectations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomo
 */
public class HelloWorldTest {
    @mockit.Mocked
    final System system = null;
    
    public HelloWorldTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sayHello method, of class HelloWorld.
     */
    @Test
    public void testSayHello1InJapanese() {
        new NonStrictExpectations(){
            {
              System.currentTimeMillis();
              result=1000 * 60 * 60 * 1L;
            }
        };
        HelloWorld instance = new HelloWorld();
        String expResult = "こんにちは";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        new NonStrictExpectations(){
            {
              System.currentTimeMillis();
              result=1000 * 60 * 60 * 10L;
            }
        };
        expResult = "こんばんは";
        result = instance.sayHello();
        assertEquals(expResult, result);
    }
    @Test
    public void testSayHelloInEnglish(){
        new NonStrictExpectations(){
            {
              System.currentTimeMillis();
              result=1000 * 60 * 60 * 1L;
            }
        };
        Locale.setDefault(Locale.ENGLISH);
        HelloWorld instance = new HelloWorld();
        String expResult = "Good Morning";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        new NonStrictExpectations(){
            {
              System.currentTimeMillis();
              result=1000 * 60 * 60 * 10L;
            }
        };
        expResult = "Good Aftermoon";
        result = instance.sayHello();
        assertEquals(expResult, result);
    }
}
