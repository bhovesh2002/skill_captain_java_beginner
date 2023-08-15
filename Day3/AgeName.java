package Day3;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = Sc.nextLine();

        System.out.println("Enter age: ");
        int age = Sc.nextInt();

        System.out.println("Hello "+name+"! You are "+age+" years old!");
    }




}
