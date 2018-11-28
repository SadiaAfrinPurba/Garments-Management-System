/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author purba
 */
public class dbHandler {
    Connection connect = null;
    public boolean setConnection() {

        try {

            String dbName = "gmsDB";
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost/" + dbName;

            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, password);

            System.out.println("Successfully Connected..");
            return true;

        } catch (Exception e) {
            return false;
        }

    }
        public boolean closeDatabase(){
        try {
            connect.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
