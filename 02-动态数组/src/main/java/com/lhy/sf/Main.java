package com.lhy.sf;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(0,1);
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
    }
}
