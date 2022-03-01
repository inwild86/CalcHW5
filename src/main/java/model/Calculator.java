package model;

public class Calculator {

    public static String max = String.valueOf(Integer.MAX_VALUE);
    public static String min = String.valueOf(Integer.MIN_VALUE);

    public static String execute(String[] params) {
        double num1;
        double num2;
        String answer;
        //форматируем строку в число типа Double
        try {
            num1 = Double.parseDouble(params[1]);
            num2 = Double.parseDouble(params[2]);
        }
        catch (RuntimeException e) {
            throw new CalculatorException("Число введено не верно");
        }

        switch (params[0]) {
            case "+":
                answer = add(num1, num2);
                break;
            case "-":
                answer = min(num1, num2);
                break;
            case "*":
                answer = mult(num1, num2);
                break;
            case "/":
                answer =  div(num1, num2);
                break;
            default:
                throw new CalculatorException(params[0] + " введено не опознанное выражение");
        }
        borders(Double.parseDouble(answer));
        return answer;
    }

    public static void borders(double num) {
        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) {
            throw new CalculatorException("Число выходит за границы допустимого");
        }
    }

    public static String add(double num1, double num2) {
        return String.valueOf(num1 + num2);
    }

    public static String min(double num1, double num2) {
        return String.valueOf(num1 - num2);
    }

    public static String mult(double num1, double num2) {
        return String.valueOf(num1 * num2);
    }

    public static String div(double num1, double num2) {
        if (num2 == 0) {
            throw new CalculatorException("Деление на 0");
        }
        else {
            return String.format("%.3f", num1 / num2);
        }
    }

}

