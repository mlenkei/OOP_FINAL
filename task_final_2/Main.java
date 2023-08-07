package task_final_2;

// SimpleCalculator

import java.util.Scanner;
 
public class Main  {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int operation; // Integers 1-4 represent an operation
		double firstNumber;
		double secondNumber;
		double result;
		
		System.out.println("Выберите операцияю:\n1-СлоЖения\n2-Вычитания\n3-УмноЖения\n4-Деление\n5-Выход");
		
		do {
			operation = input.nextInt();
		
			if (operation == 1) { // СлоЖение
				System.out.print("Введите первое число: ");
				firstNumber = input.nextDouble();

				System.out.print("Введите второе число: ");
				secondNumber = input.nextDouble();

				result = firstNumber + secondNumber;

				System.out.print("Сумма чисел равна: " + result);
			
			} else if (operation == 2) { // Вычитание

				System.out.print("Введите первое число: ");
				firstNumber = input.nextDouble();

				System.out.print("Введите второе число: ");
				secondNumber = input.nextDouble();

				result = firstNumber - secondNumber;

				System.out.print("Результат вычитания: " + result);
			
			} else if (operation == 3) { // УмноЖение
			
				System.out.print("Введите первое число: ");
				firstNumber = input.nextDouble();

				System.out.print("Введите второе число: ");
				secondNumber = input.nextDouble();

				result = firstNumber * secondNumber;

				System.out.print("Результат умноЖения: " + result);
			
			} else if (operation == 4) { // Деление
			
				System.out.print("Введите первое число: ");
				firstNumber = input.nextDouble();

				System.out.print("Введите второе число: ");
				secondNumber = input.nextDouble();

				result = firstNumber / secondNumber;

				System.out.print("Результат деления:" + result);
				
			} else if (operation == 5){
				System.out.println("Goodbye");
				System.exit(0);
				
			} else { // My own personal touch
				
				System.out.println("You're doing it wrong.");
			}
		} while (operation < 1 || operation > 5);
	}
}
