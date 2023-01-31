package collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Geor");
        arrayList1.add("Artur");
        arrayList1.add(1,"Yana");
        arrayList1.add(0,"Miha");

        for(String s :arrayList1){
            System.out.print(s+" ");
        }
        System.out.println();
//
//        System.out.println(arrayList1.get(1));
//        for(int i = 0 ; i < arrayList1.size();i++){
//            System.out.print(arrayList1.get(i));
//        }

        arrayList1.set(0, "Masha");
        arrayList1.remove(2);


        System.out.println(arrayList1);
    }
}
