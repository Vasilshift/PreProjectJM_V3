package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    private Connection connection;
    private Statement statement;

    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() throws SQLException {
        //Connection connection = null;
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE test.users (\n" +
                    "  `id` BIGINT NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` VARCHAR(45) NULL,\n" +
                    "  `lastName` VARCHAR(45) NULL,\n" +
                    "  `age` TINYINT NULL,\n" +
                    "  PRIMARY KEY (`id`));");
            statement.executeBatch();
        } catch (Exception e) {}
    }
    public void dropUsersTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.addBatch("DROP TABLE `test`.`users`;");
            statement.executeBatch();
        } catch (Exception e) {}
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {

        try {
            statement = connection.createStatement();
            //connection.prepareStatement()
            //statement.execute(insert into test.users (name, lastName, age) values (name, lastName, age));

            try {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into user (name, lastName, age)" +
                        " values (?,?,?);");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, lastName);
                preparedStatement.setLong(3, age);
                int rows = preparedStatement.executeUpdate();
                System.out.printf("%d rows added", rows);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            //statement.executeBatch();
            //System.out.printf("user с именем %s добавлен в БД", "Misha");
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
