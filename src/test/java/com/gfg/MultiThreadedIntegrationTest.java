package com.gfg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiThreadedIntegrationTest {

    @Test(threadPoolSize = 5, invocationCount = 10, timeOut = 1000)
    public void checkForCount() {
        int count = Thread.activeCount();
        Assert.assertTrue(count > 2);
    }

}
