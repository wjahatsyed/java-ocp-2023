package chapter_06.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Created by Syed Wajahat on 12/24/2019.
 * This is example of multi-catch
 */
public class Multi_vs_Multiple_Catch {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("ABC.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);

        } catch (DateTimeParseException | IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

/*
Syntax of multi-catch: only one variable of exception allowed
Ex: catch(DateTimeParseException | IOException | SQLException e)
 */
