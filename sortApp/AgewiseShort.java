package org.sorting.sortApp;

import java.util.Comparator;
public class AgewiseShort implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student2 s1 = (Student2) o1;
        Student2 s2 = (Student2) o2;
        return s1.age - s2.age;
    }

}

