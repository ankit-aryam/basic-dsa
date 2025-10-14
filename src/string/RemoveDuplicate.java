package string;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the bloody repetitive string: ");
        String str = scn.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<str.length(); i++){
            set.add(str.charAt(i));
        }

        for(char ch:set){
            System.out.print(ch);
        }

    }
}
