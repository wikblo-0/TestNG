package week6;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTest2 {
    @BeforeMethod
    public void setup2() {
        System.out.println("Before method (2)");
    }

    @AfterMethod
    public void end2() {
        System.out.println("After method (2)");
    }

    @Test
    void addTwoNumbers2() {
        System.out.println("Inside method addTwoNumbers2");
        Assert.assertEquals(4.0, Class.add(2, 2));
    }
}
