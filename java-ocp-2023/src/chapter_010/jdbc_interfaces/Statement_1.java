package chapter_010.jdbc_interfaces;

import java.sql.*;

/**
 * Created by Syed Wajahat on 1/6/2020.
 */
public class Statement_1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("url");
        java.sql.Statement stmt1 = connection.createStatement(
                ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

        Statement stmt = connection.createStatement();
        int result = stmt.executeUpdate(
                "insert into species values(10, 'Deer', 3)");
        System.out.println(result);
        result = stmt.executeUpdate(
                "update species set name = '' where name = 'None'");
        System.out.println(result); // 0
        result = stmt.executeUpdate(
                "delete from species where id = 10");
        System.out.println(result); // 1

        String sql="";
        boolean isResultSet = stmt.execute(sql);
        if (isResultSet) {
            ResultSet rs = stmt.getResultSet();
            System.out.println("ran a query");
        } else {
            int result_1 = stmt.getUpdateCount();
            System.out.println("ran an update");
        }

    }
}
