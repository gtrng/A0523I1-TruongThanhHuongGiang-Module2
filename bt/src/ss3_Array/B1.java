package ss3_Array;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int delNumber  = sc.nextInt();
        int index_del = search(arr1, delNumber);
        if(index_del == -1){
            System.out.println("phan tu khong ton tai trong mang");
        } else {
            arr1 = deleteNumber(arr1, index_del);
        }
        for (int i = 0; i < arr1.length;i++){
            System.out.println(arr1[i] + " ");
        }
    }
    static int search(int [] arr1, int number){
        int index = -1;
        for (int i = 0; i< arr1.length; i++){
            if (arr1[i] == number){
                index = i;
            }
        }
        return index;
    }
    static int[] deleteNumber(int [] arr1, int viTri){
        int[] arr2 = new int[arr1.length -1];
        for (int i =0; i < viTri; i++){
            arr2[i] = arr1[i];
        }
        for(int i = viTri + 1; i< arr1.length;i++){
            arr2[i-1] = arr1[i];
        }
        return arr2;
    }
}

