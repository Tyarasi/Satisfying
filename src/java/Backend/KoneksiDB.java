/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Satisfying
 */
public class KoneksiDB {
    private com.mysql.jdbc.Connection con;
    private com.mysql.jdbc.Statement stmt;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String dsn;
    private String login;
    private String pwd;

    public KoneksiDB(String dsn, String login, String pwd) {
        this.dsn = dsn;
        this.login = login;
        this.pwd = pwd;
    }

    public com.mysql.jdbc.Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dsn, login, pwd);
        stmt = (com.mysql.jdbc.Statement) con.createStatement();
        return con;
    }

    public int executeUpdate(String str) throws SQLException {
        return stmt.executeUpdate(str);
    }

    public ResultSet executeQuery(String str) throws SQLException {
        resultSet = stmt.executeQuery(str);
        return resultSet;
    }

    public void disconnect() throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }

        if (stmt != null) {
            stmt.close();
        }

        if (con != null) {
            con.close();
        }
    }

    public com.mysql.jdbc.Statement getStmt() {
        return stmt;
    }

    public ResultSet getResutSet() {
        return resultSet;
    }

    public PreparedStatement getPreparedStatement(String str) throws SQLException {
        preparedStatement = (PreparedStatement) con.prepareStatement(str);
        return preparedStatement;
    }
}