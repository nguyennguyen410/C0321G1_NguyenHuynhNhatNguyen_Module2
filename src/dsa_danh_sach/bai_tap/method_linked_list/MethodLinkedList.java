package dsa_danh_sach.bai_tap.method_linked_list;


import abstract_class_interface.thuc_hanh.animal_interface_edible.Edible;

public class MethodLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MethodLinkedList() {
    }

    /*public MethodLinkedList(Object data){
        head = new Node(data);
    }*/

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void addIndex(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes) {
            addLast(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = new Node(element);
            (temp.next).next = holder;
            numNodes++;
        }
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error:" + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = head;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }

        }
        return false;
    }

    public MethodLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new IllegalArgumentException("Error:" + numNodes);
        }
        MethodLinkedList<E> newMethodLinkedList = new MethodLinkedList<>();
        Node temp = head;
        newMethodLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            newMethodLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return newMethodLinkedList;
    }

    public boolean contains(E object) {
        Node temp = head;
        /*while (temp.next != null){
            if(object.equals(temp.data)){
                return true;
            }
            temp = temp.next;
        }
        return false;*/
        for (int i = 0; i < numNodes; i++) {
            if (object.equals(temp.data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (element.equals(temp.data)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        /*while (temp.next!=null){
            temp.data = null;
            temp = temp.next;
        }
        numNodes = 0;*/
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp.data = null;
            temp = temp.next;
        }
        numNodes = 0;
    }
}
