import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        int res = 1;

        for(int i =2; i<=n; i++){
            res *= i;
        }

        System.out.println("The factorial is: "+res);
    }
}
