package Day10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDuplicate {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a series of numbers separated by space: ");
        String stringNumbers = Sc.nextLine();

        String[] numbersArray = stringNumbers.split(" ");
        Set<Integer> numbers = new HashSet<Integer>();

        for (String stringNumber: numbersArray ){
            int number = Integer.parseInt(stringNumber);
            if (numbers.contains(number)){
                System.out.println(number + " is duplicate");
            }else {
                System.out.println(number + " is Unique");
                numbers.add(number);
            }
        }

        Sc.close();
    }
  //This question was a little confusing even though it was easier than the previous one. The fact that the first line in the requirements section stated
  //that the numbers need to be saved in a set, made it feel like we need to store numbers in set directly and as soon as when the user inputs the string.
}
