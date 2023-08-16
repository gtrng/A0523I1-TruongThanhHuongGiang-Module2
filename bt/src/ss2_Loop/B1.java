package ss2_Loop;

import java.util.Scanner;

public class B1 {
    public static void rectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void squareTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void isoscelesTriangle() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println(" 1/Print the rectangle" +
                    "\n 2/Print the square triangle " +
                    "\n 3/Print isosceles triangle" +
                    "\n 4/Exit");
            System.out.println("Choose one shape that you want to create :");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Thực hiện chức năng 1");
                    rectangle();
                    break;
                case 2:
                    System.out.println("Thực hiện chức năng 2");
                    squareTriangle();
                    break;
                case 3:
                    System.out.println("Thực hiện chức năng 3");
                    isoscelesTriangle();
                    break;
                default:
                    System.out.println("Thoát");
                    flag = false;
                    break;
            }
        } while (flag);

    }
    }
