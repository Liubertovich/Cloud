package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//      List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
//        list.add(21213); не можем, ибо компил не знает какой тип можно добавить

        List<? extends Number> list30 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(1.2);
        list1.add(1.3);
        list1.add(1.4);
        showListIngo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Odin");
        list2.add("Dva");
        list2.add("Tri");
        showListIngo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(1.21);
        ald.add(1.32);
        ald.add(1.43);
        System.out.println(summ(ald));
    }

    static void showListIngo(List<?> list) {
        System.out.println("Moy list soderjit elementi: " + list);
    }

    public static double summ(ArrayList<? extends Number> al){
        double summ = 0;
        for(Number n: al){
            summ += n.doubleValue();
        }
        return summ;
    }


}
