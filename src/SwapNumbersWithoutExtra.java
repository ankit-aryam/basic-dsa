import java.util.Scanner;

public class SwapNumbersWithoutExtra {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number A: ");
        int a = scn.nextInt();
        System.out.println("Enter second number B: ");
        int b = scn.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("A: "+a+" B: "+b);
    }
}
