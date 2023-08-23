package Day8;

//I just checked my gmail and apprently all the code reviews went to spam so I didnt get any notifications and therefore didnt check them.
//I was also pretty confident that I'd be able to write basic java codes without any mistakes, that's also why I didnt really check the reviews till now
//I'm sorry for that and I'll be more careful from now on.
//I will try my best to reduce mistakes based on the reviews you have provided. THANK YOU!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
        //I'm sorry but the first time i started java, the course I was following always used "Sc" for scanner even though it was against java convention.
        //I've always used it like this so I guess I've got really used to it. SO can you please just make this one exception for the code reviews xD.
        //For other variables I always follow java naming conventions.
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
        Sc.close();

        //I will rewrite the codes again based on the suggestions and make sure I dont end up making the same mistakes again.

    }

}
