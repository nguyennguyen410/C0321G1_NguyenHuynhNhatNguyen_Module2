package dsa_danh_sach.bai_tap.method_array_list;

import java.util.Arrays;

public class MethodArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MethodArrayList() {
    }

    public MethodArrayList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public void addIndex(int index, E element) {
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E element = (E) elements[index];
        for (int j = index; j < size; j++) {
            elements[j] = elements[j + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int getSize() {
        return size;
    }

    public Object clone() {
        Object[] elementsCoppy = new Object[size];
        for (int i = 0; i <= size; i++) {
            elementsCoppy[i] = elements[i];
        }
        return elementsCoppy;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++)
            if (element.equals(elements[i])) {
                return true;
            }
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++)
            if (element.equals(elements[i])) {
                return i;
            }
        return -1;
    }

    public boolean addCheck(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
