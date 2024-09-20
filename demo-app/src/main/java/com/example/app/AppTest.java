package com.example.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAdd() {
        assertTrue(App.add(2, 3) == 5);
    }
}
