package Array;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(67);
        arr.add(87);
        arr.add(97);
        arr.add(17);
        arr.add(27);
        System.out.println(arr);

        System.out.println(arr.contains(123123));

        System.out.println(arr.set(0, 99));
    }

}
