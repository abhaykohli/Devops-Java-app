package com.example.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    
    /**
     * Test for the add method in the App class.
     */
    @Test
    public void testAdd() {
        assertTrue(App.add(2, 3) == 5);
    }

    /**
     * A simple test to check if the application is working correctly.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }
}
