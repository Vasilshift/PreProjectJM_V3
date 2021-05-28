package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;
//import jm.task.core.jdbc.util.Util;
import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "linline011";

    private static Statement statement;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Connection connection = null;
//
////        try {
//            //Util connection = new Util();
//        try {
//            Driver driver = new com.mysql.cj.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//            //connection = connection.getConnection();
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            //connection.close();
//            if (!connection.isClosed()) {
//                System.out.println("Соединение с БД установлено." );
//            }
//        } catch (Exception e ){ }

//        statement = connection.createStatement();
//        statement.addBatch("CREATE TABLE `test`.`users125` (\n" +
//                "  `id` BIGINT NOT NULL AUTO_INCREMENT,\n" +
//                "  `name` VARCHAR(45) NULL,\n" +
//                "  `lastName` VARCHAR(45) NULL,\n" +
//                "  `age` TINYINT NULL,\n" +
//                "  PRIMARY KEY (`id`));");
//        statement.executeBatch();



            Util.getConnection();
            UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
            userDaoJDBC.createUsersTable();

            //userDaoJDBC.saveUser("gasdg", "dgdfg", (byte) 56);
            //userDaoJDBC.dropUsersTable();
            //userDaoJDBC.createUsersTable();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //conn.UtilConnect();
        //userDaoJDBC.saveUser("Midfa", "Likes", (byte) 45);

    }
}
