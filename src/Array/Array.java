package Array;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5]; // [0,0,0,0,0]
        int[] array2 = {1, 2, 3, 4, 5};
        String[] arr = new String[2]; // [Null]

        System.out.println(array2[2]); // 3
        array2[2]=99;
        System.out.println(array2[2]); // 99

        System.out.println(array[0]); // 0

    }
    // array object are created in heap
    // heap object are not continues
    // Dynamic memory allocation -> assigning memory at run time
    // array in java may not be continues
    // primitive are stored in stack and object, references are stored in heap
}
