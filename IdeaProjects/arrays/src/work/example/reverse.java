package work.example;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int size = arr.length/2;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
