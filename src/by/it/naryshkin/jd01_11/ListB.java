package by.it.naryshkin.jd01_11;

import java.util.*;
import java.util.function.UnaryOperator;

public class ListB<T> implements List<T> {
    private T[] elements = (T[]) new Object[]{};
    private int size = 0;


    @Override
    public boolean add(T e) {
        if (size == elements.length) elements = Arrays.copyOf(elements, (size * 3) / 2 + 1);
        elements[size++] = e;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (size == elements.length) elements = Arrays.copyOf(elements, (size * 3) / 2 + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }


    @Override
    public T remove(int index) {
        T deleteIndex = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
        size--;
        return deleteIndex;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index > -1) remove(index);
        return index > -1;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            sb.append(delimiter);
            sb.append(elements[i]);
            delimiter = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public T set(int index, T element) {
        T currentValue = elements[index];
        elements[index] = element;
        return currentValue;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Object[] exArray= c.toArray();
        System.out.println(Arrays.toString(exArray));
        int exLength = exArray.length;


        if (exLength==0) return false;
        int newLength = elements.length+exLength;

        elements = Arrays.copyOf(elements,newLength);
            System.out.println(Arrays.toString(elements));

        System.arraycopy(exArray,0,elements,size,exLength);
        size+=exLength;


        return true;
    }
















    @Override
    public void replaceAll(UnaryOperator<T> operator) {

    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
