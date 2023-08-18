package ss3_Array;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap vao mang cac so nguyen");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mang:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
