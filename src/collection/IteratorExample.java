package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Geor");
        arrayList1.add("Artur");
        arrayList1.add("Yana");
        arrayList1.add("Petya");
        arrayList1.add("Alena");

        Iterator<String> iter = arrayList1.iterator();
        while (iter.hasNext()){
            iter.next();
            iter.remove();
        }
        System.out.println(arrayList1);
    }
}
