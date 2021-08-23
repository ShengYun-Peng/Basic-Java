package chap24;

import java.util.Collection;
import java.util.Iterator;

public interface MyList<E> extends Collection<E> {
    // add an element in the specified index
    public void add(int index, E e);

    // return an element from the list in the specified index
    public E get(int index);

    public int indexOf(Object e);

    public int lastIndexOf(E e);

    public E remove(int index);

    public E set(int index, E e);

    @Override
    public default boolean add(E e) {
        add(size(), e);
        return true;
    }

    @Override
    public default boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public default boolean remove(Object e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else
            return false;
    }

    @Override
    public default boolean containsAll(Collection<?> c) {
        boolean flag = true;
        for (Object o : c) {
            if (indexOf(o) < 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c) {
        boolean flag = true;
        for (E e : c)
            add(e);
        return true;
    }

    @Override
    public default boolean removeAll(Collection<?> c) {
        return true;
    }

    @Override
    public default boolean retainAll(Collection<?> c) {
        return true;
    }

    @Override
    public default Object[] toArray() {
        return null;
    }

    @Override
    public default <T> T[] toArray(T[] array) {
        return null;
    }
}
