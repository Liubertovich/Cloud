package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Geor");
        arrayList1.add("Artur");
        arrayList1.add("Yana");
        arrayList1.add("Petya");
        arrayList1.add("Alena");

        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);
//        list1.add(102); // Exception

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
//
//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[0]);
//        System.out.println(Arrays.toString(array));
//
//        for(String s:array2){
//            System.out.print(s+" ");
//        }


//        List<String> myList = arrayList1.subList(1,4);
//        System.out.println("Sub list = " + myList);
//        myList.add("AA");
//        System.out.println("Sub list = " +myList);
//        System.out.println("ArrayList = "+ arrayList1);
//        arrayList1.add("Vanya");
//        System.out.println("ArrayList = " + arrayList1);
//        System.out.println("Sub list = " +myList); // Exception


//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Geor");
//        arrayList2.add("Artur");
//        arrayList2.add("Kolya");

//        arrayList1.retainAll( arrayList2);
//        System.out.println(arrayList1);
//
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);
    }
}
