import model.*;
import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;
import static model.Calculator.max;
import static model.Calculator.min;

public class PositiveCalculatorTest {

    @DataProvider(parallel = true)
    public Object[][] positiveAddData() {
        return new Object[][] {
                {"+", max, min, "-1.0"},
                {"+", "5.0", "4.0", "9.0"},
                {"+", "-1", "1", "0.0"},

        };
    }
    @DataProvider(parallel = true)
    public Object[][] positiveSubtractionData() {
        return new Object[][] {
                {"-", "6", "1", "5.0"},
                {"-", "10", "-1", "11.0"},
                {"-", "0", "0", "0.0"},
        };
    }

    @DataProvider(parallel = true)
    public Object[][] positiveMultiplayData() {
        return new Object[][] {
                 {"*", "6", "1", "6.0"},
                {"*", "10", "-1", "-10.0"},
                {"*", "-5", "-10", "50.0"},
        };
    }

/*
    @DataProvider(parallel = true)
    public Object[][] positiveDivisionData() {
        return new Object[][] {
                {"/", "0", "8", "0.000"},
                {"/", "10", "-1", "-10.000"},
                {"/", "5", "5", "1"},
        };
    }*/

    @Test(dataProvider = "positiveAddData")
    public void positiveAddTest(String op, String num1, String num2, String expected) {
       assertEquals(Calculator.execute(new String[] {op, num1, num2}), expected,  "Ошибка в вычислениях!");

    }
    @Test(dataProvider = "positiveSubtractionData")
    public void positiveSubtractionTest(String op, String num1, String num2, String expected) {
        assertEquals(Calculator.execute(new String[] {op, num1, num2}), expected,  "Ошибка в вычислениях!");
    }

    @Test(dataProvider = "positiveMultiplayData")
    public void positiveMultiplayTest(String op, String num1, String num2, String expected) {
        assertEquals(Calculator.execute(new String[] {op, num1, num2}), expected,  "Ошибка в вычислениях!");
    }
  /*  @Test(dataProvider = "positiveDivisionData")
    public void positiveDivisionTest(String op, String num1, String num2, String expected) {
        assertEquals(Calculator.execute(new String[] {op, num1, num2}), expected,  "Ошибка в вычислениях!");
    }*/
}
