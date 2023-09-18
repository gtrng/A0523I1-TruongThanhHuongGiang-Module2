package ss14_SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort2 {
        public void insertionSort2(int[] list) {
            int value;
            int pos;
            for (int i = 1; i < list.length; i++) {
                value = list[i];
                pos = i;
                while (pos > 0 && list[pos - 1] > value) {
                    list[pos] = list[pos - 1];
                    pos--;
                }
                if (pos != i) {
                    list[pos] = value;
                }
            }
        }

        public void display(int[] list) {
            System.out.print("[");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.print("]\n");
        }

        public static void main(String[] args) {
            InsertionSort2 insertionSort = new InsertionSort2();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập độ dài của mảng : ");
            int m = scanner.nextInt();
            int[] list = new int[m];
            System.out.print("Nhập các phần tử của mảng: \n");
            for (int j = 0; j < m; j++) {
                System.out.printf("arr[%d] = ", j);
                list[j] = scanner.nextInt();
            }
            System.out.println("Mảng đã cho : ");
            insertionSort.display(list);
            insertionSort.insertionSort2(list);
            System.out.println("\nMảng sau khi sắp xếp : ");
            insertionSort.display(list);
        }
    }
