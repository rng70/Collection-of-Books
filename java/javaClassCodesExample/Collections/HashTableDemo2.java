package lecture8;

import java.util.*;

class HashTableDemo2 {
  public static void main(String args[]) {
    Hashtable balance = new Hashtable();
    String str;
    double bal;

    balance.put("John Doe", new Double(3434.34));
    balance.put("Tom Smith", new Double(123.22));
    balance.put("Jane Baker", new Double(1378.00));
    balance.put("Tod Hall", new Double(99.22));
    balance.put("Ralph Smith", new Double(-19.08));

    // show all balances in hashtable
    Set set = balance.keySet(); // get set view of keys

    // get iterator
    Iterator itr = set.iterator();
    while(itr.hasNext()) {
      str = (String) itr.next();
      System.out.println(str + ": " + balance.get(str));
    }

    System.out.println();

    // Deposit 1,000 into John Doe's account
    bal = ((Double)balance.get("John Doe")).doubleValue();
    balance.put("John Doe", new Double(bal+1000));
    System.out.println("John Doe's new balance: " +
                       balance.get("John Doe"));
                       
     itr = set.iterator();
    while(itr.hasNext()) {
      str = (String) itr.next();
      System.out.println(str + ": " + balance.get(str));
    }
  }
}


