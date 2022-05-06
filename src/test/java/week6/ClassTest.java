package week6;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassTest {
    @BeforeMethod
    public void setup() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void end() {
        System.out.println("After method");
    }

    @Test
    void addTwoNumbers() {
        System.out.println("Inside method addTwoNumbers");
        Assert.assertEquals(4.0, Class.add(2, 2));
    }

    @Test(dataProvider = "getData")
    void multiplyTwoNumbers(int input1, int input2, double expectedValue) {
        System.out.println("Inside method multiplyTwoNumbers and working with the input: " + input1 + " and " + input2);

        double actualValue = Class.multiply(input1, input2);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][3];
        data[0][0] = 2;
        data[0][1] = 2;
        data[0][2] = 4;
        data[1][0] = -2;
        data[1][1] = -2;
        data[1][2] = 4;
        data[2][0] = 1;
        data[2][1] = 0;
        data[2][2] = 0;

        return data;
    }
}