package Day7;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int[] array = new int[5];
        int i, sum = 0, average, max=0, min=0;
        System.out.println("Enter numbers in array: ");

        for (i=0; i<5; i++){
            array[i] = Sc.nextInt();
            sum = sum + array[i];
            if (i == 0){
                max = array[i];
                min = array[i];
            }else{
                if(array[i]>array[i-1]){
                    max = array[i];
                } else if (array[i]<array[i-1]) {
                    min = array[i];
                }
            }
        }
        average = sum/5;
        System.out.println("Sum of the array is: "+sum);
        System.out.println("Average of array is: "+average);
        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);

    }

}
