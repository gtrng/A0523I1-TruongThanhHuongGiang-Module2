package ss13_SearchAlgorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximumConsecutiveIncreasingly {
    public static void main(String[] args) {
        String str1 = "abbacdxy";
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> characterList1 = new LinkedList<>();
        for(int i =0; i< str1.length();i++){

            if(characterList1.size() > 1 && str1.charAt(i) <= characterList1.getLast() && characterList1.contains(str1.charAt(i))){
                characterList1.clear();;
            }
            characterList1.add(str1.charAt(i));
            if(characterList1.size() > max.size()){
                max.clear();
                max.addAll(characterList1);
            }
        }
        for (Character ch : max){
            System.out.println(ch);
        }
        System.out.println();
    }
}
