package dsa_stack_queue.bai_tap.demerging_use_queue;

import java.util.Comparator;

public class ComparatorGender implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
