package org.example.iterable;

import java.util.List;

public interface Container<T> extends Iterable<T> {
    boolean isEmpty();
    int size();
    boolean add(T item);

    abstract List<T> forEach();
}
