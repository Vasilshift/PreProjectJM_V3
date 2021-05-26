package jm.task.core.jdbc;

import java.sql.*;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private static final String USERNAME = "evgen";
    private static final String PASSWORD = "linline012";

        public static void main(String[] args) throws SQLException, ClassNotFoundException {

            //Connection connection;
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

                //Driver driver = new com.mysql.jdbc.Driver();
                System.out.println("driver downloaded");
                System.out.println("driver manager runned");

                Statement statement = connection.createStatement();
                statement.addBatch("CREATE TABLE `test`.`users` (`id` INT NOT NULL AUTO_INCREMENT, " +
                        "`name` VARCHAR(45) NOT NULL," +
                        "  `lastName` VARCHAR(45) NOT NULL," +
                        "  `age` VARCHAR(45) NOT NULL," +
                        "  PRIMARY KEY (`id`)," +
                        "  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);");
                statement.executeBatch();
                System.out.println("connection runned");
                if(!connection.isClosed()) {
                    System.out.println("Connection done");
                }
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Неудалось загрузить класс драйвера");
            }

        }
}
