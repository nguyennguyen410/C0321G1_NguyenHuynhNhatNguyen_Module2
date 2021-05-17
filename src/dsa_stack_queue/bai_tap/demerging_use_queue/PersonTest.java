package dsa_stack_queue.bai_tap.demerging_use_queue;

import java.util.*;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Nguyen","04/10/1989","male"));
        list.add(new Person("Dung","04/10/1999","female"));
        list.add(new Person("Anh","04/10/1993","male"));
        list.add(new Person("Binh","04/10/1990","female"));

        System.out.println("Danh sach vua nhap la: ");
        for (Person person: list){
            System.out.println(person);
        }

        Collections.sort(list);
        System.out.println("Danh sach sap xep theo nam sinh: ");
        for (Person person: list){
            System.out.println(person);
        }
        /*ComparatorGender comparatorGender = new ComparatorGender();
        Collections.sort(list, comparatorGender);
        System.out.println("Danh sach sap xep theo gioi tinh: ");
        for (Person person: list){
            System.out.println(person);
        }*/

        Queue<Person> nuQueue = new ArrayDeque<>();
        Queue<Person> namQueue = new ArrayDeque<>();

        for(Person person: list){
            if(person.getGender().equals("female")){
                nuQueue.add(person);
            }else {
                namQueue.add(person);
            }
        }
        List<Person> list1 = new ArrayList<>();
        while (!nuQueue.isEmpty()){
            list1.add(nuQueue.poll());
        }
        while (!namQueue.isEmpty()){
            list1.add(namQueue.poll());
        }
        System.out.println("Mang sap xep theo nu truoc nam sau:");
        for (Person person: list1){
            System.out.println(person);
        }

    }
}
