package com.gfg;

import org.testng.annotations.Test;

public class TimeOutCheckTest {

    //@Test(timeOut = 1000)
    @Test(timeOut = 1000, enabled = false)
    public void asNoStoppingPointItRunsTimeOut() {
        while (true) ;
    }
}
