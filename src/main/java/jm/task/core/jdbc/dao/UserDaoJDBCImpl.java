package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    private Connection connection;

    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() throws SQLException {
        //Connection connection = null;

        try {
            Util conn = new Util();
            conn.UtilConnect();
            Statement statement = connection.createStatement();
            statement.addBatch("DROP TABLE IF EXISTS `test`.`users`;");
            statement.addBatch("CREATE TABLE `test`.`users` (`id` INT NOT NULL, " +
                    " `name` VARCHAR(45) NOT NULL," +
                    " `lastName` VARCHAR(45) NOT NULL," +
                    " `age` INT(3) NOT NULL)" +
                    //" PRIMARY KEY (`id`)," +
                    //" UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)" +
                    ";"
            );
            //statement.executeBatch();
        } catch (Exception e) {}
    }
    public void dropUsersTable() throws SQLException {
        try {
//            Util conn = new Util();
//            conn.UtilConnect();
            Statement statement = connection.createStatement();
            statement.addBatch("DROP TABLE `test`.`users`;");
            statement.executeBatch();
        } catch (Exception e) {}
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {

        try {
            Util conn = new Util();
            conn.UtilConnect();
            Statement statement = connection.createStatement();
            statement.execute("insert into `test`.`users` (id, name, lastName, age) values (5, 'ty', 'fg', 56);");

//            statement.addBatch(
//                    "insert into `test`.`users` (id," + name + ", lastName, age) values (5, 'ty', 'fg', 56);"
//            );
//            statement.executeBatch();
            System.out.printf("user с именем %s добавлен в БД", "Misha");
        } catch (SQLException e) {
            throw new RuntimeException("Error executing sql:\n", e);
        }
    }


    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
