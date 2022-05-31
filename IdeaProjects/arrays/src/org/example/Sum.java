package org.example;

public class Sum {
    public static void main(String[] args) {
        int arr[] = new int[]{9,4,6,8,10,19,2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
