package com.sda.algorytmy;

public class ListTest {
    public static void main(String[] args) {

        MyList<Integer> list = new ListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.remove(2);

        MyList<Integer> list1 = new LinkedListImpl<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1.toString());


    }
}
