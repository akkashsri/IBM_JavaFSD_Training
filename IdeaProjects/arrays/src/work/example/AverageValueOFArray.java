package work.example;

public class AverageValueOFArray {
    public static void main(String[] args) {
        int arr[] = new int[]{9,4,3,5,2,6,1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum/ arr.length;
        System.out.println(avg);
    }
}
