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

/**
 *
 * @author Aakash Gadhave
 */

public class add_Requirement extends javax.swing.JPanel {

    /**
     * Creates new form add_Requirement
     */
        head_dash href;
        Connection con = null;
        String current_id;
        private slot_panel slot;
        String unit;
        String duration;
    public add_Requirement(String head_id) {
        initComponents();
        current_id=head_id;
     
             MyPrisonConnection o = new MyPrisonConnection();
             con = o.getMyConnection();
    }
    
    public  void setUnitLabel(String lbl)
    {
        unit_name_label.setText(lbl);
    }
    
    private requirement_panel rp;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unit_details_display = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unit_name_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        working_hrs_load_panel = new javax.swing.JPanel();
        new_requirement_panel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requirement_name_textbox = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        days_txtfld = new javax.swing.JTextField();
        minimum_no_prisoners_txtbox = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        months_txtfld = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        load_slot_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        active_requirement_panel = new javax.swing.JPanel();
        panel_text = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_details_display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Unit");
        unit_details_display.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        unit_name_label.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        unit_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unit_name_label.setText("Manufacturing");
        unit_name_label.setOpaque(true);
        unit_details_display.add(unit_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 170, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Working Hours");
        unit_details_display.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 30));

        jScrollPane3.setBorder(null);

        working_hrs_load_panel.setLayout(new javax.swing.BoxLayout(working_hrs_load_panel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(working_hrs_load_panel);

        unit_details_display.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 180, 70));

        add(unit_details_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 160));

        new_requirement_panel.setBackground(new java.awt.Color(255, 255, 255));
        new_requirement_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "New Requirement Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 24))); // NOI18N
        new_requirement_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel15.setText("Requirement Name");
        new_requirement_panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        requirement_name_textbox.setColumns(20);
        requirement_name_textbox.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        requirement_name_textbox.setRows(5);
        jScrollPane1.setViewportView(requirement_name_textbox);

        new_requirement_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 200, 80));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel16.setText("Minimum No Of Prisoners");
        new_requirement_panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, -1));

        days_txtfld.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        days_txtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                days_txtfldActionPerformed(evt);
            }
        });
        new_requirement_panel.add(days_txtfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 40, 30));

        minimum_no_prisoners_txtbox.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        minimum_no_prisoners_txtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimum_no_prisoners_txtboxActionPerformed(evt);
            }
        });
        new_requirement_panel.add(minimum_no_prisoners_txtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 60, 30));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel18.setText("Days");
        new_requirement_panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, -1));

        checkButton.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });
        new_requirement_panel.add(checkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 100, -1));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel21.setText("Requirement Duration");
        new_requirement_panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        months_txtfld.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        months_txtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                months_txtfldActionPerformed(evt);
            }
        });
        new_requirement_panel.add(months_txtfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 40, 30));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel22.setText("Months");
        new_requirement_panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));

        add(new_requirement_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1090, 290));

        load_slot_panel.setBackground(new java.awt.Color(255, 255, 255));
        load_slot_panel.setLayout(new java.awt.BorderLayout());
        add(load_slot_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 520, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Active Requirements", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        active_requirement_panel.setBackground(new java.awt.Color(255, 255, 255));
        active_requirement_panel.setLayout(new javax.swing.BoxLayout(active_requirement_panel, javax.swing.BoxLayout.Y_AXIS));

        panel_text.setBackground(new java.awt.Color(255, 255, 255));
        panel_text.setMaximumSize(new java.awt.Dimension(0, 0));
        panel_text.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        active_requirement_panel.add(panel_text);

        jScrollPane2.setViewportView(active_requirement_panel);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 670, 130));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel13.setText("Ends On");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel12.setText("Work Time");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 680, 200));

        add_btn.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void days_txtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_days_txtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_days_txtfldActionPerformed

    private void minimum_no_prisoners_txtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimum_no_prisoners_txtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimum_no_prisoners_txtboxActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here
     /*   load_slot_panel.removeAll();
        load_slot_panel.add(new slot_panel(), BorderLayout.CENTER);
        load_slot_panel.revalidate();
        load_slot_panel.repaint();
*/
        
        String qu = "SELECT unit_code,workstart_time,workend_time FROM work_hrs WHERE unit_code=(SELECT unit_code FROM head WHERE head_id=?)";
        PreparedStatement pst,pst1,pstm;
        ResultSet rs,resq;
        try {
            pst = con.prepareStatement(qu);
            System.out.println(current_id);
            pst.setString(1,current_id);
            rs = pst.executeQuery();
            while(rs.next()){
             unit = rs.getString("unit_code");
            String start_time = rs.getString("workstart_time");
            String end_time = rs.getString("workend_time");
             
                 System.out.println(unit);
                 System.out.println(start_time);
                 System.out.println(end_time);
                String query = "CALL slot_find('"+unit+"','"+start_time+"','"+end_time+"')";
                pst1 = con.prepareStatement(query);
                
                pst1.execute();
                //{
                //   JOptionPane.showMessageDialog(null, "procedure executing");
                //}
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(add_Requirement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String qw = "CALL gettime(?,?)";
            try {
                pstm = con.prepareStatement(qw);
                pstm.setString(1, current_id);
                pstm.setString(2, minimum_no_prisoners_txtbox.getText());
                resq = pstm.executeQuery();
                
                String start_time,end_time;
                
                if(!resq.next())
                {
                    JOptionPane.showMessageDialog(null, "No Slot Available For Adding a Requirement");
                    
                }
                
                else 
                {
                    
                      start_time = resq.getString("fstart_time");
                    end_time = resq.getString("fend_time");
                    String unit_code = resq.getString("unit_code");
                     duration = resq.getString("duration");
                
                     System.out.println(duration);
                    slot = new slot_panel(unit_code,duration);
                    load_slot_panel.removeAll();
                    load_slot_panel.add(slot, BorderLayout.CENTER);
                    load_slot_panel.revalidate();
                    load_slot_panel.repaint();
                    
                  
                    slot.fetch_start_time_label.setText(start_time);
                    slot.fetch_endtime_label.setText(end_time);
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(add_Requirement.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_checkButtonActionPerformed

    private void months_txtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_months_txtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_months_txtfldActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        
        String q = "INSERT INTO requirements(req_name,unit_code,rmin_capacity,rstart_date,r_period,rstart_time,r_duration) VALUES(?,?,?,CURRENT_DATE(),?,?,?)";
        PreparedStatement pst;
        ResultSet res;
        
        int months = Integer.parseInt(months_txtfld.getText());
        int days = Integer.parseInt(days_txtfld.getText());
        
        int final_days = 30 * months + days;
            try {
                pst = con.prepareStatement(q);
                pst.setString(1, requirement_name_textbox.getText());
                pst.setString(2, unit);
                pst.setString(3, minimum_no_prisoners_txtbox.getText());
                pst.setInt(4, final_days);
                pst.setString(5, slot.fetch_start_time_label.getText());
                pst.setString(6, duration);
                
                int i = pst.executeUpdate();
                
                if(i>0){
                    JOptionPane.showMessageDialog(null, "Requirement is added successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Requirement addition failure");
                }
            } catch (SQLException ex) {
                Logger.getLogger(add_Requirement.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_add_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel active_requirement_panel;
    private javax.swing.JButton add_btn;
    private javax.swing.JButton checkButton;
    public javax.swing.JTextField days_txtfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel load_slot_panel;
    public javax.swing.JTextField minimum_no_prisoners_txtbox;
    public javax.swing.JTextField months_txtfld;
    public javax.swing.JPanel new_requirement_panel;
    private javax.swing.JPanel panel_text;
    public javax.swing.JTextArea requirement_name_textbox;
    public javax.swing.JPanel unit_details_display;
    public javax.swing.JLabel unit_name_label;
    public javax.swing.JPanel working_hrs_load_panel;
    // End of variables declaration//GEN-END:variables
}
