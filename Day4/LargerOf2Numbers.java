package Day4;

import java.util.Scanner;

public class LargerOf2Numbers {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Please enter 1st number: ");
        int a = Sc.nextInt();

        System.out.println("Please Enter 2nd number: ");
        int b = Sc.nextInt();

        if (a>=b){
            System.out.println(a+" is greater than "+b);
        }else {
            System.out.println(b+" is greater than "+a);
        }

    }

}
