package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();
        String rvs = "";

        for(int i = str.length()-1; i>=0; i--){
            rvs+=str.charAt(i);
        }

        System.out.println("Reverse String: "+ rvs);


    }
}
