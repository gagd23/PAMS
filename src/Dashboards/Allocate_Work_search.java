/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import databaseConnectivity.MyPrisonConnection;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aakash Gadhave
 */
public class Allocate_Work_search extends javax.swing.JPanel {

    /**
     * Creates new form Allocate_Work_search
     */
     Connection con = null;
     private jailor_Dash jd;
     JPanel loadingPanel;
     
     PreparedStatement pst2;
     ResultSet rs2;
     
    public Allocate_Work_search() {
        initComponents();
        
       
        MyPrisonConnection o = new MyPrisonConnection();
        con = o.getMyConnection();
       // fetch();
    }

  //  public void fetch(){
      /*  
        String q = "SELECT c_id,p_firstname,p_midname,p_lastname FROM convicted_prisoner";
         try {
             pst2 = con.prepareStatement(q);
             rs2 = pst2.executeQuery();
             
             search_records_table.setModel(DbUtils.resultSetToTableModel(rs2));
         } catch (SQLException ex) {
             Logger.getLogger(Allocate_Work_search.class.getName()).log(Level.SEVERE, null, ex);
         }
        */
    //}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchtxtf = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        search_records_table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 270, -1));

        searchtxtf.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        searchtxtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchtxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtfActionPerformed(evt);
            }
        });
        searchtxtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtfKeyReleased(evt);
            }
        });
        jPanel1.add(searchtxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 260, 30));

        search_button.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jScrollPane1.setEnabled(false);

        search_records_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        search_records_table.setEnabled(false);
        search_records_table.setGridColor(new java.awt.Color(255, 255, 255));
        search_records_table.setUpdateSelectionOnSort(false);
        search_records_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_records_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(search_records_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 590, 150));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1110, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void searchtxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtfActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
        
       if(searchtxtf.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Field can not be empty.");
           return;
       }
                 
                 
                  
       String qString = "SELECT c_id,p_firstname,p_midname,p_lastname,p_occupation,p_qualification,c_type "
               + "FROM convicted_prisoner "
               + "WHERE p_firstname LIKE ?";
             
   
        PreparedStatement pst;
   //     PreparedStatement pst1;
         try {
             pst = con.prepareStatement(qString);
             pst.setString(1, searchtxtf.getText());
             // pst.setString(2, searchtxtf.getText()+"%");
             //  pst.setString(3, searchtxtf.getText()+"%");
             
             
             ResultSet rs = pst.executeQuery();
             //String s = rs.getString("name");
             //System.out.println(s);
             
              
                 
             if(rs.next()){
                  
     
              //    if(Integer.parsers)
                 loadingPanel = (JPanel)this.getParent();
                   Allocate_work aw = new Allocate_work();
                 loadingPanel.removeAll();
                 
                  loadingPanel.add(aw, BorderLayout.CENTER);
                  loadingPanel.revalidate();
                  loadingPanel.repaint();
                             
                String c_id    =     rs.getString("c_id");
             String first_name = rs.getString("p_firstname");
             String middle_name = rs.getString("p_midname");
              String last_name = rs.getString("p_lastname");
             String occupation =  rs.getString("p_occupation");
             String qualification = rs.getString("p_qualification");
             String type = rs.getString("c_type");
             
             
             aw.fetch_id.setText(c_id);
             aw.fetch_name.setText(first_name+" "+middle_name+" "+last_name);
             aw.fetch_type.setText(type);
             aw.fetch_occupation.setText(occupation);
             aw.fetch_qualification.setText(qualification);
                  
          
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Record not found.");
             }
             
         /*     String c_id    =     rs.getString("c_id");
              pst1 = con.prepareStatement(q);
              pst1.setString(1, c_id);
             ResultSet rs1 = pst1.executeQuery();
             
             if () {
                 
             }*/
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_Work_search.class.getName()).log(Level.SEVERE, null, ex);
     }
        
         
    }//GEN-LAST:event_search_buttonActionPerformed

    private void search_records_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_records_tableMouseClicked
        // TODO add your handling code here:
          JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            String s=source.getModel().getValueAt(row, column)+"";

            JOptionPane.showMessageDialog(null, s);
    }//GEN-LAST:event_search_records_tableMouseClicked

    private void searchtxtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtfKeyReleased
        // TODO add your handling code here:
      //  String st = searchtxtf.getText().trim();
        
        //String query = "SELECT "
    }//GEN-LAST:event_searchtxtfKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search_button;
    private javax.swing.JTable search_records_table;
    private javax.swing.JTextField searchtxtf;
    // End of variables declaration//GEN-END:variables
}