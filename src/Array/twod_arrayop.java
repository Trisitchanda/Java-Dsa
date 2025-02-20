package Array;

import java.util.Arrays;
import java.util.Scanner;

public class twod_arrayop {
    public static void main(String[] args) {
        int[][] arr2d = new int[3][3];
        Scanner ip = new Scanner(System.in);

        //input
        for (int row = 0; row < arr2d.length; row++){
            for (int col=0;col<arr2d[row].length; col++){
                arr2d[row][col]=ip.nextInt();
            }
        }
        for (int[] a:arr2d){
            System.out.println(Arrays.toString(a));
        }
        for (int row = 0; row < arr2d.length; row++){
            for (int col=0;col<arr2d[row].length; col++){
                System.out.print(arr2d[row][col]+" ");
            }
            System.out.println();
        }
    }
}