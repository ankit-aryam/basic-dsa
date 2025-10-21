package array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();

        System.out.println("Max: "+max+" Min: "+min);
    }
}
