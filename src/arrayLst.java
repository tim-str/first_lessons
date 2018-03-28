import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class arrayLst {

    public static void main(String[] agrs){
//        ArrayList - расширяемый массив
        ArrayList<String> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);


        list.add("First Elem");
        list.add(1,"Second Elem");
        list.add(1,"Third Elem");
//        list.add(7,"Third Elem");
//        String str = list.get(1);
////        list.indexOf("Second Elem");
////        list.size();
////        list.indexOf("Second Elem"); пролучить индекс по значению
////        list.size() количество элементов
//        list.set(1, "New Elem");
////        list.contains("New Elem");
////        list.toArray();
        String [] newArr = new String[list.size()];
        list.toArray(newArr);
//        list.remove(2); // удаление по индексу
//        list.remove(list.indexOf(2)); // удаление по значению
//        list.remove((Integer)1); // удаление по значению
        System.out.println(Arrays.toString(newArr));

//        List<String> list2 = new LinkedList<>();
//        list2.add("Str1");
//        list2.add("Str2");
//        list2.add("Str3");
//        list2.add("Str4");
//        System.out.println(list2);
//
//        int te = 056;
//        int te2 = 0xAB;
//        int te3 = te+te2;
//        System.out.println(te3);

    }
}
