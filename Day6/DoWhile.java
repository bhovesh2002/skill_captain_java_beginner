package Day6;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int i;
        do {
            System.out.println("Enter any number between 1-10: ");
            i = Sc.nextInt();
        }while (i<1 || i>10);

        System.out.println("Your number is: "+i);
    }

}
