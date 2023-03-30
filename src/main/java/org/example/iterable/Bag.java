package org.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class Bag<T> implements Container<T>{

    private List<T> myBag = new ArrayList<>();
    int size = 0;

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean add(T item) {
        size++;
        return myBag.add(item);

    }

    @Override
    public Iterator<T> iterator() {

      return myBag.iterator();
    }

    @Override
    public List<T> forEach(){
        return myBag;
    }

    @Override
    public Spliterator<T> spliterator(){

        return myBag.spliterator();
    }

}
