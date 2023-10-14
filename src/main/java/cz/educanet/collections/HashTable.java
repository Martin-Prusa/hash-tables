package cz.educanet.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HashTable<T> implements Set<T>{

    private final int n = 100;

    private LinkedList<T>[] table = new LinkedList[n];

    public HashTable() {
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    @Override
    public boolean add(T item) {
        int index = item.hashCode() % n;
        if(table[index].contains(item)) return false;
        table[index].add(item);
        return true;
    }

    @Override
    public boolean remove(T item) {
        return this.table[item.hashCode() % n].remove(item);
    }

    @Override
    public boolean contains(T item) {
        return this.table[item.hashCode() % n].contains(item);
    }

    @Override
    public List<T> toList() {
        return Arrays.stream(table).flatMap(Collection::stream).collect(Collectors.toList());
    }
}

