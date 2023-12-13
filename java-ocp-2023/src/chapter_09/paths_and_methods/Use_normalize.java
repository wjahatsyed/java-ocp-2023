package chapter_09.paths_and_methods;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * clean a path using normalize method
 */
public class Use_normalize {
    public static void main(String[] args){
        Path path3 = Paths.get("E:\\data");
        Path path4 = Paths.get("E:\\user\\home");
        Path relativePath = path3.relativize(path4);
        System.out.println(relativePath);
        //E:\\data +" "+ ..\\user\\home
        System.out.println(path3.resolve(relativePath));
        System.out.println(path3.resolve(relativePath).normalize());
    }
}
