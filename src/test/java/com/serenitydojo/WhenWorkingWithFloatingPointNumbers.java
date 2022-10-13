package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenWorkingWithFloatingPointNumbers {

    @Test
    public void convertingFromCelciusToFahrenheit() {
        float fromCelcius = 10.00f;
        float toFahrenheit;
        toFahrenheit = (float) ((fromCelcius * 1.8) + 32);

        Assert.assertEquals(toFahrenheit, 50, 0);

    }

    @Test
    public void convertingFromKgToLbs() {
        float fromKg = 5.0f;
        float toLbs;

        toLbs = (float) (fromKg * 2.204623);
        Assert.assertEquals(toLbs, 11.02, 2);
    }
}
