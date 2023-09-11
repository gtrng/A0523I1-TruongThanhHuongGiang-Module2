package ss10_Stack_Queue.Reverse;

public class Test {
    public static void reverseString(StringBuffer str){
        int n = str.length();
        Stack object = new Stack(n);
        int i;
        for (i = 0; i < n; i++) {
            object.push(str.charAt(i));
        }
        for (i = 0; i < n; i++) {
            char str2 = object.pop();
            str.setCharAt(i,str2);
        }
    }

//    public static void reverseElement(){
//
//    }
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer("abc");
        reverseString(st);
        System.out.println(st);
    }
}
