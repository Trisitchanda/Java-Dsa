package Array;

import java.util.Arrays;

public class changing_in_functions {
    public static void main(String[] args) {
        int[] arr = {3,24,7,19};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] array){
        array[0]=47;
    }
}
