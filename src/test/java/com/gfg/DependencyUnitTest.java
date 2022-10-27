package com.gfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyUnitTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DependencyUnitTest.class);

    private String userEmail = "geek@gfg.com";

    @Test
    public void checkForValidMail() {
        boolean validEmail = userEmail.contains("@");
        Assert.assertEquals(validEmail, true);
    }

    @Test(dependsOnMethods = {"checkForValidMail"})
    public void logInWhenEmailValid() {
        LOGGER.info("Given Email {} valid >> and logging in", userEmail);
    }
}

