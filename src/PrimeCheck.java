import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scn.nextInt();
        boolean flag = true;

        for(int i =2; i*i<n; i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }

        if(!flag) System.out.println("Not prime");
        else System.out.println("Prime");

    }
}
