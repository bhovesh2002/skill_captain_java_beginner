package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Welcome to your Grocery List!");
        List<String> groceryList = new ArrayList<>();
        groceryList.add("Wheat");
        groceryList.add("Rice");
        groceryList.add("Oats");

        System.out.println("Press 1 to add items to your list");
        System.out.println("Press 2 to remove items to your list");
        System.out.println("Press 3 to print items in your list");
        System.out.println("Press 4 to check a specific item in your list");
        System.out.println("Press 5 to  clear your entire list");


        int i = 0;


        while (i != 6){
            System.out.println("Please enter your choice: ");
            i = Sc.nextInt();

            Sc.nextLine();

            switch (i) {
                case 1 -> {
                    System.out.println("Please Enter item name:");
                    String item = Sc.nextLine();
                    groceryList.add(item);
                }
                case 2 -> {
                    System.out.println("Enter the item you want to remove: ");
                    String remove = Sc.nextLine();
                    groceryList.remove(remove);
                }
                case 3 -> {
                    System.out.println("Your Grocery List is as follows: ");
                    System.out.println(groceryList);
                }
                case 4 -> {
                    System.out.println("Enter the item you want to check: ");
                    String check = Sc.nextLine();
                    System.out.println(groceryList.contains(check));
                }
                case 5 -> {
                    groceryList.clear();
                    System.out.println("Your List has been cleared!");
                }
                default -> System.out.println("Wrong number entered");
            }
        }

    }

}
