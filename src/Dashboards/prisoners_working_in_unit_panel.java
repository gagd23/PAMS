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
import java.awt.Color;
public class prisoners_working_in_unit_panel extends javax.swing.JPanel {

    /**
     * Creates new form prisoners_working_in_unit_panel
     */
    public prisoners_working_in_unit_panel() {
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

        fetch_id_label = new javax.swing.JLabel();
        fetch_name_label = new javax.swing.JLabel();
        fetch_end_date_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(789, 32));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fetch_id_label.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_id_label.setText("ID");
        add(fetch_id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        fetch_name_label.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fetch_name_label.setText("Name");
        add(fetch_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        fetch_end_date_label.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_end_date_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fetch_end_date_label.setText("End Date");
        add(fetch_end_date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        this.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.setBackground(Color.WHITE);
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel fetch_end_date_label;
    public javax.swing.JLabel fetch_id_label;
    public javax.swing.JLabel fetch_name_label;
    // End of variables declaration//GEN-END:variables
}
