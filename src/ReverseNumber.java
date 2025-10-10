import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        int res = 0;

        while(n!=0){
            int digit = n%10;
            res = res*10+digit;
            n=n/10;
        }

        System.out.println(res);
    }
}
