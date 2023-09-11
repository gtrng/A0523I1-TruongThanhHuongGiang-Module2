package ss10_Stack_Queue.DecimaltoBinary;

import java.util.Stack;
import java.util.Scanner;
public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("nhap so thap phan can chuyen doi ");
        int num = sc.nextInt();
        while (num != 0) {
            int n = num % 2;
            stack.push(n);
            num /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
