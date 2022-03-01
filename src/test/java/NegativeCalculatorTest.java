import model.*;
import org.testng.annotations.*;

import static model.Calculator.max;
import static model.Calculator.min;
import static org.testng.Assert.assertEquals;

public class NegativeCalculatorTest {
    
    @DataProvider(parallel = true)
    public Object[][] negativeAddData() {
        return new Object[][] {
                {"+", "пять", "-1.0"},
                {"+", "max", "4.0"},

        };
    }
    @DataProvider(parallel = true)
    public Object[][] negativeSubtractionData() {
        return new Object[][] {
                {"-", "6", "@"},
                {"8", "10", "-1"},
        };
    }

    @DataProvider(parallel = true)
    public Object[][] negativeMultiplayData() {
        return new Object[][] {
                {"*", "6", "max" },
                {"*", "/", "-1"},

        };
    }

    @DataProvider(parallel = true)
    public Object[][] negativeDivisionData() {
        return new Object[][] {
                {"/", "6", "0" },


        };
    }


   @Test(dataProvider = "negativeAddData", expectedExceptions = CalculatorException.class)
    public void negativeAddTest(String op, String num1, String num2) {
       Calculator.execute(new String[]{op, num1, num2});


    }
    @Test(dataProvider = "negativeSubtractionData", expectedExceptions = CalculatorException.class)
    public void negativeSubtractionTest(String op, String num1, String num2) {
        Calculator.execute(new String[]{op, num1, num2});
    }

    @Test(dataProvider = "negativeMultiplayData", expectedExceptions = CalculatorException.class)
    public void negativeMultiplayTest(String op, String num1, String num2) {
        Calculator.execute(new String[]{op, num1, num2});
    }

    @Test(dataProvider = "negativeDivisionData", expectedExceptions = CalculatorException.class)
    public void negativeDivisionTest(String op, String num1, String num2) {
        Calculator.execute(new String[]{op, num1, num2});
    }
}
