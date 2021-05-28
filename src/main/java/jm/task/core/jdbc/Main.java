package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;
//import jm.task.core.jdbc.util.Util;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        try {
            Util conn = new Util();
            conn.getConnection();
            //UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
            //userDaoJDBC.createUsersTable();
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
