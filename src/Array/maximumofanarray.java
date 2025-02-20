package Array;

public class maximumofanarray {
    public static void main(String[] args) {
        int[] arr={1, 3, 9, 5, 5};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int a=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        return a;
    }
}
