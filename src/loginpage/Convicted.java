/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;

import javax.swing.DefaultListModel;

/**
 *
 * @author Aakash Gadhave
 */
public class Convicted extends javax.swing.JFrame {

    /**
     * Creates new form Convicted
     */
    DefaultListModel dm = new DefaultListModel();
    public Convicted() {
        initComponents();
    }
    
    //Add To The List
     private void add(String name){
         jList3.setModel(dm);
         dm.addElement(name);
         
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        convictedPanel = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        daysTextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        Add3 = new javax.swing.JButton();
        Update3 = new javax.swing.JButton();
        Delete3 = new javax.swing.JButton();
        Add1 = new javax.swing.JButton();
        nametxt4 = new javax.swing.JTextField();
        yearTxtfield = new javax.swing.JTextField();
        monthsTextfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        convictedPanel.setBackground(new java.awt.Color(255, 255, 255));
        convictedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButton1.setText("Rigorous");
        jRadioButton1.setBorder(null);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        convictedPanel.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButton2.setText("Simple");
        jRadioButton2.setBorder(null);
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        convictedPanel.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Type");
        convictedPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 60, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Crimes");
        convictedPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Days");
        convictedPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Years");
        convictedPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Months");
        convictedPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Sentence Period");
        convictedPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        daysTextfield.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        daysTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        daysTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysTextfieldActionPerformed(evt);
            }
        });
        convictedPanel.add(daysTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 40, 20));

        jList3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList3);

        convictedPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 130, 70));

        Add3.setBackground(new java.awt.Color(255, 255, 255));
        Add3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Add3.setText("Add");
        Add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add3ActionPerformed(evt);
            }
        });
        convictedPanel.add(Add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 70, -1));

        Update3.setBackground(new java.awt.Color(255, 255, 255));
        Update3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Update3.setText("Update");
        Update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update3ActionPerformed(evt);
            }
        });
        convictedPanel.add(Update3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        Delete3.setBackground(new java.awt.Color(255, 255, 255));
        Delete3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Delete3.setText("Delete");
        Delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete3ActionPerformed(evt);
            }
        });
        convictedPanel.add(Delete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        Add1.setBackground(new java.awt.Color(255, 255, 255));
        Add1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Add1.setText("Submit");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });
        convictedPanel.add(Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 90, 30));

        nametxt4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nametxt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        convictedPanel.add(nametxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 150, 20));

        yearTxtfield.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        yearTxtfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yearTxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTxtfieldActionPerformed(evt);
            }
        });
        convictedPanel.add(yearTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 40, 20));

        monthsTextfield.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        monthsTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        monthsTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsTextfieldActionPerformed(evt);
            }
        });
        convictedPanel.add(monthsTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 130, 40, 20));

        getContentPane().add(convictedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void Add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add3ActionPerformed
        // TODO add your handling code here:
        add(daysTextfield.getText());
        daysTextfield.setText("");
    }//GEN-LAST:event_Add3ActionPerformed

    private void Update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update3ActionPerformed
        // TODO add your handling code here:

        //Get Index,Update
        int index = jList3.getSelectedIndex();

        dm.setElementAt(daysTextfield.getText(), index);

        //Clear Text
        daysTextfield.setText("");
    }//GEN-LAST:event_Update3ActionPerformed

    private void Delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete3ActionPerformed
        // TODO add your handling code here:
        //Get Index,Update
        int index = jList3.getSelectedIndex();

        dm.removeElementAt(index);
        //Clear Text
        daysTextfield.setText("");
    }//GEN-LAST:event_Delete3ActionPerformed

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        // TODO add your handling code here:
        String selected = jList3.getSelectedValue().toString();
        daysTextfield.setText(selected);
    }//GEN-LAST:event_jList3MouseClicked

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        // TODO add your handling code here:
        add(daysTextfield.getText());
        daysTextfield.setText("");
    }//GEN-LAST:event_Add1ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void daysTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysTextfieldActionPerformed

    private void yearTxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTxtfieldActionPerformed

    private void monthsTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthsTextfieldActionPerformed

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
            java.util.logging.Logger.getLogger(Convicted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convicted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convicted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convicted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convicted().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add1;
    private javax.swing.JButton Add3;
    private javax.swing.JButton Delete3;
    private javax.swing.JButton Update3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel convictedPanel;
    private javax.swing.JTextField daysTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthsTextfield;
    private javax.swing.JTextField nametxt4;
    private javax.swing.JTextField yearTxtfield;
    // End of variables declaration//GEN-END:variables
}
