package test20201118;

import java.math.BigDecimal;
import java.sql.*;

public class test01 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chong?user=root&password=123&useUnicode=true&useSSL=false&characterEncoding=UTF-8");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select id,name,role,salary from emp");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String role = resultSet.getString("role");
                BigDecimal salary = resultSet.getBigDecimal("salary");
                System.out.printf("id = %s, name = %s, role = %s, salary = %s%n",
                        id,name,role,salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }
}
