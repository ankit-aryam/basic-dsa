package string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String first = scn.nextLine().toLowerCase();
        System.out.println("Enter second String: ");
        String second = scn.nextLine().toLowerCase();

        char[] fArray = first.toCharArray();
        Arrays.sort(fArray);
        char[] sArray = second.toCharArray();
        Arrays.sort(sArray);
        boolean flag = true;
        for(int i =0,j=0; i< fArray.length && j<sArray.length; i++,j++){
            if(fArray[i]!=sArray[j]){
                System.out.println("Not Anagram");
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Anagram");


    }
}
