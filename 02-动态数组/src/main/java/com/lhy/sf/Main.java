package com.lhy.sf;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Person> list = new ArrayList();
//        list.add(new Person("1231"));
//        list.add(new Person("1232"));
//        list.add(new Person("1233"));
//        list.add(new Person("1234"));
//        list.add(new Person("1235"));
//        list.add(new Person("1236"));
//        list.add(new Person("1237"));
//        list.add(new Person("1238"));
//        list.add(new Person("1239"));
//        list.add(new Person("12300"));
//        list.add(new Person("12301"));
//        list.add(new Person("12302"));
//        list.add(new Person("12303"));
//        System.out.println(list.toString());

        List<Integer> list = new LinkedList<Integer>();

        list.add(20);
        list.add(0, 30);
        list.add(40);
        list.add(list.size(),50);
        list.remove(1);
        System.out.println(list.toString());
    }
}
