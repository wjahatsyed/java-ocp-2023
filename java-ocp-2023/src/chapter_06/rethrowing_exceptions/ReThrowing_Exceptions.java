package chapter_06.rethrowing_exceptions;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Syed Wajahat on 12/24/2019.
 */
public class ReThrowing_Exceptions implements AutoCloseable {
    @Override
    public void close() throws IOException, SQLException {

    }

    public static void main(String[] args) throws IOException, SQLException {
        try (ReThrowing_Exceptions reThrowing_exceptions = new ReThrowing_Exceptions()) {

        } catch (Exception ex) {

        }
    }
}
