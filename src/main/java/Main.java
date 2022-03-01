import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] args = new String[3];
        System.out.println("Введите действие. Пример:( + , - , / , * )");
        args[0] = in.nextLine();
        System.out.println("Введите аргументы. Пример : 1 1");
        args[1] = in.nextLine();
        args[2] = in.nextLine();
        String answer = Calculator.execute(args);
        System.out.println("Ответ:");
        System.out.println(answer);
    }


    }
}
