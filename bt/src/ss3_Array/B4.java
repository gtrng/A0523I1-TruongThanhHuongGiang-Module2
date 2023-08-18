package ss3_Array;

 import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so dong : ");
        m = sc.nextInt();
        System.out.println("nhap vao so cot: ");
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("nhap phan tu");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        int max =arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
