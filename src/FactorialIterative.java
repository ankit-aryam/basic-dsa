import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();

        System.out.println("The factorial is: " + factorial(n));
    }

    public static int factorial(int n){
        if(n==1){
            return n;
        }

        return n*factorial(n-1);
    }
}
