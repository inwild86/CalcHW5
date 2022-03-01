import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] params = new String[3];
     //   System.out.println("Введите действие. Пример:( + , - , / , * )");
        params[0] = in.nextLine();
     //   System.out.println("Введите первый аргумент. Пример : 1");
        params[1] = in.nextLine();
      //  System.out.println("Введите второй аргумент. Пример : 1");
        params[2] = in.nextLine();
        String answer = Calculator.execute(params);
      //  System.out.println("Ответ:");
        System.out.println(answer);
    }


    }

