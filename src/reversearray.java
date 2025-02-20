import java.util.Arrays;

public class reversearray {
        public static void main(String[] args) {
            int[] arr={1, 2, 3, 4, 5};
            reverse(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void reverse(int[] arr){
            int start = 0;
            int end = arr.length-1;

            for (int i=0;i<end;i++){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

        }
}

