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
import loginpage.Convicted_panel;
/**
 *
 * @author 702
 */
public class superintendant_modify_prisoner_select_button_load_panel extends javax.swing.JPanel {

    /**
     * Creates new form superintendant_modify_prisoner_select_button_load_panel
     */
    String c_id,f_name,m_name,l_name,indate;
    private Convicted_panel convict;
    Connection con;
    public superintendant_modify_prisoner_select_button_load_panel(String p_id,String f_nm,String m_nm,String l_nm,String enter_date) {
        initComponents();
        MyPrisonConnection o = new MyPrisonConnection();
             con = o.getMyConnection();
        c_id = p_id;
        f_name = f_nm;
        m_name = m_nm;
        l_name = l_nm;
        indate = enter_date;
        submit_btn.setVisible(false);
        
        fetch_id.setText(c_id);
        fetch_name.setText(f_name+" "+m_name+" "+l_name);
        fetch_indate_label.setText(indate);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horizontal_prisoner_details_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fetch_id = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fetch_indate_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fetch_name = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        loadingpanel = new javax.swing.JPanel();
        change_to_convicted_btn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horizontal_prisoner_details_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Prisoner ID");
        horizontal_prisoner_details_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        fetch_id.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_id.setText("C001");
        horizontal_prisoner_details_panel.add(fetch_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Indate");
        horizontal_prisoner_details_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        fetch_indate_label.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_indate_label.setText("11/09/2018");
        horizontal_prisoner_details_panel.add(fetch_indate_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, 20));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        horizontal_prisoner_details_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 60, -1));

        fetch_name.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_name.setText("Mayuresh N. Joshi");
        horizontal_prisoner_details_panel.add(fetch_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        add(horizontal_prisoner_details_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));

        submit_btn.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        add(submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, -1, -1));

        loadingpanel.setBackground(new java.awt.Color(255, 255, 255));
        loadingpanel.setLayout(new java.awt.BorderLayout());
        add(loadingpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 450, 335));

        change_to_convicted_btn1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        change_to_convicted_btn1.setText("Change To Convicted");
        change_to_convicted_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_to_convicted_btn1ActionPerformed(evt);
            }
        });
        add(change_to_convicted_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:
 
        String q="INSERT INTO convicted_prisoner(p_firstname,p_midname,p_lastname,p_birthdate,p_nationality,p_state,p_city,p_locality,p_occupation,p_qualification,p_indate,conviction_date,c_inperiod,c_type) SELECT p_firstname,p_midname,p_lastname,p_birthdate,p_nationality,p_state,p_city,p_locality,p_occupation,p_qualification,p_indate,CURRENT_DATE(),?,? FROM trial_prisoner WHERE t_id=?";
        PreparedStatement pstm;
        ResultSet res;
        
        try {
            pstm = con.prepareStatement(q);
            
            
              
               if(convict.simpleRdoBtn.isSelected())
                {
                    System.out.println("simplep");
                    pstm.setString(2,"simple");
                }
                if (convict.rigorousRdoBtn.isSelected()) {
                    System.out.println("rigorousp");
                    pstm.setString(2, "rigorous");
                    
                }
                int years = Integer.parseInt(convict.yearsTextfield.getText());
         int months = Integer.parseInt(convict.monthsTextfield.getText());
         int days = Integer.parseInt(convict.daysTextField.getText());
                 
       
         
        int in_period;
        in_period = ((years * 365) + (months * 30) + days);
        pstm.setInt(1, in_period);
        pstm.setString(3, c_id);
                int i = pstm.executeUpdate();
                
                 System.out.println("run");
                if(i>0){
                    JOptionPane.showMessageDialog(null, "Prisoner successfully added as convicted");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Insertion failed");
                }
     
        } catch (SQLException ex) {
            Logger.getLogger(superintendant_modify_prisoner_select_button_load_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_submit_btnActionPerformed

    private void change_to_convicted_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_to_convicted_btn1ActionPerformed
        // TODO add your handling code here:
        
        submit_btn.setVisible(true);
               convict = new Convicted_panel();
        loadingpanel.removeAll();
        loadingpanel.add(convict, BorderLayout.CENTER);
        loadingpanel.revalidate();
        loadingpanel.repaint();
        
    }//GEN-LAST:event_change_to_convicted_btn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_to_convicted_btn1;
    public javax.swing.JLabel fetch_id;
    public javax.swing.JLabel fetch_indate_label;
    public javax.swing.JLabel fetch_name;
    private javax.swing.JPanel horizontal_prisoner_details_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel loadingpanel;
    private javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables
}
