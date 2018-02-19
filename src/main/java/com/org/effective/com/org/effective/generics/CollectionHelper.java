package com.org.effective.com.org.effective.generics;


import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class CollectionHelper {
    public static <A extends Comparable<A>> void sort(List<A> list) {
        list.sort(null);
    }

    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set2);
        result.addAll(set1);
        return result;
    }

    public static <E extends Comparable<E>> E max(List<E> c){
        if (c.isEmpty()){
            throw new IllegalArgumentException("Empty collection");
        }

        E result = null;

        for (E e : c){
            if (result == null || e.compareTo(result) > 0){
                result = Objects.requireNonNull(e);
            }
        }

        return result;
    }
}
