package dsa_stack_queue.thuc_hanh.trien_khai_queue_bang_linkedlist;

public class LinkedlistQueueClient {
    public static void main(String[] args) {
        MyLinkedlistQueue queue = new MyLinkedlistQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
