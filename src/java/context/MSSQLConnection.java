/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import config.IDBConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tún ^^
 */
public class MSSQLConnection {
     /**
     * This method is used to get connection with database
     *
     * @return
     */
    public static Connection getConnection() {
        Connection con = null; // create connection
        String connectionUrl = "jdbc:sqlserver://" + IDBConfig.HOSTNAME + ":" + IDBConfig.PORT + ";"
                + "databaseName=" + IDBConfig.DATABASENAME + ";integratedSecurity=" + IDBConfig.INTEGRATEDSECURITY + ";";
        // Check connect to JDBC
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Where is your MSSQL JDBC Driver?");
            return con;
        }
        System.out.println("MSSQL JDBC Driver Registered!");
        // Check connect to DB
        try {
            con = DriverManager.getConnection(connectionUrl, IDBConfig.USERNAME, IDBConfig.PASSWORD);
        } catch (SQLException ex) {
            System.err.println("Connection Failed! Check output console");
            return con;
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = MSSQLConnection.getConnection();
        if (con != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

    /*
     * This method is used to close connection from database
     *
     * @param con:It is a <code>Connection</code> object
     * @throws SQLException
     */
    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    /*
     * This method is used to close connection from database
     *
     * @param ps:It is a <code>PreparedStatement</code> object
     * @throws SQLException
     */
    public static void closePreparedStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                System.err.println("Close PreparedStatement Fail!");
            }
        }
    }

    /*
     * This method is used to close connection with database
     *
     * @param rs: It is a <code>ResultSet</code> object
     * @throws SQLException
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Close PreparedStatement Fail!");
            }
        }
    }
}
