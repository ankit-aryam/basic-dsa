import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int num = n;
        int res = 0;

        while(num!=0){
            int digit = num%10;
            int cubeDig = (int) Math.pow(digit, 3);
            res += cubeDig;
            num = num/10;
        }

        if(res==n) System.out.println("The number is Armstrong");
        else System.out.println("The number is not Armstrong");
    }
}
