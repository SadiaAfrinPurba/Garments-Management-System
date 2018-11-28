/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Purba
 */
public class ShowDatabaseTable {
    PreparedStatement pst = null;
    ResultSet rs = null;
    String dbName = "gmsDB";
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost/" + dbName;
    //view database table
     public void UpdateTable(JTable dataTable,String tableName) throws SQLException{
        try(Connection con = DriverManager.getConnection(url, user, password)){
            String query="SELECT * FROM " + tableName;
            pst =con.prepareStatement(query);
            rs = pst.executeQuery();
            dataTable.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
            
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.toString());
    }
    }
     //print
    public void PrintTable(JTable dataTable,String tableName){
        MessageFormat header =  new MessageFormat("ALL "+ tableName + "'s Information");
        MessageFormat footer =  new MessageFormat("Page{0,number,integer}");
        try {
            dataTable.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (PrinterException ex) {
            Logger.getLogger(ShowDatabaseTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
}
