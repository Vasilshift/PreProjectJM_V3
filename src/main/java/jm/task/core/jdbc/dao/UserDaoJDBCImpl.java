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
            statement.addBatch("CREATE TABLE `test`.`users36` (\n" +
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
            statement.addBatch("DROP TABLE `test`.`users36`;");
            statement.executeBatch();
        } catch (Exception e) {}
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {


            //connection.prepareStatement()
            //statement.execute(insert into test.users (name, lastName, age) values (name, lastName, age));

            try {
                statement = connection.createStatement();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into `test`.`users36` (name, lastName, age)" +
                        " values (?,?,?);");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, lastName);
                preparedStatement.setLong(3, age);
                //int rows = preparedStatement.executeUpdate();
                //System.out.printf("%d rows added", rows);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

    }

    public void removeUserById(long id) throws SQLException {
        statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(
                "DELETE FROM `test`.`users36` WHERE id = ?;");
        preparedStatement.setLong(1, id);
    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
