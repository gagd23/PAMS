/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import java.awt.BorderLayout;

/**
 *
 * @author 702
 */
public class know_more_panel extends javax.swing.JPanel {

    /**
     * Creates new form know_more_panel
     */
    
    String unit_name,s_date;
    int no_of_days;
    public know_more_panel(String u_name,String date,int days) {
        initComponents();
       unit_name = u_name;
       s_date = date;
       no_of_days = days;
       
       fetch_unit_name_label.setText(unit_name);
       fetch_from_date_label.setText(s_date);
       fetch_no_of_days_worked_label.setText(""+no_of_days);
       
    /**
     *
     * @param objPanel
     * @param max
     */
    
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

        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        fetch_from_date_label = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fetch_unit_name_label = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        conduct_load_panel1 = new javax.swing.JPanel();
        performance_load_panel1 = new javax.swing.JPanel();
        attendance_load_panel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        fetch_no_of_days_worked_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1120, 160));
        setMinimumSize(new java.awt.Dimension(1120, 160));
        setPreferredSize(new java.awt.Dimension(1120, 160));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(1120, 160));
        jPanel3.setMinimumSize(new java.awt.Dimension(1120, 160));
        jPanel3.setPreferredSize(new java.awt.Dimension(1120, 160));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("No Of Days Worked");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, -1));

        fetch_from_date_label.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        fetch_from_date_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fetch_from_date_label.setText("11-12-2018");
        jPanel3.add(fetch_from_date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Conduct");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        fetch_unit_name_label.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        fetch_unit_name_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fetch_unit_name_label.setText("Carpentry");
        jPanel3.add(fetch_unit_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Unit");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, -1));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Performance");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Attendance");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        conduct_load_panel1.setBackground(new java.awt.Color(255, 255, 255));
        conduct_load_panel1.setLayout(new java.awt.BorderLayout());
        jPanel3.add(conduct_load_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 120, 100));

        performance_load_panel1.setBackground(new java.awt.Color(255, 255, 255));
        performance_load_panel1.setLayout(new java.awt.BorderLayout());
        jPanel3.add(performance_load_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 120, 100));

        attendance_load_panel1.setBackground(new java.awt.Color(255, 255, 255));
        attendance_load_panel1.setLayout(new java.awt.BorderLayout());
        jPanel3.add(attendance_load_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 120, 100));

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("From");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, -1));

        fetch_no_of_days_worked_label.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        fetch_no_of_days_worked_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fetch_no_of_days_worked_label.setText("3");
        jPanel3.add(fetch_no_of_days_worked_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 160));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel attendance_load_panel1;
    public javax.swing.JPanel conduct_load_panel1;
    public javax.swing.JLabel fetch_from_date_label;
    public javax.swing.JLabel fetch_no_of_days_worked_label;
    public javax.swing.JLabel fetch_unit_name_label;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel performance_load_panel1;
    // End of variables declaration//GEN-END:variables
}
