package chapter_09.z_review_questions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Q_4 {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(path.subpath(1,3).getName(1).toAbsolutePath());

     /*   Path path2 = Paths.get("/animals");
        boolean myBoolean = Files.walk(path2)
                .filter((p,a) -> a.isDirectory() && !path.equals(p)) // w1
                .findFirst().isPresent(); // w2
        System.out.println(myBoolean ? "No Sub-directory": "Has Sub-directory");*/

       /* Path path3 = Paths.get("turkey");
        if(Files.isSameFile(path3,Paths.get("/zoo/turkey"))) // x1
            Files.createDirectory(path.resolve("info")); // x2*/

        Path path1 = Paths.get("/pets/../cat.txt");
        Path path2 = Paths.get("./dog.txt");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));
    }
}
