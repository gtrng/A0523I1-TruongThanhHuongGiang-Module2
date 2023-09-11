package ss9_ArrayList.MyArrayList;

import ss9_ArrayList.MyArrayList.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Trương");
        list.add("Thanh");
        list.add("Hương");
        list.add("Giang");
        System.out.println(list.get(0));
        System.out.println(list.indexOf("Thanh"));
        list.remove(1);
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("Hương"));
        System.out.println(clone.get(3));
        clone.clear();
    }
}
