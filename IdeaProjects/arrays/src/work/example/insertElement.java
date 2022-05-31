package work.example;

import java.util.Arrays;

public class insertElement {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8};
        int pos = 3;
        int val = 10;
        for (int i = arr.length-1; i > pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = val;
        System.out.println(Arrays.toString(arr));
    }
}
