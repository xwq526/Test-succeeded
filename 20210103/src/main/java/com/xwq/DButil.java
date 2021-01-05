package com.xwq;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-05
 * Time: 15:06:50
 */
public class DButil {
    //单例模式\
    //volatile
    private static volatile DataSource dataSource;

    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            synchronized (DButil.class) {
                if (dataSource == null) {
                    MysqlDataSource mysqlDataSource = new MysqlDataSource();

                    mysqlDataSource.setServerName("127.0.0.1");
                    mysqlDataSource.setPort(3306);


                    dataSource = mysqlDataSource;
                }
            }
        }
        return dataSource.getConnection();
    }
}
