package ss3_Array;


import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang");
        int row = sc.nextInt();
        System.out.println("Nhap so cot");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu thu " + i + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("nhap so cot muon tinh");
        int colSum=sc.nextInt();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][colSum];
        }
        System.out.println(sum);
    }
}
