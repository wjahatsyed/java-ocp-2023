package chapter_09.paths_and_methods;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Class_1 {
    public static void main(String[] args) {
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        //path.getNameCount() retusn int
        for (int i = 0; i < path.getNameCount(); i++) {
            //path.getName returns path
            System.out.println(" Element " + i + " is: " + path.getName(i));
        }
    }
}
