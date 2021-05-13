package dsa_danh_sach.thuc_hanh.linked_list_simple;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.add(3, 5);
        ll.addFirst(1);
        ll.printList();
    }
}
