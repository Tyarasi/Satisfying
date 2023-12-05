/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Satisfying
 */
public class Control {
    
    public Customer[] getDataUser(String nama_customer, String password) {
        Customer[] daftarUser = null;
        Customer tempUser = null;
        ArrayList listUser = new ArrayList();

        String pwd = "";
        String login = "root";
        Connection con = null;

        ResultSet rs = null;

        KoneksiDB db = new KoneksiDB("satisfying", login, pwd);
        String sql = "SELECT * FROM customer where nama_customer='" + nama_customer + "' and password='" + password + "'";
        try {
            con = db.connect();
            rs = db.executeQuery(sql);
            while (rs.next()) {
                tempUser = new Customer();
                tempUser.setId_customer(rs.getString("id_customer"));
                tempUser.setNama_customer(rs.getString("nama_customer"));
                tempUser.setPassword(rs.getString("password"));
                tempUser.setHak_akses(rs.getString("hak_akses"));
                listUser.add(tempUser);
            }
            daftarUser = new Customer[listUser.size()];
            listUser.toArray(daftarUser);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarUser;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

    }
}
