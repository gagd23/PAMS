/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author Aakash Gadhave
 */
public class jailor_Dash extends javax.swing.JFrame {

    /**
     * Creates new form jailor_Dash
     */
    public jailor_Dash() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private final Color originalColor = new Color(52, 58, 64);
    private final Color clickedColor = new Color(23, 162, 184);
    private final Color focusColor = new Color(40, 122, 230);
    
    
    public void setAlloc()
    {
        loadingPanel.removeAll();
        loadingPanel.add(new Allocate_work(), BorderLayout.CENTER);
        loadingPanel.revalidate();
        loadingPanel.repaint();
    }
    private void setAllBlack(){
        homeLabel.setBackground(originalColor);
        allocateWorkLabel.setBackground(originalColor);
        checkStatusLabel.setBackground(originalColor);
        viewPrisonerLabel.setBackground(originalColor);
        emergencyLabel.setBackground(new Color(73, 78, 83));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        loadingPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        optionsPanel = new javax.swing.JPanel();
        workLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewPrisonerLabel = new javax.swing.JLabel();
        emergencyLabel = new javax.swing.JLabel();
        allocateWorkLabel = new javax.swing.JLabel();
        checkStatusLabel = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        prisonerLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 204));
        backgroundPanel.setLayout(new java.awt.BorderLayout());

        loadingPanel.setBackground(new java.awt.Color(255, 255, 255));
        loadingPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 58, 64));
        jLabel2.setText("Notifications");
        loadingPanel.add(jLabel2, java.awt.BorderLayout.CENTER);

        backgroundPanel.add(loadingPanel, java.awt.BorderLayout.CENTER);

        optionsPanel.setBackground(new java.awt.Color(52, 58, 64));
        optionsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workLabel.setBackground(new java.awt.Color(73, 78, 83));
        workLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        workLabel.setForeground(new java.awt.Color(255, 255, 255));
        workLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        workLabel.setText("  Work");
        workLabel.setAlignmentX(1.0F);
        workLabel.setOpaque(true);
        optionsPanel.add(workLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 123, 200, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        optionsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 364, -1, 25));

        viewPrisonerLabel.setBackground(new java.awt.Color(52, 58, 64));
        viewPrisonerLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        viewPrisonerLabel.setForeground(new java.awt.Color(204, 204, 204));
        viewPrisonerLabel.setText("  View ");
        viewPrisonerLabel.setOpaque(true);
        viewPrisonerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPrisonerLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewPrisonerLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewPrisonerLabelMouseExited(evt);
            }
        });
        optionsPanel.add(viewPrisonerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 270, 176, 30));

        emergencyLabel.setBackground(new java.awt.Color(73, 78, 83));
        emergencyLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        emergencyLabel.setForeground(new java.awt.Color(255, 255, 255));
        emergencyLabel.setText("  Emergency");
        emergencyLabel.setOpaque(true);
        emergencyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emergencyLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emergencyLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emergencyLabelMouseExited(evt);
            }
        });
        optionsPanel.add(emergencyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 307, 200, 40));

        allocateWorkLabel.setBackground(new java.awt.Color(52, 58, 64));
        allocateWorkLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        allocateWorkLabel.setForeground(new java.awt.Color(204, 204, 204));
        allocateWorkLabel.setText("  Allocate Work");
        allocateWorkLabel.setOpaque(true);
        allocateWorkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allocateWorkLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                allocateWorkLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                allocateWorkLabelMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                allocateWorkLabelMouseReleased(evt);
            }
        });
        optionsPanel.add(allocateWorkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 163, 176, 30));

        checkStatusLabel.setBackground(new java.awt.Color(52, 58, 64));
        checkStatusLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        checkStatusLabel.setForeground(new java.awt.Color(204, 204, 204));
        checkStatusLabel.setText("  Check Status");
        checkStatusLabel.setOpaque(true);
        checkStatusLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                checkStatusLabelAncestorRemoved(evt);
            }
        });
        checkStatusLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkStatusLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkStatusLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkStatusLabelMouseExited(evt);
            }
        });
        optionsPanel.add(checkStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 193, 176, 30));

        homeLabel.setBackground(new java.awt.Color(52, 58, 64));
        homeLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText("  Home");
        homeLabel.setOpaque(true);
        homeLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                homeLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                homeLabelFocusLost(evt);
            }
        });
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });
        optionsPanel.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 83, 200, 40));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tasks.png"))); // NOI18N
        optionsPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 193, 20, 30));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contract.png"))); // NOI18N
        optionsPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 163, 20, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.png"))); // NOI18N
        optionsPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 30));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/siren.png"))); // NOI18N
        optionsPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 307, -1, 40));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        optionsPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, 40));

        prisonerLabel1.setBackground(new java.awt.Color(73, 78, 83));
        prisonerLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        prisonerLabel1.setForeground(new java.awt.Color(255, 255, 255));
        prisonerLabel1.setText("  Prisoner");
        prisonerLabel1.setOpaque(true);
        optionsPanel.add(prisonerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 40));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/prisoner.png"))); // NOI18N
        optionsPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 40));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/work.png"))); // NOI18N
        optionsPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, 40));

        backgroundPanel.add(optionsPanel, java.awt.BorderLayout.LINE_START);

        topPanel.setBackground(new java.awt.Color(52, 58, 64));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jLabel7.setToolTipText("Logout");
        topPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, 21));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logout");
        topPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 40, -1, -1));

        jLabel14.setBackground(new java.awt.Color(73, 78, 83));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Name");
        jLabel14.setOpaque(true);
        topPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Akash Gadhave");
        topPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 30));

        jLabel15.setBackground(new java.awt.Color(73, 78, 83));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Jailor ID");
        jLabel15.setOpaque(true);
        topPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("J01");
        topPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 30));

        backgroundPanel.add(topPanel, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(backgroundPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        // TODO add your handling code here:

        if (homeLabel.getBackground().getBlue()!=184 && homeLabel.getBackground().getRed()!=23 && homeLabel.getBackground().getGreen()!=162) {

            homeLabel.setBackground(originalColor);

        }
    }//GEN-LAST:event_homeLabelMouseExited

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        // TODO add your handling code here:
        if (homeLabel.getBackground().getBlue()!=184 && homeLabel.getBackground().getRed()!=23 && homeLabel.getBackground().getGreen()!=162) {

            homeLabel.setBackground(focusColor);

        }
    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // TODO add your handling code here:
        setAllBlack();
        homeLabel.setBackground(clickedColor);
    }//GEN-LAST:event_homeLabelMouseClicked

    private void homeLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homeLabelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_homeLabelFocusLost

    private void homeLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homeLabelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_homeLabelFocusGained

    private void checkStatusLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkStatusLabelMouseExited
        // TODO add your handling code here:
        if (checkStatusLabel.getBackground().getBlue()!=184 && checkStatusLabel.getBackground().getRed()!=23 && checkStatusLabel.getBackground().getGreen()!=162) {

            checkStatusLabel.setBackground(originalColor);

        }
    }//GEN-LAST:event_checkStatusLabelMouseExited

    private void checkStatusLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkStatusLabelMouseEntered
        // TODO add your handling code here:
        if (checkStatusLabel.getBackground().getBlue()!=184 && checkStatusLabel.getBackground().getRed()!=23 && checkStatusLabel.getBackground().getGreen()!=162) {

            checkStatusLabel.setBackground(focusColor);

        }
    }//GEN-LAST:event_checkStatusLabelMouseEntered

    private void checkStatusLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkStatusLabelMouseClicked
        // TODO add your handling code here:
        setAllBlack();
        checkStatusLabel.setBackground(clickedColor);
    }//GEN-LAST:event_checkStatusLabelMouseClicked

    private void checkStatusLabelAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_checkStatusLabelAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_checkStatusLabelAncestorRemoved

    private void allocateWorkLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allocateWorkLabelMouseReleased
        // TODO add your handling code here:
        // addPrisoner1.setBackground(new Color(52,58,64));
        // addPrisoner1.repaint();
    }//GEN-LAST:event_allocateWorkLabelMouseReleased

    private void allocateWorkLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allocateWorkLabelMouseExited
        // TODO add your handling code here:

        if (allocateWorkLabel.getBackground().getBlue()!=184 && allocateWorkLabel.getBackground().getRed()!=23 && allocateWorkLabel.getBackground().getGreen()!=162) {

            allocateWorkLabel.setBackground(originalColor);

        }
    }//GEN-LAST:event_allocateWorkLabelMouseExited

    private void allocateWorkLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allocateWorkLabelMouseEntered
        // TODO add your handling code here:
        if (allocateWorkLabel.getBackground().getBlue()!=184 && allocateWorkLabel.getBackground().getRed()!=23 && allocateWorkLabel.getBackground().getGreen()!=162) {

            allocateWorkLabel.setBackground(focusColor);

        }
    }//GEN-LAST:event_allocateWorkLabelMouseEntered

    private void allocateWorkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allocateWorkLabelMouseClicked
        // TODO add your handling code here:
        setAllBlack();
        allocateWorkLabel.setBackground(clickedColor);
        //  modifyPrisoner.setBackground(new Color(52, 58, 64));
        //viewPrisoner.setBackground(new Color(52, 58, 64));
        
        loadingPanel.removeAll();
        loadingPanel.add(new Allocate_Work_search(), BorderLayout.CENTER);
        loadingPanel.revalidate();
        loadingPanel.repaint();
        
        
    }//GEN-LAST:event_allocateWorkLabelMouseClicked

    private void viewPrisonerLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPrisonerLabelMouseExited
        // TODO add your handling code here:
        if (viewPrisonerLabel.getBackground().getBlue()!=184 && viewPrisonerLabel.getBackground().getRed()!=23 && viewPrisonerLabel.getBackground().getGreen()!=162) {

            viewPrisonerLabel.setBackground(originalColor);
        }
    }//GEN-LAST:event_viewPrisonerLabelMouseExited

    private void viewPrisonerLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPrisonerLabelMouseEntered
        // TODO add your handling code here:
        if (viewPrisonerLabel.getBackground().getBlue()!=184 && viewPrisonerLabel.getBackground().getRed()!=23 && viewPrisonerLabel.getBackground().getGreen()!=162) {

            viewPrisonerLabel.setBackground(focusColor);
    }//GEN-LAST:event_viewPrisonerLabelMouseEntered
    }
    private void viewPrisonerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPrisonerLabelMouseClicked
        // TODO add your handling code here:
        setAllBlack();
        viewPrisonerLabel.setBackground(clickedColor);
    }//GEN-LAST:event_viewPrisonerLabelMouseClicked

    private void emergencyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergencyLabelMouseClicked
        // TODO add your handling code here:
         setAllBlack();
        emergencyLabel.setBackground(clickedColor);
    }//GEN-LAST:event_emergencyLabelMouseClicked

    private void emergencyLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergencyLabelMouseEntered
        // TODO add your handling code here:
         if (emergencyLabel.getBackground().getBlue()!=184 && emergencyLabel.getBackground().getRed()!=23 && emergencyLabel.getBackground().getGreen()!=162) {

            emergencyLabel.setBackground(focusColor);
    }       
    }//GEN-LAST:event_emergencyLabelMouseEntered

    private void emergencyLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergencyLabelMouseExited
        // TODO add your handling code here:
        if (emergencyLabel.getBackground().getBlue()!=184 && emergencyLabel.getBackground().getRed()!=23 && emergencyLabel.getBackground().getGreen()!=162) {

            emergencyLabel.setBackground(new Color(73, 78, 83));
    }       
    }//GEN-LAST:event_emergencyLabelMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jailor_Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jailor_Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jailor_Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jailor_Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jailor_Dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allocateWorkLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel checkStatusLabel;
    private javax.swing.JLabel emergencyLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel loadingPanel;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel prisonerLabel1;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel viewPrisonerLabel;
    private javax.swing.JLabel workLabel;
    // End of variables declaration//GEN-END:variables
}
