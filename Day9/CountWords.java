package Day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter paragraph or line: ");
        String para = Sc.nextLine();

        Map<String, Integer> hash = new HashMap<String, Integer>();

        int max = para.length();
        System.out.println(para.length());

        //removes punctuations and lower cases the whole paragraph
        String paraPunct = para.replaceAll("\\p{Punct}","").toLowerCase();

        //splits the paragraph into words
        String[] words = paraPunct.split(" ");

        //if the key doesnt exists, it will create one with value 1, otherwise it will replace the previous key when it 
        // finds that the key exists and also increase the value by 1
        for(String token: words) {
            if(!hash.containsKey(token)){
                hash.put(token, 1);
            }else {
                hash.put(token, hash.get(token) + 1);
            }
        }

        //print words with their frequency
        System.out.println(hash);

        System.out.println(para);

        scanner.close();

        //i just checked my gmail and apprently all the code reviews went to spam so i didnt get any notifications and therefore didnt check them.
        //i will try my best to reduce mistakes based on the reviews you have provided. THANK YOU!

    }

}
