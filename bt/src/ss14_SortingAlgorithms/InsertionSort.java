package ss14_SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        int value;
        int pos;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > value) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            if (pos != i) {
                arr[pos] = value;
            }
            System.out.println("Vòng lặp thứ " + i);
            display(arr);
        }
    }

    public void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng:\n");
        for (int j = 0; j < n; j++) {
            System.out.printf("arr[%d] = ", j);
            arr[j] = sc.nextInt();
        }
        System.out.println("Mảng đã cho : ");
        insertionSort.display(arr);
        insertionSort.insertionSort(arr);
        System.out.println("\nMảng sau khi sắp xếp : ");
        insertionSort.display(arr);
    }
}
