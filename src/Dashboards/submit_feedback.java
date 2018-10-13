/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

/**
 *
 * @author Aakash
 */
public class submit_feedback extends javax.swing.JPanel {

    /**
     * Creates new form submit_feedback
     */
    public submit_feedback() {
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

        submit_feedback_panel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        conduct_combobox = new javax.swing.JComboBox<>();
        performance_combobox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        submit_feedback_button = new javax.swing.JButton();
        show_prisoner_details_panel = new javax.swing.JPanel();
        fetch_start_date_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fetch_no_of_days_worked_label = new javax.swing.JLabel();
        fetch_attendance_label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fetch_no_of_days_present_label = new javax.swing.JLabel();
        horizontal_prisoner_details_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fetch_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fetch_name = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fetch_type = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit_feedback_panel.setBackground(new java.awt.Color(255, 255, 255));
        submit_feedback_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Submit Feedback", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 24))); // NOI18N
        submit_feedback_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Conduct");
        submit_feedback_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Rate Prisoner Out Of 5");
        submit_feedback_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 230, 30));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Instruction");
        submit_feedback_panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 30));

        conduct_combobox.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        conduct_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Select", "      0", "      1", "      2", "      3", "      4", "      5" }));
        conduct_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conduct_comboboxActionPerformed(evt);
            }
        });
        submit_feedback_panel.add(conduct_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 90, 30));

        performance_combobox.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        performance_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Select", "      0", "      1", "      2", "      3", "      4", "      5" }));
        submit_feedback_panel.add(performance_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 90, 30));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Performance");
        submit_feedback_panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        submit_feedback_button.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        submit_feedback_button.setText("Submit");
        submit_feedback_panel.add(submit_feedback_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 120, 40));

        add(submit_feedback_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 500, 310));

        show_prisoner_details_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fetch_start_date_label.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        fetch_start_date_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fetch_start_date_label.setText("11-12-2018");
        show_prisoner_details_panel.add(fetch_start_date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 160, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Start Date");
        show_prisoner_details_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Attendance");
        show_prisoner_details_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Total Days Worked");
        show_prisoner_details_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, -1));

        fetch_no_of_days_worked_label.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        fetch_no_of_days_worked_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fetch_no_of_days_worked_label.setText("50");
        show_prisoner_details_panel.add(fetch_no_of_days_worked_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 60, 30));

        fetch_attendance_label.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        fetch_attendance_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fetch_attendance_label.setText("45");
        show_prisoner_details_panel.add(fetch_attendance_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 60, 30));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Total Days Present");
        show_prisoner_details_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, -1));

        fetch_no_of_days_present_label.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        fetch_no_of_days_present_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fetch_no_of_days_present_label.setText("45");
        show_prisoner_details_panel.add(fetch_no_of_days_present_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 60, 30));

        add(show_prisoner_details_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 240));

        horizontal_prisoner_details_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel1.setText("Prisoner ID");
        horizontal_prisoner_details_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        fetch_id.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_id.setText("C001");
        horizontal_prisoner_details_panel.add(fetch_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel3.setText("Name");
        horizontal_prisoner_details_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 60, -1));

        fetch_name.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_name.setText("Mayuresh N. Joshi");
        horizontal_prisoner_details_panel.add(fetch_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 390, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel8.setText("Type");
        horizontal_prisoner_details_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 50, 20));

        fetch_type.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_type.setText("Rigorous");
        horizontal_prisoner_details_panel.add(fetch_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 20));

        add(horizontal_prisoner_details_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void conduct_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conduct_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conduct_comboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> conduct_combobox;
    private javax.swing.JLabel fetch_attendance_label;
    public javax.swing.JLabel fetch_id;
    public javax.swing.JLabel fetch_name;
    private javax.swing.JLabel fetch_no_of_days_present_label;
    private javax.swing.JLabel fetch_no_of_days_worked_label;
    private javax.swing.JLabel fetch_start_date_label;
    public javax.swing.JLabel fetch_type;
    private javax.swing.JPanel horizontal_prisoner_details_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> performance_combobox;
    private javax.swing.JPanel show_prisoner_details_panel;
    private javax.swing.JButton submit_feedback_button;
    private javax.swing.JPanel submit_feedback_panel;
    // End of variables declaration//GEN-END:variables
}
