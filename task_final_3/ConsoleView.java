package task_final_3;

import java.util.List;
import java.util.Scanner;


// Представление
public class  ConsoleView{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите простое число:");
        int number = scanner.nextInt();
        boolean isPrime = PrimeCalculator.isPrime(number);
        if (isPrime) {
            System.out.println(number + "is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
        System.out.println("Enter a start number: ");
        int start = scanner.nextInt();
        System.out.println("Enter a end number: ");
        int end = scanner.nextInt();
        List<Integer> primes = PrimeCalculator.calculatePrime(start, end);
        System.out.println("Primes between " + start + " and " + end + ": " + primes);
    }
}
