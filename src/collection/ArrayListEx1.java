package collection;

import java.util.ArrayList;
import java.util.List;


public class ArrayListEx1 {
    public static void main(String[] args) {
//        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Geor");
        arrayList1.add("Artur");
        arrayList1.add("Yana");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(500); // 200 - videlyaem pamat
        arrayList2.add("Geor");
        arrayList2.add("Artur");

        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);


    }
}

