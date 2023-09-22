package ss15_Exception.IllegalTriangle;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ứng dụng");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            flag = false;
            try {
                System.out.println("Nhập ba cạnh của tam giác");
                System.out.println("Nhập a : ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập b : ");
                int b = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập c : ");
                int c = Integer.parseInt(sc.nextLine());
                check(a,b,c);
                System.out.println("Là 3 cạnh của tam giác");
            } catch (IllegalTriangleException e){
                flag = true;
                System.out.println(e.getMessage());
                System.out.println("nhập lại");
            }
        } while (flag);
        System.out.println("Kết thúc ứng dụng");
    }
    public static boolean check(int a, int b, int c) throws IllegalTriangleException {
        if ( a <= 0 || b <= 0 || c <= 0) {
            throw  new IllegalTriangleException("Giá trị của cạnh không được âm");
        } else if (a + b <= c || b + c <= a || a + c <= b ){
            throw new IllegalTriangleException("Giá trị nhập sai");
        }
        return true;
    }
}
