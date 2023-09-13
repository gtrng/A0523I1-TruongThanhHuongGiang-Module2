package ss12_JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str =sc.nextLine();
        String[] str2 = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String element:str2){
            if(map.containsKey(element)){
                Integer value = map.get(element);
                value++;
                map.replace(element,value);
            } else {
                map.put(element,1);
            }
        }
        System.out.println("Số lần xuất hiện là :");
        System.out.println(map.toString());
    }
}
