package string;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scn.nextLine();
        int i =0, j=str.length()-1;
        boolean flag = true;

        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            } else{
                System.out.println("Not Palindrome");
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("Palindrome");
    }
}
