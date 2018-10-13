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

/**
 *
 * @author 702
 */
public class superintendant_view_prisoner_search extends javax.swing.JPanel {

    /**
     * Creates new form superintendant_view_prisoner_search
     */
    Connection con = null;
    public superintendant_view_prisoner_search() {
        initComponents();
        
             MyPrisonConnection o = new MyPrisonConnection();
             con = o.getMyConnection();
    }

    JPanel loadingpanel;
     private superintendant_view_prisoner svm;
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

        setLayout(new java.awt.BorderLayout());

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

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void searchtxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtfActionPerformed

    private void searchtxtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtfKeyReleased
        // TODO add your handling code here:
        //  String st = searchtxtf.getText().trim();

        //String query = "SELECT "
    }//GEN-LAST:event_searchtxtfKeyReleased

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:

        if(searchtxtf.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter prisoner name");
            return;
        }

        String qString = "SELECT c_id,p_firstname,p_midname,p_lastname,p_occupation,p_qualification,c_type FROM convicted_prisoner WHERE p_firstname LIKE ? AND CURRENT_DATE()<releasedate(c_id)";

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
           String id ;  
            if(rs.next()){

                //    if(Integer.parsers)

                id =   rs.getString("c_id");
                loadingpanel = (JPanel)this.getParent();
                loadingpanel.removeAll();
                 svm = new superintendant_view_prisoner(loadingpanel,id);
                loadingpanel.add(svm, BorderLayout.CENTER);
                loadingpanel.revalidate();
                loadingpanel.repaint();
                
            }    
      
       /* loadingPanel.add(svm,BorderLayout.CENTER);
        loadingPanel.revalidate();
        loadingPanel.repaint();

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
            Logger.getLogger(superintendant_view_prisoner_search.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }//GEN-LAST:event_search_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField searchtxtf;
    // End of variables declaration//GEN-END:variables
}
