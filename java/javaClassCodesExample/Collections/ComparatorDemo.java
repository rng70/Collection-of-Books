package lecture8;

import java.util.*;

class TestClass implements Comparable {

    String  name;

    TestClass(String name) {
        this.name=name;
    }

    @Override
    public int compareTo(Object o) {
        TestClass m = (TestClass) o;
        return this.name.compareTo(m.name);
    }
}

class ComparatorDemo {

    public static void main(String args[]) {
        ArrayList<TestClass> al = new ArrayList<TestClass>();

        al.add(new TestClass("C"));
        al.add(new TestClass("A"));
        al.add(new TestClass("E"));
        al.add(new TestClass("B"));
        al.add(new TestClass("D"));
        al.add(new TestClass("F"));

        TestClass ia[]=new TestClass[al.size()];
        ia=al.toArray(ia);

        System.out.println("Collection:");
        for(int i=0;i<al.size();i++) {
            System.out.print(al.get(i).name+"  ");
        }
        System.out.println ("");

        Collections.sort(al);

        System.out.println("After Sorting:");
        for(int i=0;i<al.size();i++) {
            System.out.print(al.get(i).name+"  ");
        }
        System.out.println ("");

        System.out.println("Array:");

        for(int i=0;i<ia.length;i++) {
            System.out.print(ia[i].name+"  ");
        }
        System.out.println ("");

        Arrays.sort(ia);

        System.out.println("After Sorting:");
        for(int i=0;i<ia.length;i++) {
            System.out.print(ia[i].name+"  ");
        }
        System.out.println ("");
    }
}