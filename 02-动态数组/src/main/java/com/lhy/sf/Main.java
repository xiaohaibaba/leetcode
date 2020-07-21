package com.lhy.sf;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList();

        for (int i = 0; i < 100; i++) {
            list.add(new Person("1231"));
        }

        for (int i = 0; i < 100; i++) {
            list.remove(0);
        }
//        System.out.println(list.toString());

//        List<Integer> list = new LinkedList<Integer>();
//
//        list.add(20);
//        list.add(0, 30);
//        list.add(40);
//        list.add(list.size(),50);
//        list.remove(1);
//        System.out.println(list.toString());
    }
}
