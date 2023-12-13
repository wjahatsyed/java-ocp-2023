package chapter_09.paths_and_methods;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * If the path passed to the resolve(Path path) is not relative,
 * the path instance calling the resolve method will be ignored.
 * <p>
 * For resolve to work properly, the path in argument of the method
 * has to to be relative.
 */
public class Use_Resolve {
    public static void main(String[] args) {
        final Path path1 = Paths.get("/cats/../panther");
        final Path path2 = Paths.get("food");
        System.out.println(path1.resolve(path2));

    }
}
