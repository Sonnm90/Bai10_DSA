package TH1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        ArrayList <Integer> newList = new ArrayList<>();
        MyList <Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println(listInteger.get(4));
        System.out.println(listInteger.get(3));
        System.out.println(listInteger.get(2));
        listInteger.remove(2);
        System.out.println(listInteger.get(2));
     



    }
}
