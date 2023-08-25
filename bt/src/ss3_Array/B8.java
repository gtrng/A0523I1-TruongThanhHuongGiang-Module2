package ss3_Array;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        String str = "abbaacde";
        int count = 0;
        char kyTu = 'a';
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i) == kyTu){
                count++;
            }
        }
        System.out.println("So lan xuat hien ky tu " + kyTu + " trong " + str + " = " + count);
    }
}
