package org.sorting.sortApp;

public class Student2 implements Comparable
{
    String name;
    int id;
    double marks;
    int age;

    public Student2(String name, int id, double marks, int age)
    {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString() {
        return "org.sorting.sortApp.Student2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o)
    {
        Student2 s1=(Student2) o;
        return this.id- s1.id;
    }

    @Override
    public boolean equals(Object o) {
       Student2 st=(Student2)o;
       return this.id== st.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
