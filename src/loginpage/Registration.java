/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;
import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;


/**
 *
 * @author Aakash Gadhave
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    DefaultListModel dm = new DefaultListModel();
    public Registration() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        
    }
    
   /* private void getUnderTrial()
    {
        JPanel underTrial;
        underTrial = new javax.swing.JPanel();
        
    }*/       
    
    //Add To The List
     private void add(String name){
         skillsList.setModel(dm);
         
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

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        foregroundPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        skillstxtfield = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        convictedRadio = new javax.swing.JRadioButton();
        undertrialRadio = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        skillsList = new javax.swing.JList<>();
        skillDelete = new javax.swing.JButton();
        skillAdd = new javax.swing.JButton();
        typesPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(850, 550));
        setSize(new java.awt.Dimension(850, 550));

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        foregroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        foregroundPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        foregroundPanel.setForeground(new java.awt.Color(153, 153, 153));
        foregroundPanel.setMinimumSize(new java.awt.Dimension(750, 1271));
        foregroundPanel.setPreferredSize(new java.awt.Dimension(750, 1271));
        foregroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Last name");
        foregroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Middle name");
        foregroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel6.setBackground(new java.awt.Color(36, 47, 65));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Birthdate");
        foregroundPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel7.setBackground(new java.awt.Color(36, 47, 65));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Occupation");
        foregroundPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel12.setBackground(new java.awt.Color(36, 47, 65));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("City");
        foregroundPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 670, -1, -1));

        titlePanel.setBackground(new java.awt.Color(204, 255, 255));
        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Prisoner Registration Form");
        titlePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 40));

        foregroundPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        jTextField5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        foregroundPanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 170, 30));

        jTextField6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foregroundPanel.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 170, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("First name");
        foregroundPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "SSC", "HSC", "Diploma", "Graduate", "Post Graduate", "Bachelor's Degree", "Master's Degree", "Doctorate or higher", "--" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        foregroundPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 170, 30));

        jLabel13.setBackground(new java.awt.Color(36, 47, 65));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Qualification");
        foregroundPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 130, -1));

        skillstxtfield.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        skillstxtfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foregroundPanel.add(skillstxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 170, 30));

        jLabel16.setBackground(new java.awt.Color(36, 47, 65));
        jLabel16.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Skills");
        foregroundPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 90, 20));

        jTextField9.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foregroundPanel.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 170, 30));

        convictedRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(convictedRadio);
        convictedRadio.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        convictedRadio.setForeground(new java.awt.Color(51, 51, 51));
        convictedRadio.setText("Convicted");
        convictedRadio.setBorder(null);
        convictedRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convictedRadioActionPerformed(evt);
            }
        });
        foregroundPanel.add(convictedRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 810, -1, -1));

        undertrialRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(undertrialRadio);
        undertrialRadio.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        undertrialRadio.setForeground(new java.awt.Color(51, 51, 51));
        undertrialRadio.setText("Under Trial");
        undertrialRadio.setBorder(null);
        undertrialRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undertrialRadioActionPerformed(evt);
            }
        });
        foregroundPanel.add(undertrialRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 810, -1, -1));

        jLabel20.setBackground(new java.awt.Color(36, 47, 65));
        jLabel20.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Prisoner Type");
        foregroundPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 770, -1, -1));

        jTextField10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        foregroundPanel.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 710, 170, 30));

        jTextField11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        foregroundPanel.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 170, 30));

        jTextField12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        foregroundPanel.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 170, 30));

        jComboBox3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Country", "India ", "Afghanistan ", "Albania ", "Algeria ", "American Samoa ", "Andorra ", "Angola ", "Anguilla ", "Antigua & Barbuda ", "Argentina ", "Armenia ", "Aruba ", "Australia ", "Austria ", "Azerbaijan ", "Bahamas, The ", "Bahrain ", "Bangladesh ", "Barbados ", "Belarus ", "Belgium ", "Belize ", "Benin ", "Bermuda ", "Bhutan ", "Bolivia ", "Bosnia & Herzegovina ", "Botswana ", "Brazil ", "British Virgin Is. ", "Brunei ", "Bulgaria ", "Burkina Faso ", "Burma ", "Burundi ", "Cambodia ", "Cameroon ", "Canada ", "Cape Verde ", "Cayman Islands ", "Central African Rep. ", "Chad ", "Chile ", "China ", "Colombia ", "Comoros ", "Congo, Dem. Rep. ", "Congo, Repub. of the ", "Cook Islands ", "Costa Rica ", "Cote d'Ivoire ", "Croatia ", "Cuba ", "Cyprus ", "Czech Republic ", "Denmark ", "Djibouti ", "Dominica ", "Dominican Republic ", "East Timor ", "Ecuador ", "Egypt ", "El Salvador ", "Equatorial Guinea ", "Eritrea ", "Estonia ", "Ethiopia ", "Faroe Islands ", "Fiji ", "Finland ", "France ", "French Guiana ", "French Polynesia ", "Gabon ", "Gambia, The ", "Gaza Strip ", "Georgia ", "Germany ", "Ghana ", "Gibraltar ", "Greece ", "Greenland ", "Grenada ", "Guadeloupe ", "Guam ", "Guatemala ", "Guernsey ", "Guinea ", "Guinea-Bissau ", "Guyana ", "Haiti ", "Honduras ", "Hong Kong ", "Hungary ", "Iceland ", "Indonesia ", "Iran ", "Iraq ", "Ireland ", "Isle of Man ", "Israel ", "Italy ", "Jamaica ", "Japan ", "Jersey ", "Jordan ", "Kazakhstan ", "Kenya ", "Kiribati ", "Korea, North ", "Korea, South ", "Kuwait ", "Kyrgyzstan ", "Laos ", "Latvia ", "Lebanon ", "Lesotho ", "Liberia ", "Libya ", "Liechtenstein ", "Lithuania ", "Luxembourg ", "Macau ", "Macedonia ", "Madagascar ", "Malawi ", "Malaysia ", "Maldives ", "Mali ", "Malta ", "Marshall Islands ", "Martinique ", "Mauritania ", "Mauritius ", "Mayotte ", "Mexico ", "Micronesia, Fed. St. ", "Moldova ", "Monaco ", "Mongolia ", "Montserrat ", "Morocco ", "Mozambique ", "Namibia ", "Nauru ", "Nepal ", "Netherlands ", "Netherlands Antilles ", "New Caledonia ", "New Zealand ", "Nicaragua ", "Niger ", "Nigeria ", "N. Mariana Islands ", "Norway ", "Oman ", "Pakistan ", "Palau ", "Panama ", "Papua New Guinea ", "Paraguay ", "Peru ", "Philippines ", "Poland ", "Portugal ", "Puerto Rico ", "Qatar ", "Reunion ", "Romania ", "Russia ", "Rwanda ", "Saint Helena ", "Saint Kitts & Nevis ", "Saint Lucia ", "St Pierre & Miquelon ", "Saint Vincent and the Grenadines ", "Samoa ", "San Marino ", "Sao Tome & Principe ", "Saudi Arabia ", "Senegal ", "Serbia ", "Seychelles ", "Sierra Leone ", "Singapore ", "Slovakia ", "Slovenia ", "Solomon Islands ", "Somalia ", "South Africa ", "Spain ", "Sri Lanka ", "Sudan ", "Suriname ", "Swaziland ", "Sweden ", "Switzerland ", "Syria ", "Taiwan ", "Tajikistan ", "Tanzania ", "Thailand ", "Togo ", "Tonga ", "Trinidad & Tobago ", "Tunisia ", "Turkey ", "Turkmenistan ", "Turks & Caicos Is ", "Tuvalu ", "Uganda ", "Ukraine ", "United Arab Emirates ", "United Kingdom ", "United States ", "Uruguay ", "Uzbekistan ", "Vanuatu ", "Venezuela ", "Vietnam ", "Virgin Islands ", "Wallis and Futuna ", "West Bank ", "Western Sahara ", "Yemen ", "Zambia ", "Zimbabwe ", " " }));
        foregroundPanel.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 170, 30));

        jLabel21.setBackground(new java.awt.Color(36, 47, 65));
        jLabel21.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Nationality");
        foregroundPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 110, 30));

        jLabel22.setBackground(new java.awt.Color(36, 47, 65));
        jLabel22.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Address");
        foregroundPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 100, -1));

        jTextField13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foregroundPanel.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 170, 30));

        jDateChooser3.setDateFormatString("yyyy/mm/dd");
        jDateChooser3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jDateChooser3.setMinimumSize(new java.awt.Dimension(10, 10));
        jDateChooser3.setPreferredSize(new java.awt.Dimension(10, 10));
        foregroundPanel.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 170, 30));

        jLabel24.setBackground(new java.awt.Color(36, 47, 65));
        jLabel24.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Personal Details");
        foregroundPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel25.setBackground(new java.awt.Color(36, 47, 65));
        jLabel25.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Locality");
        foregroundPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, -1, -1));

        jLabel26.setBackground(new java.awt.Color(36, 47, 65));
        jLabel26.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("State");
        foregroundPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, -1, 20));

        skillsList.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        skillsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        jScrollPane3.setViewportView(skillsList);

        foregroundPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 170, 80));

        skillDelete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        skillDelete.setText("Delete");
        skillDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillDeleteActionPerformed(evt);
            }
        });
        foregroundPanel.add(skillDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 80, -1));

        skillAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        skillAdd.setText("Add");
        skillAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillAddActionPerformed(evt);
            }
        });
        foregroundPanel.add(skillAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 80, -1));

        typesPanel.setBackground(new java.awt.Color(255, 255, 255));
        typesPanel.setLayout(new java.awt.BorderLayout());
        foregroundPanel.add(typesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 840, 450, 360));

        jButton1.setBackground(new java.awt.Color(40, 122, 230));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.setEnabled(false);
        foregroundPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1220, 120, -1));

        jPanel6.add(foregroundPanel);

        jPanel4.add(jPanel6);

        jScrollPane1.setViewportView(jPanel4);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skillAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillAddActionPerformed
        // TODO add your handling code here:
        if(skillstxtfield.getText().length()!=0)
        {
           add(skillstxtfield.getText());
           skillstxtfield.setText("");
        }
          
         
    }//GEN-LAST:event_skillAddActionPerformed

    private void skillDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillDeleteActionPerformed
        // TODO add your handling code here:
            //Get Index,Update
        int index = skillsList.getSelectedIndex();

        dm.removeElementAt(index);
        //Clear Text
        skillstxtfield.setText(null);
    }//GEN-LAST:event_skillDeleteActionPerformed

    private void undertrialRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undertrialRadioActionPerformed
        // TODO add your handling code here:
        typesPanel.removeAll();
        typesPanel.add(new Under_trial_panel(),BorderLayout.CENTER);
        typesPanel.revalidate();
        typesPanel.repaint();
        jButton1.setEnabled(true);
    }//GEN-LAST:event_undertrialRadioActionPerformed

    private void convictedRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convictedRadioActionPerformed
        // TODO add your handling code here:
        typesPanel.removeAll();
        typesPanel.add(new Convicted_panel(),BorderLayout.CENTER);
        typesPanel.revalidate();
        typesPanel.repaint();
        jButton1.setEnabled(true);
        
    }//GEN-LAST:event_convictedRadioActionPerformed

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton convictedRadio;
    private javax.swing.JPanel foregroundPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton skillAdd;
    private javax.swing.JButton skillDelete;
    private javax.swing.JList<String> skillsList;
    private javax.swing.JTextField skillstxtfield;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JPanel typesPanel;
    private javax.swing.JRadioButton undertrialRadio;
    // End of variables declaration//GEN-END:variables
}
