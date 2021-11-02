package org.sorting.sortApp;

import java.util.Comparator;

public class MarkWiseShort implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        Student2 s1 = (Student2) o1;
        Student2 s2 = (Student2) o2;
        return (int) (s1.marks- s2.marks);
    }
}
