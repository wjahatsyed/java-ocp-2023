package chapter_07.using_concurrent_collections.working_with_concurrent_classes.copyOnWriteCollections;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * Use in multi-threaded environment where there are more reads than write
 */
public class MyClass {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(5);
        list.add(10);
        for(int i: list){
            System.out.print("["+i+"]" +" ");
            list.add(9);
        }

        //Size becomes 4
        System.out.println(list.size());
        System.out.print(list);

        Set<Integer> set = new CopyOnWriteArraySet<>();
        set.add(5);
        set.add(7);
        for(int i: set){
            System.out.print(i +" ");
            set.add(i+1);
        }

        System.out.println(set.size());
    }
}
