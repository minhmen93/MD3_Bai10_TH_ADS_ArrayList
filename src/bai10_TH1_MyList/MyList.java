package bai10_TH1_MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Muc dich : Tang gap doi kich thuoc mang chua cac phan tu
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public E get(int i) throws IndexOutOfBoundsException {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }


}
