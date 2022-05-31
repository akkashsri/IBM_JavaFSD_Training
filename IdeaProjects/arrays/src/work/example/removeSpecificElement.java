package work.example;

import java.util.Arrays;

public class removeSpecificElement {

    public static int[] index(int[] arr, int val) {
    int removeIndex = 0;
    for (int i = 0; i < arr.length; i++) {
        if(val == arr[i])
            removeIndex = i;
    }
    for (int i = removeIndex; i < arr.length-1; i++) {
        arr[i] = arr[i+1];
    }
    return arr;
}
    public static void main(String[] args) {
        int arr[] = new int[] {2,66,7,93,56,23};
        System.out.println(Arrays.toString(index(arr, 56)));

    }
}
