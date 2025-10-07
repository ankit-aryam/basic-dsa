import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = n;
        int res = 0;

        while(num!=0){
            int digit = num%10;
            res = res*10+digit;
            num = num/10;
        }

        if(n==res){
            System.out.println("Number: "+n+" is Palindrome");
        } else{
            System.out.println("Number: "+n+" is not Palindrome");
        }

    }
}
