/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author purba
 */
public class Buyer extends javax.swing.JFrame {

    /**
     * Creates new form Buyer
     */
    PreparedStatement pst = null;
    ResultSet rs = null;
    String dbName = "gmsDB";
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost/" + dbName;
    public static final String TABLE_NAME="buyer";
    public Buyer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TFsearch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        innerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFserialNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFcontactNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TFaddress = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        refreshLabel = new javax.swing.JLabel();
        labelHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(250, 20));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px_1.png"))); // NOI18N
        jLabel15.setText("Buyers");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 77, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_Delete32.png_32.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(850, 463));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_Search-blue-16.png_16.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 20, 20));

        TFsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsearchActionPerformed(evt);
            }
        });
        TFsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFsearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFsearchKeyReleased(evt);
            }
        });
        jPanel2.add(TFsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 285, 41));

        jLabel9.setText("Press Enter to Search");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        innerPanel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setText("Serial No ");

        TFserialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFserialNoKeyTyped(evt);
            }
        });

        jLabel2.setText("Starts From 1000 [Duplicate can not be saved]");

        jLabel3.setText("Company Name");

        jLabel4.setText("Address");

        jLabel5.setText("Contact No");

        TFcontactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFcontactNoKeyTyped(evt);
            }
        });

        jLabel6.setText("Email Address");

        jLabel7.setText("Entry Date");

        btnSave.setBackground(new java.awt.Color(45, 118, 232));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_Plus.png_16.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        TFaddress.setColumns(20);
        TFaddress.setRows(5);
        jScrollPane1.setViewportView(TFaddress);

        javax.swing.GroupLayout innerPanelLayout = new javax.swing.GroupLayout(innerPanel);
        innerPanel.setLayout(innerPanelLayout);
        innerPanelLayout.setHorizontalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(51, 51, 51)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFname)
                    .addComponent(jScrollPane1)
                    .addComponent(TFserialNo)
                    .addComponent(TFemail)
                    .addComponent(TFcontactNo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        innerPanelLayout.setVerticalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFserialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFcontactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addGap(43, 43, 43)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel2.add(innerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 32, 420, 520));

        btnUpdate.setBackground(new java.awt.Color(45, 118, 232));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_Update_User.png_16.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.setIconTextGap(6);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(45, 118, 232));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_Cancel.png_16.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setIconTextGap(6);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(45, 118, 232));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_View_All.png_16.png"))); // NOI18N
        btnView.setText("View All");
        btnView.setBorder(null);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        refreshLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_Refresh-blue.png_32.png"))); // NOI18N
        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshLabel)
                .addGap(4, 4, 4))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshLabel)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 370, 70));

        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_Home_Page.png_32.png_32.png"))); // NOI18N
        labelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHomeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelHomeMousePressed(evt);
            }
        });
        jPanel2.add(labelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void TFsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsearchActionPerformed
     
    }//GEN-LAST:event_TFsearchActionPerformed
     /*
    
            DELETE
    
    */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try(Connection con = DriverManager.getConnection(url, user, password)){
            String query = "DELETE FROM Buyer WHERE serialNo=?";
            pst = con.prepareStatement(query);
            pst.setString(1, TFserialNo.getText());
            JOptionPane.showConfirmDialog(null,"Do you really want to delete","Delete",JOptionPane.YES_NO_OPTION );
            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
           
            JOptionPane.showMessageDialog(null,"A buyer was deleted successfully!");
}
            
        }catch(Exception ex){
             Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void labelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMouseClicked
       this.dispose();
       new Home().setVisible(true);
    }//GEN-LAST:event_labelHomeMouseClicked

    private void refreshLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMouseClicked
        refresh();
    }//GEN-LAST:event_refreshLabelMouseClicked

    private void labelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMousePressed
       
    }//GEN-LAST:event_labelHomeMousePressed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        new BuyerViewAll().show();
    }//GEN-LAST:event_btnViewActionPerformed

    
    
    private void TFsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFsearchKeyPressed
       
    }//GEN-LAST:event_TFsearchKeyPressed
    /*
        SEARCH
    */
    private void TFsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFsearchKeyReleased
       try(Connection con = DriverManager.getConnection(url, user, password)){
          
               //String query = "SELECT * FROM buyer WHERE serailNo=? OR companyName=? OR address=? OR contactNo=? OR email=? OR entryDate=?;";
               String query1 = "SELECT * FROM buyer WHERE serialNo=?";
               advanceSearch(query1);
               String query2 = "SELECT * FROM buyer WHERE companyName=?";
               advanceSearch(query2);
               String query3 = "SELECT * FROM buyer WHERE contactNo=?";
               advanceSearch(query3);
               String query4 = "SELECT * FROM buyer WHERE email=?";
               advanceSearch(query4);
               String query5 = "SELECT * FROM buyer WHERE entryDate=?";
               advanceSearch(query5);
       } catch (SQLException ex) {
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
   
        }
    }//GEN-LAST:event_TFsearchKeyReleased
   /*
      INSERT
    */
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try(Connection con = DriverManager.getConnection(url, user, password)){
                    String query = "INSERT INTO buyer (serialNo,companyName,address,contactNo,email,entryDate) VALUES (?, ?, ?, ?,?,?)";
 
                     pst = con.prepareStatement(query);
                     pst.setString(1, TFserialNo.getText());
                     pst.setString(2, TFname.getText());
                     pst.setString(3, TFaddress.getText());
                     pst.setString(5, TFemail.getText());
                     //int no=Integer.parseInt(TFcontactNo.getText());
                     pst.setString(4, TFcontactNo.getText());
                     pst.setString(6, ((JTextField)JentryDate.getDateEditor().getUiComponent()).getText());
                     int rowsInserted = pst.executeUpdate();
                     if (rowsInserted > 0) {
                     JOptionPane.showMessageDialog(null,"A buyer was inserted successfully!");
                 }
           
        }catch (SQLException ex) {
            final JPanel errorPanel = new JPanel();
            JOptionPane.showMessageDialog(errorPanel, "Duplicate value can not be inserted", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
          
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    /*
       UPDATE
    */
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         try(Connection con = DriverManager.getConnection(url, user, password)){
             String serialNo=TFserialNo.getText();
             String companyName=TFname.getText();
             String address=TFaddress.getText();
             String email =TFemail.getText();
             String contactNo=TFcontactNo.getText();
             String date=((JTextField)JentryDate.getDateEditor().getUiComponent()).getText();
             String query = "UPDATE buyer SET companyName='"
            +companyName+"',address='"+address+"',contactNo='"
            +contactNo+"',email='"
            +email+"',entryDate='"+date+"' where serialNo='"
            +serialNo+"';";
 
                     pst = con.prepareStatement(query);
                     
 
                 int rowsUpdated = pst.executeUpdate();
                 //pst.execute();
                 if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null,"An existing user was updated successfully!");
                   }
         }catch (SQLException ex) {
             final JPanel errorPanel = new JPanel();
            JOptionPane.showMessageDialog(errorPanel, "Duplicate value no can not be inserted", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void TFcontactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcontactNoKeyTyped
        char c=evt.getKeyChar();
        if( ! (Character.isDigit(c))){
          getToolkit().beep();
          evt.consume();
      }
    }//GEN-LAST:event_TFcontactNoKeyTyped

    private void TFserialNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFserialNoKeyTyped
         char c=evt.getKeyChar();
         if( ! (Character.isDigit(c))){
          getToolkit().beep();
          evt.consume();
      }
    }//GEN-LAST:event_TFserialNoKeyTyped
    /*
         SEARCH
    */
    
    public void advanceSearch(String query){
         try(Connection con = DriverManager.getConnection(url, user, password)){
          
                         
               pst=con.prepareStatement(query);
               pst.setString(1, TFsearch.getText());
               rs=pst.executeQuery();
               if(rs.next()){
                   String serialNo=rs.getString("serialNo");
                   TFserialNo.setText(serialNo);
               
                   
                  String companyName = rs.getString("companyName");
                   TFname.setText(companyName);
                   
                   String address = rs.getString("address");
                   TFaddress.setText(address);
                   
                   String contactNo = rs.getString("contactNo");
                   TFcontactNo.setText(contactNo);
                   
                   String email = rs.getString("email");
                   TFemail.setText(email);
                   
                   String date = rs.getString("entryDate");
                   ((JTextField)JentryDate.getDateEditor().getUiComponent()).setText(date);
                   
              }
              
           
       } catch (SQLException ex) {
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    public void refresh(){
       TFserialNo.setText("");
       TFname.setText("");
       TFaddress.setText("");
       TFcontactNo.setText("");
       TFemail.setText("");
       ((JTextField)JentryDate.getDateEditor().getUiComponent()).setText("");
       TFsearch.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TFaddress;
    private javax.swing.JTextField TFcontactNo;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFsearch;
    private javax.swing.JTextField TFserialNo;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel refreshLabel;
    // End of variables declaration//GEN-END:variables
}
