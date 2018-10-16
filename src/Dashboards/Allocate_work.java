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
import java.util.logging.Level;
import java.util.logging.Logger;
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
               
        initProgress(progress_panel,80);
        initProgress(progress_panel1, 60);
        initProgress(progress_panel2, 40);
      //  this.drawCenteredCircle(g, WIDTH, WIDTH, ERROR);

    }
    
    public Allocate_work(String c_id){
        
         initComponents();
        
        
        MyPrisonConnection o = new MyPrisonConnection();
        con = o.getMyConnection();
     
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
         
         
        String query = "SELECT u.unit_code,n.unit_name,h.head_id,ROUND(AVG(h.attendance + h.performance + h.conduct)/3) AS suggestions \n" +
"FROM feedback h,head u \n" +
"INNER JOIN unit n ON n.unit_code=u.unit_code \n" +
"WHERE h.head_id=u.head_id AND c_id=?\n" +
"GROUP BY head_id \n" +
"HAVING head_id NOT IN(SELECT DISTINCT head_id FROM feedback WHERE sdate NOT IN\n" +
"(SELECT sdate FROM feedback h,head u INNER JOIN unit n ON n.unit_code=u.unit_code\n" +
"WHERE h.head_id=u.head_id AND sdate + INTERVAL (SELECT feedback_end(h.c_id,h.head_id,h.sdate)) DAY < CURRENT_DATE() - INTERVAL 15 DAY )) \n" +
"AND head_id IN(SELECT head_id FROM head WHERE unit_code NOT IN(SELECT unit_code FROM works_for WHERE c_id=?))\n" +
"ORDER BY suggestions DESC limit 3;"; 
        
        
        
        int suggest=0;
       // String unitname;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, c_ide);
            pst.setString(2, c_ide);
            ResultSet rs = pst.executeQuery();
        if(!rs.next())
        {
            return;
        }
            suggest  =  rs.getInt("suggestions");
           String unitname = rs.getString("unit_name");
           suggestion1.setText(unitname);
         initProgress(progress_panel,suggest);
         
         
         
         rs.next();
           suggest  =  rs.getInt("suggestions");
            unitname = rs.getString("unit_name");
             suggestion2.setText(unitname);
        initProgress(progress_panel1, suggest);
        
         rs.next();
           suggest  =  rs.getInt("suggestions");
            unitname = rs.getString("unit_name");
            suggestion3.setText(unitname);
        initProgress(progress_panel2, suggest);
        
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_work.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   
    private void initProgress(javax.swing.JPanel objPanel,int max){
    
        
        ProgressPanel jpProgress = new ProgressPanel();
        objPanel.removeAll();
        objPanel.add(jpProgress,BorderLayout.CENTER);
        objPanel.revalidate();
        objPanel.repaint();
        drawProgress(jpProgress,max);
    }
    private void drawProgress(ProgressPanel objPanel ,int max){
     
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= max; i++) {
                    try {
                        objPanel.updateProgress(i);
                        objPanel.repaint();
                        Thread.sleep(10);
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
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

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
        select_unit_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Carpentry", "Cooking", "Smithy", "Cleaning", "Tailoring" }));
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
        add(load_unit_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 440, 220));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jButton1.setText("Allocate");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, -1, -1));

        progress_panel3.setBackground(new java.awt.Color(255, 255, 255));
        progress_panel3.setLayout(new java.awt.BorderLayout());
        add(progress_panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 150, 110));

        jScrollPane2.setBorder(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Schedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel18.setText("to");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel20.setText("16:00");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel22.setText("17:00");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel25.setText("Cooking");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 40));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 40));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel28.setText("to");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel29.setText("08:30");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel30.setText("09:30");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel26.setText("Cleaning");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 40));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 40));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel23.setText("to");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel24.setText("10:30");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel27.setText("11:30");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel31.setText("Tailoring");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 40));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 40));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel32.setText("to");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel33.setText("14:00");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel34.setText("16:00");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel35.setText("Masonry");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 40));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 40));

        jScrollPane2.setViewportView(jPanel5);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 400, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void select_unit_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_unit_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_unit_comboActionPerformed

    private void select_unit_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_select_unit_comboItemStateChanged
        // TODO add your handling code here:
        load_unit_panel.removeAll();
        load_unit_panel.add(new Allocation_details_panel(), BorderLayout.CENTER);
        load_unit_panel.revalidate();
        load_unit_panel.repaint();
        jButton1.setEnabled(true);
    }//GEN-LAST:event_select_unit_comboItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel load_unit_panel;
    private javax.swing.JPanel progress_panel;
    private javax.swing.JPanel progress_panel1;
    private javax.swing.JPanel progress_panel2;
    private javax.swing.JPanel progress_panel3;
    private javax.swing.JComboBox<String> select_unit_combo;
    private javax.swing.JLabel suggestion1;
    private javax.swing.JLabel suggestion2;
    private javax.swing.JLabel suggestion3;
    // End of variables declaration//GEN-END:variables
}
