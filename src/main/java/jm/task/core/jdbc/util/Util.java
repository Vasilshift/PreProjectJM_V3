package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private static final String USERNAME = "evgen";
    private static final String PASSWORD = "linline012";
    //private static Statement statement;


    public void UtilConnect() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //Driver driver = new com.mysql.jdbc.Driver();
            System.out.println("driver downloaded");
            System.out.println("driver manager runned");

//        Statement statement = connection.createStatement();
//        statement.addBatch("DROP TABLE IF EXISTS `test`.`users`;");
//        statement.addBatch("CREATE TABLE `test`.`users` (`id` INT NOT NULL, " +
//        " `name` VARCHAR(45) NOT NULL," +
//        " `lastName` VARCHAR(45) NOT NULL," +
//        " `age` INT(3) NOT NULL)" +
//        //" PRIMARY KEY (`id`)," +
//        //" UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)" +
//        ";"
//        );
//        statement.addBatch(
//        "insert into `test`.`users` (id, name, lastName, age) values (1, 'Misha', 'Vasilev', 34);"
//        );
//        System.out.printf("user с именем %s добавлен в БД", "Misha");
//        statement.addBatch(
//        "insert into `test`.`users` (id, name, lastName, age) values (1, 'Sasha', 'Romanov', 65);"
//        );
//        statement.addBatch(
//        "insert into `test`.`users` (id, name, lastName, age) values (1, 'Alex', 'Porshnev', 18);"
//        );
//        statement.addBatch(
//        "insert into `test`.`users` (id, name, lastName, age) values (1, 'Tim', 'Bird', 52);"
//        );


//        statement.executeBatch();
//        System.out.println("connection runned");
//        if(!connection.isClosed()) {
//        System.out.println("Connection done");
//        }
//        connection.close();
//        } catch (SQLException e) {
//        e.printStackTrace();
//        System.err.println("Неудалось загрузить класс драйвера");
//        }

            } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
