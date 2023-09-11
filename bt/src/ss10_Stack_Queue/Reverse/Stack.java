package ss10_Stack_Queue.Reverse;

import java.util.*;
public class Stack {
    int top;
    int size;
    char[] a;

    boolean isEmpty(){
        return (top < 0);
    }

    public Stack(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char m){
        if(top >= size){
            return false;
        } else {
            a[++top] = m;
            return true;
        }
    }

    char pop(){
        if (top < 0){
            return 0;
        } else {
            char m = a[top--];
            return m;
        }
    }
}
