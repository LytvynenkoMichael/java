package litvinenko.collection;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        MyOwnArrayCollection array = new MyOwnArrayCollection(list);

        array.add("M");
        array.add("i");
        array.add("c");
        array.add("h");
        array.add("a");
        array.add("e");
        array.add("l");

        System.out.println(array.size());

        array.remove("M");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.getElement(i));
        }
        System.out.println(array.isEmpty());
        System.out.println(array.contains("a"));
//        array.clear();
        System.out.println(array.size());
        System.out.println(array.isEmpty());
    }
}
