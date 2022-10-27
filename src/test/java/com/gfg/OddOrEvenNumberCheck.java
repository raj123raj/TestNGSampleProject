package com.gfg;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OddOrEvenNumberCheck extends TestNG {
    private int evenNumber, oddNumber;

    @BeforeClass
    public void setup() {
    	evenNumber = 100;
    	oddNumber = 59;
    }

    @AfterClass
    public void tearDown() {
    	evenNumber = 0;
    	oddNumber = 0;
    }

    @Test
    public void checkEven() {
        Assert.assertTrue(evenNumber % 2 == 0);
    }
    @Test
    public void checkOdd() {
        Assert.assertTrue(oddNumber % 2 == 1);
    }

}

