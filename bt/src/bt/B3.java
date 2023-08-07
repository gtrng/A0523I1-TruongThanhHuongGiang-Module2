package bt;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần quy đổi");
        usd = scanner.nextDouble();
        double change = usd * vnd;
        System.out.println("Tiền sau quy đổi : " + change );
    }
}
