package dsa_danh_sach.bai_tap.method_linked_list;

import dsa_danh_sach.thuc_hanh.linked_list_simple.MyLinkedList;

public class MethodLinkedListTest {

    public static void main(String[] args) {
        MethodLinkedList<Person> methodLinkedList = new MethodLinkedList<>();
        Person person1 = new Person("A", 20);
        Person person2 = new Person("B", 20);
        Person person3 = new Person("C", 20);
        Person person4 = new Person("D", 20);
        Person person5 = new Person("E", 20);

        methodLinkedList.addFirst(person1);
        methodLinkedList.addLast(person2);
        methodLinkedList.addIndex(1, person3);
        methodLinkedList.remove(1);
        methodLinkedList.addLast(person4);
        methodLinkedList.addLast(person5);


        /*System.out.println(methodLinkedList.remove(person2));*/
        MethodLinkedList<Person> newMethodLinkedList = methodLinkedList.clone();

        System.out.println(methodLinkedList.contains(person5));

        for (int i = 0; i < newMethodLinkedList.size(); i++) {
            Person person = newMethodLinkedList.get(i);
            System.out.println(person.getName());
        }
        System.out.println(methodLinkedList.indexOf(person5));
        Person person6 = methodLinkedList.getFirst();
        System.out.println(person6.getName());
        Person person7 = methodLinkedList.getLast();
        System.out.println(person7.getName());
        methodLinkedList.clear();
        for (int i = 0; i < methodLinkedList.size(); i++) {
            Person person = newMethodLinkedList.get(i);
            System.out.println(person.getName());
        }

    }
}
