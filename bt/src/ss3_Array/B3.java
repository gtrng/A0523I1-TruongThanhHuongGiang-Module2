package ss3_Array;

public class B3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 5, 6, 7};
        int length = arr1.length + arr2.length;
        int[] arr3 = new int[length];
        int i = 0;
        for (int element : arr1) {
            arr3[i] = element;
            i++;
        }
        for (int element : arr2) {
            arr3[i] = element;
            i++;
        }
        for (int j = 0; j < arr3.length ; j++) {
            System.out.println(arr3[j] + " ");
        }
    }
}
