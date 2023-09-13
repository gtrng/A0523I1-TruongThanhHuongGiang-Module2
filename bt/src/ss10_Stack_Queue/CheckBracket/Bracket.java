package ss10_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;
public class Bracket {
    public static boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            } else if (sym == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (sym == ')' && left != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap bieu thuc chua dau ngoac:");
        String str = sc.nextLine();
        if (checkBracket(str)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
