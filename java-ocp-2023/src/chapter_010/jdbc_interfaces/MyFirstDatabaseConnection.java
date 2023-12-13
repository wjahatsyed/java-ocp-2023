package chapter_010.jdbc_interfaces;

import java.sql.*;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * Using three of the JDBC Interfaces
 */
public class MyFirstDatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             java.sql.Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM sometable")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        }

    }
}
