package test.jdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test02 {
    public static void main(String[] args) {
        query("黑");
    }
    public static void query(String queryName) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            DataSource dataSource = new MysqlDataSource();
            ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://localhost:3306/chong?user=root&password=123&useUnicode=true&useSSL=false&characterEncoding=UTF-8");
            connection = (Connection) dataSource.getConnection();
            String sql = "select id,sn,name,qq_mail,classes_id from student where name like ?";
            statement = (PreparedStatement) connection.prepareStatement(sql);
            statement.setString(1,"%" +queryName+"%");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int sn = resultSet.getInt("sn");
                String name = resultSet.getString("name");
                String qq_mail = resultSet.getString("qq_mail");
                int classes_id = resultSet.getInt("classes_id");
                System.out.printf("id = %s, sn = %s, name = %s, qq_mail = %s," +
                        "classes_id = %s%n",id,sn,name,qq_mail,classes_id);
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
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
