package dsa_danh_sach.bai_tap.method_array_list;

public class MethodArrayListTest {
    public static void main(String[] args) {
        MethodArrayList<Integer> listTest = new MethodArrayList<>(10);
        listTest.add(5);
        listTest.add(4);
        listTest.add(3);
        listTest.add(2);
        listTest.addIndex(2, 8);
        System.out.println(listTest.get(0) + " " + listTest.get(1) + " " + listTest.get(2) + " " + listTest.get(3) + " " + listTest.get(4));
        listTest.remove(1);
        System.out.println(listTest.get(0) + " " + listTest.get(1) + " " + listTest.get(2) + " " + listTest.get(3));
        System.out.println(listTest.getSize());
        listTest.clear();
        System.out.println(listTest.getSize());
    }
}
