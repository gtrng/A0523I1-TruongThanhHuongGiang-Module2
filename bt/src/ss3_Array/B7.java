package ss3_Array;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int row = sc.nextInt();
        System.out.println("Nhap so cot");
        int col = sc.nextInt();
        while (row != col) {
            System.out.println("ma tran vuong thi so cot va hang phai bang nhau");
            System.out.println("Nhap so hang");
            row = sc.nextInt();
            System.out.println("Nhap vao so cot");
            col = sc.nextInt();
        }
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap vao phan tu thu " + i + j);
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        }
        System.out.println(sum);
    }
}
