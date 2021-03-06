/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import databaseConnectivity.MyPrisonConnection;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//import progressbardemo.ProgressBar;

/**
 *
 * @author Aakash Gadhave
 */
public class Allocate_work extends javax.swing.JPanel {

    /**
     * Creates new form Allocate_work
     */
    
    private Allocate_Work_search aw;
    
    Connection con;
           
    private String c_ide;
    String p_name,p_occupation,p_qualification,p_type;
    public Allocate_work() {
        initComponents();
               
     //   initProgress(progress_panel,80);
       // initProgress(progress_panel1, 60);
       // initProgress(progress_panel2, 40);
      //  this.drawCenteredCircle(g, WIDTH, WIDTH, ERROR);

    }
    
    void initSelectUnitCombo()
    {
        try {
            PreparedStatement lps=con.prepareStatement("SELECT unit_name FROM unit");
            ResultSet lrs = lps.executeQuery();
            DefaultComboBoxModel select_unit_combo_model=(DefaultComboBoxModel) select_unit_combo.getModel();
            while(lrs.next())
            {
                select_unit_combo_model.addElement(lrs.getString("unit_name"));
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_work.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Allocate_work(String c_id){
        
         initComponents();
        
        MyPrisonConnection o = new MyPrisonConnection();
        con = o.getMyConnection();
        initSelectUnitCombo();
          c_ide = c_id;
        PreparedStatement pst1;
        ResultSet rs1;
        String query1 = "SELECT p_firstname,p_midname,p_lastname,p_occupation,p_qualification,c_type FROM convicted_prisoner WHERE c_id = ?";
        try { 
            pst1 = con.prepareStatement(query1);
            pst1.setString(1, c_ide);
            rs1 = pst1.executeQuery();
            
            while(rs1.next())
            {
            String fir_nm = rs1.getString("p_firstname");
            String mid_nm = rs1.getString("p_midname");
            String las_nm = rs1.getString("p_lastname");
            
            String occ = rs1.getString("p_occupation");
            String qua = rs1.getString("p_qualification");
            String type1 = rs1.getString("c_type");
            fetch_id.setText(c_ide);
            fetch_name.setText(fir_nm+" "+mid_nm+" "+las_nm);
            fetch_occupation.setText(occ);
            fetch_qualification.setText(qua);
            fetch_type.setText(type1);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_work.class.getName()).log(Level.SEVERE, null, ex);
        }
      
         
       /*  p_name = name;
         p_occupation = occupation;
         p_qualification = qualification;
         p_type = type;
         
         fetch_name.setText(p_name);
         fetch_occupation.setText(p_occupation);
         fetch_qualification.setText(p_qualification);
         fetch_type.setText(p_type);*/
         
         
        String query = "CALL suggestion(?)";

        
        
        int suggest=0;
       // String unitname;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, c_ide);
            ResultSet rs = pst.executeQuery();
        if(!rs.next())
        {
            return;
        }
            suggest  =  rs.getInt("suggestions");
           String unitname = rs.getString("unit_name");
           suggestion1.setText(unitname);
         initProgress(progress_panel,suggest);
         
         
         
         if(!rs.next())
         {
             return;
         }
           suggest  =  rs.getInt("suggestions");
            unitname = rs.getString("unit_name");
             suggestion2.setText(unitname);
        initProgress(progress_panel1, suggest);
        
         if(!rs.next())
         {
             return;
         }
           suggest  =  rs.getInt("suggestions");
            unitname = rs.getString("unit_name");
            suggestion3.setText(unitname);
        initProgress(progress_panel2, suggest);
        
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_work.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   
    public void initProgress(javax.swing.JPanel objPanel,int max){
    
        
        ProgressPanel jpProgress = new ProgressPanel();
        objPanel.removeAll();
        objPanel.add(jpProgress,BorderLayout.CENTER);
        objPanel.revalidate();
        objPanel.repaint();
        drawProgress(jpProgress,max);
    }
    public void drawProgress(ProgressPanel objPanel ,int max){
     
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= max; i++) {
                    try {
                        objPanel.updateProgress(i);
                        objPanel.repaint();
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        System.out.println("Exception");
                    }
                    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }

        }).start();

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
        fetch_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fetch_name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fetch_type = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fetch_occupation = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fetch_qualification = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        suggestion3 = new javax.swing.JLabel();
        suggestion1 = new javax.swing.JLabel();
        suggestion2 = new javax.swing.JLabel();
        progress_panel = new javax.swing.JPanel();
        progress_panel2 = new javax.swing.JPanel();
        progress_panel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        select_unit_combo = new javax.swing.JComboBox<>();
        load_unit_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        progress_panel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        schedule_p = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        schedule_loadpanel = new javax.swing.JPanel();
        panel_text = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        check_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel1.setText("Prisoner ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        fetch_id.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_id.setText("C001");
        jPanel1.add(fetch_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 60, -1));

        fetch_name.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_name.setText("Mayuresh N. Joshi");
        jPanel1.add(fetch_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 460, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel6.setText("Type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 10, 50, 20));

        fetch_type.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_type.setText("Rigorous");
        jPanel1.add(fetch_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel7.setText("Skills");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        fetch_occupation.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_occupation.setText("Unemployed");
        jPanel2.add(fetch_occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 200, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel9.setText("Occupation");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel10.setText("Qualification");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        fetch_qualification.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_qualification.setText("Graduate");
        jPanel2.add(fetch_qualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 200, -1));

        jScrollPane1.setBorder(null);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel12.setText("Carpentry");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 22));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel13.setText("Smithy");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 140, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel14.setText("Cooking");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 140, -1));

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, 70));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 200));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Suggestions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 24))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        suggestion3.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        suggestion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(suggestion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 110, -1));

        suggestion1.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        suggestion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(suggestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        suggestion2.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        suggestion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(suggestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 110, -1));

        progress_panel.setBackground(new java.awt.Color(255, 255, 255));
        progress_panel.setLayout(new java.awt.BorderLayout());
        jPanel4.add(progress_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 110));

        progress_panel2.setBackground(new java.awt.Color(255, 255, 255));
        progress_panel2.setLayout(new java.awt.BorderLayout());
        jPanel4.add(progress_panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 150, 110));

        progress_panel1.setBackground(new java.awt.Color(255, 255, 255));
        progress_panel1.setLayout(new java.awt.BorderLayout());
        jPanel4.add(progress_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 150, 110));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 550, 180));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel21.setText("Select Unit");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, 32));

        select_unit_combo.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        select_unit_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                select_unit_comboItemStateChanged(evt);
            }
        });
        select_unit_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_unit_comboActionPerformed(evt);
            }
        });
        add(select_unit_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 140, 32));

        load_unit_panel.setBackground(new java.awt.Color(255, 255, 255));
        load_unit_panel.setLayout(new java.awt.BorderLayout());
        add(load_unit_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 440, 210));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jButton1.setText("Allocate");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, -1, -1));

        progress_panel3.setBackground(new java.awt.Color(255, 255, 255));
        progress_panel3.setLayout(new java.awt.BorderLayout());
        add(progress_panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 150, 110));

        jScrollPane2.setBorder(null);

        schedule_p.setBackground(new java.awt.Color(255, 255, 255));
        schedule_p.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Schedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 24))); // NOI18N
        schedule_p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(null);

        schedule_loadpanel.setBackground(new java.awt.Color(255, 255, 255));
        schedule_loadpanel.setLayout(new javax.swing.BoxLayout(schedule_loadpanel, javax.swing.BoxLayout.Y_AXIS));

        panel_text.setBackground(new java.awt.Color(255, 255, 255));
        panel_text.setMaximumSize(new java.awt.Dimension(0, 0));
        panel_text.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        schedule_loadpanel.add(panel_text);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel18.setText("to");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 45, -1, -1));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel20.setText("16:00");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 45, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel22.setText("10:00");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel25.setText("Carpentry");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, 40));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel23.setText("08:30");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel24.setText("14:00");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel26.setText("Cleaning");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 40));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel19.setText("to");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel27.setText("17:00");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel28.setText("to");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 30));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel29.setText("18:00");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 30));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel30.setText("Smithy");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 75, -1, 40));

        schedule_loadpanel.add(jPanel6);

        jScrollPane3.setViewportView(schedule_loadpanel);

        schedule_p.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, 150));

        jScrollPane2.setViewportView(schedule_p);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 390, 200));

        check_btn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        check_btn.setText("Check");
        check_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_btnActionPerformed(evt);
            }
        });
        add(check_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void select_unit_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_unit_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_unit_comboActionPerformed

    private void select_unit_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_select_unit_comboItemStateChanged
        // TODO add your handling code here:
        /*
        String selected_unit=(String)select_unit_combo.getSelectedItem();
        try {
            PreparedStatement lps=con.prepareStatement("CALL unit_allocation_checker(?,?);");
            lps.setString(1, selected_unit);
            lps.setString(2, c_ide);
            ResultSet lrs = lps.executeQuery();
            lrs.next();
            
            String isAllowed=lrs.getString("Allowed");
            String reason=lrs.getString("reason");
            
            if(isAllowed.equalsIgnoreCase("0"))
            {
                JOptionPane.showMessageDialog(this, reason);
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_work.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jButton1.setEnabled(true);
        load_unit_panel.removeAll();
        load_unit_panel.add(new Allocation_details_panel(), BorderLayout.CENTER);
        load_unit_panel.revalidate();
        load_unit_panel.repaint();*/
       
    }//GEN-LAST:event_select_unit_comboItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            PreparedStatement lps1=con.prepareStatement("SELECT unit_code FROM unit WHERE unit_name=?;");
            lps1.setString(1, ""+select_unit_combo.getSelectedItem());
            ResultSet lrs1=lps1.executeQuery();
            lrs1.next();
            PreparedStatement lps =con.prepareStatement("INSERT INTO works_for VALUES (?,?, CURRENT_DATE()+ INTERVAL 1 DAY,90);");
            lps.setString(1, c_ide);
            lps.setString(2, lrs1.getString(1));
            
            if(lps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "Prisoner Successfully Allocated.");
                jButton1.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Problem encountered in allocation.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_work.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void check_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_btnActionPerformed
        // TODO add your handling code here:
        String selected_unit=(String)select_unit_combo.getSelectedItem();
        try {
            PreparedStatement lps=con.prepareStatement("CALL unit_allocation_checker(?,?);");
            lps.setString(1, selected_unit);
            lps.setString(2, c_ide);
            ResultSet lrs = lps.executeQuery();
            lrs.next();
            
            String isAllowed=lrs.getString("Allowed");
            String reason=lrs.getString("reason");
            
            if(isAllowed.equalsIgnoreCase("0"))
            {
                JOptionPane.showMessageDialog(this, reason);
                jButton1.setEnabled(false);
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_work.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jButton1.setEnabled(true);
    }//GEN-LAST:event_check_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check_btn;
    public javax.swing.JLabel fetch_id;
    public javax.swing.JLabel fetch_name;
    public javax.swing.JLabel fetch_occupation;
    public javax.swing.JLabel fetch_qualification;
    public javax.swing.JLabel fetch_type;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel load_unit_panel;
    private javax.swing.JPanel panel_text;
    public javax.swing.JPanel progress_panel;
    public javax.swing.JPanel progress_panel1;
    public javax.swing.JPanel progress_panel2;
    private javax.swing.JPanel progress_panel3;
    public javax.swing.JPanel schedule_loadpanel;
    public javax.swing.JPanel schedule_p;
    private javax.swing.JComboBox<String> select_unit_combo;
    public javax.swing.JLabel suggestion1;
    public javax.swing.JLabel suggestion2;
    public javax.swing.JLabel suggestion3;
    // End of variables declaration//GEN-END:variables
}
