/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import java.awt.Color;

/**
 *
 * @author Aakash Gadhave
 */
public class requirement_panel extends javax.swing.JPanel {

    /**
     * Creates new form requirement_panel
     */
    public requirement_panel() {
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

        end_date_label = new javax.swing.JLabel();
        requirement_label_name = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(665, 42));
        setMinimumSize(new java.awt.Dimension(665, 42));
        setPreferredSize(new java.awt.Dimension(665, 42));
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

        end_date_label.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        end_date_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        end_date_label.setText("End Date");
        add(end_date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        requirement_label_name.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        requirement_label_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requirement_label_name.setText("Name");
        add(requirement_label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        this.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.setBackground(Color.WHITE);
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel end_date_label;
    public javax.swing.JLabel requirement_label_name;
    // End of variables declaration//GEN-END:variables
}