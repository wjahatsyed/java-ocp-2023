package chapter_09;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * Paths is the factory class
 */
public class Use_Path {
    public static void main(String[] args) throws URISyntaxException{
        Path path1 = Paths.get("pandas/cuddly.png");
        Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
        Path path3 = Paths.get("/home/zoodirector");

        //System.getProperty("path.separator"); is automatically applied in between the varargs
        Path path11 = Paths.get("pandas","cuddly.png");
        Path path22 = Paths.get("c:","zooinfo","November","employees.txt");
        Path path33 = Paths.get("/","home","zoodirector");

        //URI needs absolute path
        Path path111 = Paths.get(new URI("file://pandas/cuddly.png")); // THROWS EXCEPTION
        // AT RUNTIME
        Path path222 = Paths.get(new URI("file:///c:/zoo-info/November/employees.txt"));
        Path path333 = Paths.get(new URI("file:///home/zoodirectory"));

        Path path4 = Paths.get(new URI("http://www.wiley.com"));
        URI uri4 = path4.toUri();

        Path path1111 = FileSystems.getDefault().getPath("pandas/cuddly.png");
        Path path2_2 = FileSystems.getDefault().getPath("c:","zooinfo","November",
                "employees.txt");
        Path path3_3 = FileSystems.getDefault().getPath("/home/zoodirector");

        //Used for remote file system
        FileSystem fileSystem = FileSystems.getFileSystem(
                new URI("http://www.selikoff.net"));
        Path path_remote = fileSystem.getPath("duck.txt");


    }

}
