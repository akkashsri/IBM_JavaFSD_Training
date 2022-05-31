package org.example;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,3,9,7,0,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("First Element: "+arr[0]);
    }
}
