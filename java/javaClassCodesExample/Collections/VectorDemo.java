package lecture8;

import java.util.*;

class VectorDemo {

  public static void main(String args[]) {
   
    Vector v = new Vector();
    System.out.println("Initial size: " + v.size());
    System.out.println("Initial capacity: " +  v.capacity());
    v.addElement(new Integer(1));
    v.addElement(new Integer(2));
    v.addElement(new Integer(3));
    v.addElement(new Integer(4));
    v.addElement(new Integer(5));
    System.out.println("First element: " + (Integer)v.firstElement());
    System.out.println("Last element: " + (Integer)v.lastElement());

    if(v.contains(new Integer(3))) System.out.println("Vector contains 3.");
    v.remove(4);

    // iterate
    for(int i=0;i<v.size();i++) {
    	Integer a=(Integer)v.elementAt(i);
    	System.out.println(a);
    }     

    // enumerate the elements in the vector.
    Enumeration vEnum = v.elements();

    System.out.println("\nElements in vector:");
    while(vEnum.hasMoreElements())
      System.out.print(vEnum.nextElement() + " ");
    System.out.println();
  }
}
