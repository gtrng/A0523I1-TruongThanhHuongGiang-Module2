package ss13_SearchAlgorithm;

import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int[] arr, int left, int right, int x){
        if(right >= 1) {
            int middle = 1 + (right - 1) / 2;
            if (arr[middle] == x) {
                return middle;
            }
            if (arr[middle] > x) {
                return binarySearch(arr, 1, middle - 1, x);
            } else {
                return binarySearch(arr, middle + 1, right, x);
            }
        }
        return -1;
    }

    void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        BinarySearch o = new BinarySearch();
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Nhập các phần tử của mảng:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Các phần tử của mảng:");
        o.show(arr);
        System.out.println("\nNhập x:");
        int x = sc.nextInt();
        int res = o.binarySearch(arr,0,n-1,x);
        if(res == -1){
            System.out.println("Không tìm thấy");
        } else {
            System.out.println(x + " được tìm thấy tại " + res);
        }
    }
}
