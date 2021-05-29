package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/testx?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "linline011";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void connectUtil() throws SQLException {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if(!connection.isClosed()){
                System.out.println("Соединение с БД установлено.");
            }
        } catch (SQLException e) {
            System.out.println("Не удалось загрузить класс драйвера.");
        }
        //return connection;
        //connection.close();
    }


}