package lecture8;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class HashMapDemo
{
    public static void main(String args[]) {
        HashMap balance = new HashMap();
        // HashMap<String, Double> balance = new HashMap<String, Double>();
        // ConcurrentHashMap balance = new ConcurrentHashMap(); // for multi-threading
        String str;
        double bal;

        balance.put("John Doe", new Double(3434.34));
        balance.put("Tom Smith", new Double(123.22));
        balance.put("Jane Baker", null);
        balance.put("Tod Hall", new Double(99.22));
        balance.put("Ralph Smith", new Double(-19.08));
        balance.put(null, new Double(0));

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


