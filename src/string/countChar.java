package string;

import java.util.*;

public class countChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scn.nextLine();
        System.out.println("String Length: "+str.length());
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int count=0;

        for(int i = 0; i<str.length(); i++){
            if(list.contains(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Vowals in string: "+count);
    }

}
