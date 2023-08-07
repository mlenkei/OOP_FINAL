package task_final_4;

import java.util.Scanner;

public class View {
    private  static final Scanner scanner = new Scanner(System.in);

    public static String getInput(){
        System.out.println("Введите выра;ение, разделяя операторы и операнды пробелами: ");
        return  scanner.nextLine();
    }
    public static void displayResult(int result) {
        System.out.println("Результат: " + result);
    }
}
