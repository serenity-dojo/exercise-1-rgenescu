package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether() {
        int initialYear = 1985;
        int targetYear = 0;

        int timeJump = 30;
        targetYear = initialYear + timeJump;

        Assert.assertEquals(targetYear, 2015);

    }
}
