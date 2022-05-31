package work.example;

public class maximumMinimum {
    public static void main(String[] args) {
        int arr[] = new int[] {10,2,34,56,32,0,91};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimum value of array is: "+ min);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum value of array is: "+ max);
    }

}
