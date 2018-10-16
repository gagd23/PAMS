/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import databaseConnectivity.MyPrisonConnection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Aakash
 */
public class superintendant_view_prisoner extends javax.swing.JPanel {

    /**
     * Creates new form superintendant_view_prisoner
     */
    JPanel parentPanel;
    superintendant_view_prison_history_panel view;
    prisoner_work_details work;
    String p_id ;
    Connection con;
    String first_name,mid_name,last_name,fullname,type;
    String conviction_date; 
    int days_to_release;
    public superintendant_view_prisoner(JPanel p,String c_id) {
        initComponents();
        
         MyPrisonConnection o = new MyPrisonConnection();
             con = o.getMyConnection();
        parentPanel = p;
        p_id = c_id;
        
        System.out.println(p_id);
        
        PreparedStatement pst;
       
        
        String query = "SELECT p_firstname,p_midname,p_lastname,c_type,DATE_FORMAT(conviction_date,'%d/%m/%y') AS conviction_date,DATEDIFF(releasedate(c_id),CURRENT_DATE())AS days_to_release FROM convicted_prisoner WHERE c_id LIKE ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, p_id);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
             first_name = rs.getString("p_firstname");
             mid_name = rs.getString("p_midname");
             last_name = rs.getString("p_lastname");
             type = rs.getString("c_type");
             conviction_date = rs.getString("conviction_date");
             days_to_release = rs.getInt("days_to_release");
            fullname=first_name+" "+mid_name+" "+last_name;
            fetch_id.setText(p_id);
            fetch_name.setText(fullname);
            fetch_type.setText(type);
            
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(superintendant_view_prisoner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        view_prison_history_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        view_prison_details_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        view_schedule_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        horizontal_prisoner_details_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        fetch_id = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fetch_name = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fetch_type = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view_prison_history_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_prison_history_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                view_prison_history_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                view_prison_history_panelMouseExited(evt);
            }
        });
        view_prison_history_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/history-clock-button.png"))); // NOI18N
        view_prison_history_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 130, 130));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel2.setText("History");
        view_prison_history_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 80, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("View  Prison");
        view_prison_history_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 40));

        add(view_prison_history_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 270, 310));

        view_prison_details_panel.setForeground(new java.awt.Color(240, 240, 240));
        view_prison_details_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                view_prison_details_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                view_prison_details_panelMouseExited(evt);
            }
        });
        view_prison_details_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon (1).png"))); // NOI18N
        view_prison_details_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 140, 140));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel5.setText("Details");
        view_prison_details_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 70, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel6.setText("View  Personal");
        view_prison_details_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, 40));

        add(view_prison_details_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 270, 310));

        view_schedule_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                view_schedule_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                view_schedule_panelMouseExited(evt);
            }
        });
        view_schedule_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/timetable.png"))); // NOI18N
        view_schedule_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 140, 130));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel9.setText("View  Schedule");
        view_schedule_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 160, 40));

        add(view_schedule_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 270, 310));

        horizontal_prisoner_details_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Prisoner ID");
        horizontal_prisoner_details_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        fetch_id.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_id.setText("C001");
        horizontal_prisoner_details_panel.add(fetch_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setText("Name");
        horizontal_prisoner_details_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 60, -1));

        fetch_name.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_name.setText("Mayuresh N. Joshi");
        horizontal_prisoner_details_panel.add(fetch_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setText("Type");
        horizontal_prisoner_details_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        fetch_type.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_type.setText("Rigorous");
        horizontal_prisoner_details_panel.add(fetch_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, 20));

        add(horizontal_prisoner_details_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void view_prison_details_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_prison_details_panelMouseEntered
        // TODO add your handling code here:
        view_prison_details_panel.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_view_prison_details_panelMouseEntered

    private void view_prison_details_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_prison_details_panelMouseExited
        // TODO add your handling code here:
        view_prison_details_panel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_view_prison_details_panelMouseExited

    private void view_schedule_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_schedule_panelMouseEntered
        // TODO add your handling code here:
         view_schedule_panel.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_view_schedule_panelMouseEntered

    private void view_schedule_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_schedule_panelMouseExited
        // TODO add your handling code here:
         view_schedule_panel.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_view_schedule_panelMouseExited

    private void view_prison_history_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_prison_history_panelMouseEntered
        // TODO add your handling code here:
        view_prison_history_panel.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_view_prison_history_panelMouseEntered

    private void view_prison_history_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_prison_history_panelMouseExited
        // TODO add your handling code here:
         view_prison_history_panel.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_view_prison_history_panelMouseExited

    private void view_prison_history_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_prison_history_panelMouseClicked
        // TODO add your handling code here:
        parentPanel.removeAll();
        view = new superintendant_view_prison_history_panel(view, p_id,fullname,type,conviction_date,days_to_release);
        parentPanel.add(view, BorderLayout.CENTER);
        parentPanel.revalidate();
        parentPanel.repaint();
        
        
       
       
       String query = "SELECT f.c_id,u.unit_name,ROUND(AVG(f.attendance)) AS attendance,ROUND(AVG(f.performance)) AS performance,ROUND(AVG(f.conduct)) AS CONDUCT,count(f.head_id) AS count\n" +
"FROM feedback f \n" +
"INNER JOIN head h ON f.head_id=h.head_id\n" +
"INNER JOIN unit u ON u.unit_code=h.unit_code \n" +
"WHERE c_id=?\n" +
"GROUP BY f.head_id\n" +
"ORDER BY count DESC;";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, p_id);
          
            ResultSet rs = pst.executeQuery();
        while(rs.next()){
       
             work = new prisoner_work_details(p_id);
        view.loading_history_panel.add(work);
        view.loading_history_panel.revalidate();
        view.loading_history_panel.repaint();
            
           String unitname = rs.getString("unit_name");
           int count = rs.getInt("count");
           int performance = rs.getInt("performance");
           int attendance  = rs.getInt("attendance");
           int conduct = rs.getInt("conduct");
           
         work.initProgress(work.performance_load_panel1, performance);
         work.initProgress(work.attendance_load_panel1,attendance);
         work.initProgress(work.conduct_load_panel1,conduct);
         
         work.fetch_unit_name_label1.setText(unitname);
         work.fetch_no_of_times_worked_label1.setText(""+count);
         
           
          //  unitname = rs.getString("unit_name");     
      //  initProgress(attendance_load_panel1, suggest);
        
         
         //  suggest  =  rs.getInt("suggestions");
           // unitname = rs.getString("unit_name");
          // initProgress(conduct_load_panel1, suggest);
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_work.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
       
        
        
    }//GEN-LAST:event_view_prison_history_panelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel fetch_id;
    public javax.swing.JLabel fetch_name;
    public javax.swing.JLabel fetch_type;
    private javax.swing.JPanel horizontal_prisoner_details_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel view_prison_details_panel;
    private javax.swing.JPanel view_prison_history_panel;
    private javax.swing.JPanel view_schedule_panel;
    // End of variables declaration//GEN-END:variables
}
