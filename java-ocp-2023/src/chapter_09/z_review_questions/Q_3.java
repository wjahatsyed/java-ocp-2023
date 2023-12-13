package chapter_09.z_review_questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Q_3 {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("sloth.schedule");
        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
        if(attributes.size()>0 && attributes.creationTime().toMillis()>0) {
            
        }
    }
}
