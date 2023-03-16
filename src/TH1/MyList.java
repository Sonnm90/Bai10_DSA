package TH1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index,E e) {
        if (size == elements.length)
            ensureCapa();
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= 40 || i < 0)
            throw new IndexOutOfBoundsException("Index: " + i + ",Size" + i);
        return (E) elements[i];
    }

    public E remove(int i) {
        for (int j = i; j < elements.length - 1; j++) {
            elements[j] = elements[j + 1];
        }
        elements[elements.length - 1] = null;
        return (E) elements[i];
    }

    public int size() {
        return elements.length;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }
    public boolean add(E e){
        if (size == elements.length)
            ensureCapa();
        elements[size++] = e;
        return true;
    }
    public void clear(){
        for (int i = 0; i < size; i++)
            elements[i] = null;

        size = 0;
    }
}
