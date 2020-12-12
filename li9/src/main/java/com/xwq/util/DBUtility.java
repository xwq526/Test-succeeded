package com.xwq.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-10
 * Time: 10:14:54
 */
//TODO:保留线程安全问题待处理
public class DBUtility {
    private static final DataSource dataSource;

    static {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();

        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("123");
        mysqlDataSource.setDatabaseName("db2020");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");

        dataSource = mysqlDataSource;
    }
    public static Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }

}
