import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.joining;

class Result2 {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> myMap = new TreeMap<>();
        final int[] theUniqueValue = {0};
        for(int i : a){
            if(myMap.containsKey(i)){
                myMap.put(i, myMap.get(i)+1);
            }else {
                myMap.put(i, 1);
            }
        }
        myMap.forEach((k,v) -> {
           if(myMap.get(k) == 1)
               theUniqueValue[0] = k;
        });
        System.out.println(theUniqueValue[0]);
        return theUniqueValue[0];
    }
}

public class NonUnique {
    public static void main(String[] args) throws IOException {
      List<Integer> list = new ArrayList<>();
      list.add(0);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(1);
        Result2.lonelyInteger(list);

    }
}
