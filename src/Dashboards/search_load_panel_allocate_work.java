/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author 702
 */
public class search_load_panel_allocate_work extends javax.swing.JPanel {

    /**
     * Creates new form search_load_panel_allocate_work
     */
    private Allocate_work work;
    private JPanel loading_panel;
    String p_id;
    public search_load_panel_allocate_work(String c_id,JPanel ref) {
        initComponents();
        p_id = c_id;
        loading_panel = ref;
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
        select_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(750, 34));
        setMinimumSize(new java.awt.Dimension(750, 34));
        setPreferredSize(new java.awt.Dimension(750, 34));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
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
        add(fetch_id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 8, -1, -1));

        fetch_name_label.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        fetch_name_label.setText("Name");
        add(fetch_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        select_btn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        select_btn.setText("Select");
        select_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_btnActionPerformed(evt);
            }
        });
        add(select_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 5, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        this.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.setBackground(Color.WHITE);
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void select_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_btnActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
                
        work = new Allocate_work(fetch_id_label.getText());
        loading_panel.removeAll();
        loading_panel.add(work, BorderLayout.CENTER);
        loading_panel.revalidate();
        loading_panel.repaint();
    }//GEN-LAST:event_select_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel fetch_id_label;
    public javax.swing.JLabel fetch_name_label;
    private javax.swing.JButton select_btn;
    // End of variables declaration//GEN-END:variables
}
