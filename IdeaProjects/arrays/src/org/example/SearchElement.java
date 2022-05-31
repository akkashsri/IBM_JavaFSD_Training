package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int arr[]= {10,2,6,-10,0,5};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Which element you want to search?: ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(element == arr[i]) {
//                break;
            }
            else {
                System.out.println("Element is not present");
//                break;
            }
        }
    }
}
