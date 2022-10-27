package com.gfg;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PriorityUnitTest {

    @Test(priority = 1)
    public void stringToIntCheck() {
        String testString = "100";
        assertTrue(Integer.valueOf(testString) instanceof Integer);
    }

    @Test(priority = 2)
    public void intToStringCheck() {
        int testInt = 100;
        assertTrue(String.valueOf(testInt) instanceof String);
    }

}
