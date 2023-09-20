package ss13_SearchAlgorithm;

import java.util.LinkedList;

public class FindMaximumSubsequence {
    public static void main(String[] args) {
        String str = "welcome";
        LinkedList<Character> max = new LinkedList<>();
        for(int i =0; i< str.length();i++){
            LinkedList<Character> characterList = new LinkedList<>();
            characterList.add(str.charAt(i));
            for (int j = i+1; j < str.length() ; j++) {
                if(str.charAt(j) > characterList.getLast()){
                    characterList.add(str.charAt(j));
                }
            }
            if(characterList.size() > max.size()){
                max.addAll(characterList);
            }
        }
        for (Character ch : max){
            System.out.println(ch);
        }
        System.out.println();
    }
}
