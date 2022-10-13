package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenWorkingWithStrings {

    @Test
    public void convertingToLowerCase() {
        String first = "ALL UPPERCASE";
        String second = first.toLowerCase();

        Assert.assertEquals(second, "all uppercase");
    }

    @Test
    public void convertingToUpperCase() {
        String first = "all lowercase";
        String second = first.toUpperCase();

        Assert.assertEquals(second, "ALL LOWERCASE");
    }

    @Test
    public void trimmingExtraSpace() {
        String first = "       all lowercase        ";
        String second = first.trim();

        Assert.assertEquals(second, "all lowercase");
    }

    @Test
    public void replacingTextInAString() {
        String first = "all lowercase";
        String second = first.replace("all", "some");

        Assert.assertEquals(second, "some lowercase");
    }
}
