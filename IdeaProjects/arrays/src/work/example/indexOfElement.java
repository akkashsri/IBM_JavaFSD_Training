package work.example;

public class indexOfElement {
    public static int index(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if(val == arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {2,66,7,93,56,23};
        System.out.println("Index of the element is: "+index(arr, 23));

    }
}
