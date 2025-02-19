package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arr_input {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i=0;i<arr.length;i++){
            System.out.print("Enter the element "+i+" : ");
            arr[i]=ip.nextInt();
        }
        // Taking input

        for (int ele : arr) {   // (for each loop) Its like for in loop in python ( for ele in arr)
            System.out.print(ele+ " ");
        }
        //Printing it

        System.out.println(Arrays.toString(arr));
        //another way to print it

    }
}
