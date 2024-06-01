package Practice;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");

        // int a = 74;
        // int b = 36;

        // System.out.println(a+b);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Sum of a and b is " + (a+b));
        System.out.println("Difference of a and b is " + (a-b));
        System.out.println("Product of a and b is " + a*b);
        System.out.println("Division of a and b is " + a/b);
        System.out.println("Mod of a and b is " + a%b);
        
        scanner.close();

    }
}