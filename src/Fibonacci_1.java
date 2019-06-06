//Write a simple Java program which will print Fibonacci series e.g. 1 1 2 3 5 8 13 ... . up to a given number

import java.util.Scanner;

public class Fibonacci_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("until which number?");
        int number = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        while (n2 <= number){
            System.out.print(n2 + " ");
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
    }
}