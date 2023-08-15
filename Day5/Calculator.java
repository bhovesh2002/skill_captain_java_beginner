package Day5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator");

        System.out.println("Enter 1st number: ");
        int a = Sc.nextInt();

        System.out.println("Enter operation: 1: add, 2: subtract, 3: multiply, 4: divide");
        int operator = Sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = Sc.nextInt();

        switch (operator){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Operation!");
        }

    }
}
