/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crudexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author erasm
 */
public class MsConnectAccess {

    public static Connection getConnection() {
    try {
        String url = "jdbc:ucanaccess://C:/Users/erasm/Documents/Inventory.accdb";
        Connection conn = DriverManager.getConnection(url);
        return conn;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return null;
    }
}
