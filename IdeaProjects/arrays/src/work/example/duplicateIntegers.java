package work.example;

public class duplicateIntegers {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,4,6,5,6};
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    if(count>0) {
                        int duplicate = arr[j];
//                        System.out.println(duplicate);
                    }
                }
            }
            count = 0;
        }
    }
}
