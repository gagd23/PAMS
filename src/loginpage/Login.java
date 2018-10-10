/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;

import Dashboards.head_dash;
import Dashboards.jailor_Dash;
import Dashboards.superintendant_dash;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    String user_id_str,pass1_str,rpass1_str,rpass2_str;
    PreparedStatement ps1,ps2;
    Connection con;
    ResultSet rs1;
    public Login() {
        initComponents();
        pass1.setBackground(new Color(240,240,240));
        pass2.setVisible(false);
        cnf_label.setVisible(false);
        pwd_submit_button.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        go_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        cnf_label = new javax.swing.JLabel();
        pass2 = new javax.swing.JTextField();
        pwd_submit_button = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(470, 550));
        setMinimumSize(new java.awt.Dimension(470, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 7));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 21)); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 110, 30));

        user_id.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        user_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        user_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_idActionPerformed(evt);
            }
        });
        jPanel1.add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 185, 240, 30));

        go_button.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        go_button.setText("Go");
        go_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(go_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 90, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 21)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 100, 30));

        pass1.setEditable(false);
        pass1.setBackground(new java.awt.Color(255, 255, 255));
        pass1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        pass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 295, 240, 30));

        cnf_label.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        cnf_label.setText("Re Enter Password");
        jPanel1.add(cnf_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, 30));

        pass2.setEditable(false);
        pass2.setBackground(new java.awt.Color(255, 255, 255));
        pass2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        jPanel1.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 240, 30));

        pwd_submit_button.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        pwd_submit_button.setText("Submit");
        pwd_submit_button.setEnabled(false);
        pwd_submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd_submit_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(pwd_submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, 30));

        login_button.setBackground(new java.awt.Color(40, 122, 230));
        login_button.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        login_button.setText("Login");
        login_button.setEnabled(false);
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 80, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/final.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contacts.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 185, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lock.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 295, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void go_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_buttonActionPerformed
        // TODO add your handling code here:
        databaseConnectivity.MyPrisonConnection o=new databaseConnectivity.MyPrisonConnection();
        con=o.getMyConnection();
        try {
            //getting values
            user_id_str=user_id.getText();
            
            ps1=con.prepareStatement("SELECT user_id,u_password FROM prison.login_details where user_id=? AND validity=1;");
            ps1.setString(1,user_id_str);
            
            rs1=ps1.executeQuery();
            if(rs1.next())
            {
                if(rs1.getString(2)==null)
                {
                     pass1.setBackground(new Color(255,255,255));
                    pass1.setEditable(true);
                    pass2.setEditable(true);
                    pass2.setVisible(true);
                    cnf_label.setVisible(true);
                    pass1.setEchoChar((char)0);
                    pwd_submit_button.setEnabled(true);
                    pwd_submit_button.setVisible(true);
                    login_button.setVisible(false);
                 
                    this.revalidate();
                    this.repaint();
                    JOptionPane.showMessageDialog(null, "Please set a password for your profile.");
                }
                else
                {
                   // pass1.setEnabled(false);
                    pass1.setBackground(new Color(255,255,255));
                    user_id_str=rs1.getString(1);
                    pass2.setVisible(false);
                    cnf_label.setVisible(false);
                    pwd_submit_button.setVisible(false);
                    pass1.setEnabled(true);
                    pass1.setEditable(true);
                    
                    login_button.setVisible(true);
                    login_button.setEnabled(true);
                    this.revalidate();
                    this.repaint();
                }
                    
            }
            else
            {
                login_button.setEnabled(false);
                JOptionPane.showMessageDialog(null, "User not found.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_go_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        pass1_str=new String(pass1.getPassword());
        char[] a={'A'};
        a[0]=user_id_str.charAt(0);
        try {
            if(pass1_str.equals(rs1.getString(2)))
            {
                switch ((new String(a)).toUpperCase())
                {
                    
                    case "S":
                            this.setVisible(false);
                        //    JOptionPane.showMessageDialog(null, "Femployee logged in");
                            new Dashboards.superintendant_dash().setVisible(true);
                            break;
                    case "J":
                            this.setVisible(false);
                            new Dashboards.jailor_Dash().setVisible(true);
                            break;
                    case "H":
                            this.setVisible(false);
                            new Dashboards.head_dash(user_id_str).setVisible(true);
                            break;      
                    default: 
                            JOptionPane.showMessageDialog(null, "something went wrong");
                            break;                 
                }
            }
            else
            {
                pass1.setText("");
                JOptionPane.showMessageDialog(null, "Incorrect password.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void pwd_submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd_submit_buttonActionPerformed
        // TODO add your handling code here:
        rpass1_str=new String(pass1.getPassword());
        rpass2_str=pass2.getText();
        
        if(rpass1_str.equals(rpass2_str))
        {
            try {
                ps2=con.prepareStatement("UPDATE `prison`.`login_details` SET `u_password`=? WHERE `user_id`=?;");
                ps2.setString(1, rpass2_str);
                ps2.setString(2,user_id_str);
                if(ps2.executeUpdate()>0)
                {
                    cnf_label.setVisible(false);
                    pass2.setVisible(false);
                    pass1.setText("");
                    pass1.setEchoChar('\u25cf');
                    user_id.setText("");
                    login_button.setEnabled(true);
                    pwd_submit_button.setEnabled(false);
                    pwd_submit_button.setVisible(false);
                    login_button.setVisible(true);
                    login_button.setEnabled(true);
                    this.revalidate();
                    this.repaint();
                    JOptionPane.showMessageDialog(null, "Password Changed Successfully.");
                    
                    pass1.setEnabled(false);
                    pass1.setBackground(new Color(240,240,240));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Passwords do not match.");
        }
    }//GEN-LAST:event_pwd_submit_buttonActionPerformed

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void user_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_idActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnf_label;
    private javax.swing.JButton go_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JTextField pass2;
    private javax.swing.JButton pwd_submit_button;
    private javax.swing.JTextField user_id;
    // End of variables declaration//GEN-END:variables
}
