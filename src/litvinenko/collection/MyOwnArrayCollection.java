package litvinenko.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyOwnArrayCollection<E> implements Collection<E> {

    private ArrayList<E> myArray;
    private int size;

    public MyOwnArrayCollection(ArrayList<E> myArray) {
        this.myArray = myArray;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < myArray.size(); i++) {
            if (o.equals(myArray.get(i)))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return myArray.iterator();
    }

    @Override
    public Object[] toArray() { /// Check
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return myArray.toArray(ts);
    }

    @Override
    public boolean add(E e) {
        size++;
        return myArray.add(e);
    }

    @Override
    public boolean remove(Object o) {
        myArray.remove(o);
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return myArray.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return myArray.addAll(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return myArray.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return myArray.retainAll(collection);
    }

    @Override
    public void clear() {
        myArray.clear();
        size = 0;
    }

    public E getElement(int index) {
        return myArray.get(index);
    }
}
