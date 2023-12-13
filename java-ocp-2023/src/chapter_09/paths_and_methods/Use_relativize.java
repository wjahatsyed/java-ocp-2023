package chapter_09.paths_and_methods;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * to relative path
 * Use with two paths, then their parent/root directory must be same
 */
public class Use_relativize {
    public static void main(String[] args) {
        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));

        Path path3 = Paths.get("E:\\habitat");
        Path path4 = Paths.get("E:\\habitat\\raven");
        //prints raven
        System.out.println(path3.relativize(path4));
        //prints ..
        System.out.println(path4.relativize(path3));


        Path path3_a = Paths.get("E:\\habitat");
        Path path4_a = Paths.get("E:\\sanctuary\\raven");
        System.out.println(path3_a.relativize(path4_a));
        System.out.println(path4_a.relativize(path3_a));



    }
}
