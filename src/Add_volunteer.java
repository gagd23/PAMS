/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.foodrive;

//import Testing.*;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author abcd
 */
public class Add_volunteer extends javax.swing.JFrame {

    /**
     * Creates new form TestGUI
     */
    private int validate_all=8;
    public Add_volunteer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private boolean check_regex(String regex,String inpuString){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inpuString);
        if(matcher.matches()){
            return true;
        }
        else{
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLabel7 = new javax.swing.JLabel();
        gender_button_group = new javax.swing.ButtonGroup();
        jDayChooser2 = new com.toedter.calendar.JDayChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fname_label = new javax.swing.JLabel();
        fname_text = new javax.swing.JTextField();
        mname_label = new javax.swing.JLabel();
        mname_text = new javax.swing.JTextField();
        lname_label = new javax.swing.JLabel();
        lname_text = new javax.swing.JTextField();
        gender_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        address_text = new javax.swing.JTextField();
        phone_label = new javax.swing.JLabel();
        phone_text = new javax.swing.JTextField();
        alt_phone_label = new javax.swing.JLabel();
        alt_phone_text = new javax.swing.JTextField();
        emaill_label = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Title_label = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        gender_combo_box = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        phone_label1 = new javax.swing.JLabel();
        age_textField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Volunteer");
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setWheelScrollingEnabled(false);

        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(670, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(670, 600));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(670, 540));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fname_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        fname_label.setText("First Name ");

        fname_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        fname_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fname_textFocusLost(evt);
            }
        });
        fname_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_textActionPerformed(evt);
            }
        });

        mname_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mname_label.setText("Middle Name ");

        mname_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mname_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mname_textFocusLost(evt);
            }
        });
        mname_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mname_textActionPerformed(evt);
            }
        });

        lname_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lname_label.setText("Last Name ");

        lname_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lname_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lname_textFocusLost(evt);
            }
        });

        gender_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        gender_label.setText("Age ");

        dob_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dob_label.setText("Date of Birth ");

        address_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        address_label.setText("Address ");

        address_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        address_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                address_textFocusLost(evt);
            }
        });
        address_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_textActionPerformed(evt);
            }
        });

        phone_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        phone_label.setText("Phone ");

        phone_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        phone_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phone_textFocusLost(evt);
            }
        });

        alt_phone_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        alt_phone_label.setText("Alternate Phone");

        alt_phone_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        alt_phone_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                alt_phone_textFocusLost(evt);
            }
        });

        emaill_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        emaill_label.setText("Email Id ");

        email_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        email_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_textFocusLost(evt);
            }
        });
        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_wht_bg_small.PNG"))); // NOI18N

        Title_label.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Title_label.setText("Add New Volunteer");

        jButton3.setBackground(new java.awt.Color(67, 134, 250));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add");
        jButton3.setContentAreaFilled(false);
        jButton3.setMaximumSize(new java.awt.Dimension(51, 30));
        jButton3.setMinimumSize(new java.awt.Dimension(51, 30));
        jButton3.setOpaque(true);
        jButton3.setPreferredSize(new java.awt.Dimension(51, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(67, 134, 250));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.setToolTipText("");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setMaximumSize(new java.awt.Dimension(51, 25));
        jButton4.setMinimumSize(new java.awt.Dimension(51, 25));
        jButton4.setOpaque(true);
        jButton4.setPreferredSize(new java.awt.Dimension(51, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        gender_combo_box.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        gender_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jDateChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser1FocusLost(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        phone_label1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        phone_label1.setText("Gender");

        age_textField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        age_textField.setEnabled(false);
        age_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fname_label)
                                    .addComponent(mname_label)
                                    .addComponent(lname_label)
                                    .addComponent(dob_label))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lname_text, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mname_text, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fname_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Title_label)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(alt_phone_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(alt_phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(address_text, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emaill_label)
                                                .addComponent(address_label)
                                                .addComponent(phone_label)
                                                .addComponent(phone_label1))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(70, 70, 70)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(gender_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(phone_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                            .addComponent(gender_label)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(age_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Title_label)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_label)
                    .addComponent(fname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname_label)
                    .addComponent(lname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_label)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gender_label)
                        .addComponent(age_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emaill_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_label)
                    .addComponent(address_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_label)
                    .addComponent(phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alt_phone_label)
                    .addComponent(alt_phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(170, 20, 500, 509);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 600);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(866, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            if(validate_all==0)
            {
            String alt_phone="NULL";
            if(alt_phone_text.getText().length()!=0)
            alt_phone="'"+alt_phone_text.getText()+"'";
            //Data to be inserted
            int Points=0;
            String gender=gender_combo_box.getSelectedItem().toString();
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            String dob=format.format(jDateChooser1.getDate());
            
            //System.out.println("Gender "+gender+" DOB : "+dob);
            //Connect Database Block
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/foodrive","root","nimda");
            System.out.println("Connected");
            //Connect Database Block
            
            Statement st = c.createStatement();
            //Query for insert into member
            String query="INSERT INTO member(member_id,fname,mname,lname,address,gender,joindate,dob,email,points,phone,alternate_phone) " +
            "VALUES(NULL,'"+fname_text.getText()+"','"+mname_text.getText()+"','"+lname_text.getText()+"',"+
            "'"+address_text.getText()+"','"+gender+"',NOW(),'"+dob+"'," +
            "'"+email_text.getText()+"',"+Integer.toString(Points)+",'"+phone_text.getText()+"',"+alt_phone+");";
            System.out.println("Runnung Query");
            //Execute query
            st.executeUpdate(query);
            System.out.println("Done");
            Component j = null;
            JOptionPane.showMessageDialog(j, "Volunteer Added Successfully..!");
            }
            else{
                if(validate_all!=0){
                    JOptionPane.showMessageDialog(null,"Enterered data is not correct!..");
                }
                
                 System.out.println(""+validate_all);
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while Adding Volunteer..!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textActionPerformed

    private void email_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_textFocusLost
        // TODO add your handling code here:
        String regex = "^(.+)@(.+)[.](.+)";

        boolean isValid=check_regex(regex, email_text.getText());

        if(isValid)
        {
             if(email_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
            email_text.setBackground(new Color(170, 253, 197));
        }
        else{
            if(email_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
            email_text.setBackground(new Color(255, 186, 187));
            
        }
    }//GEN-LAST:event_email_textFocusLost

    private void alt_phone_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alt_phone_textFocusLost
        // TODO add your handling code here:
        String regex = "\\d{10}";

        boolean isValid=check_regex(regex, alt_phone_text.getText());
        if(alt_phone_text.getText().length()==0)
        {
            isValid=true;
        }
        if(isValid)
        {
             if(alt_phone_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
            alt_phone_text.setBackground(new Color(170, 253, 197));
        }
        else{
             if(alt_phone_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
            alt_phone_text.setBackground(new Color(255, 186, 187));
            
        }
    }//GEN-LAST:event_alt_phone_textFocusLost

    private void phone_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone_textFocusLost
        // TODO add your handling code here:

        String regex = "\\d{10}";

        boolean isValid=check_regex(regex, phone_text.getText());

        if(isValid)
        {
            if(phone_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
            phone_text.setBackground(new Color(170, 253, 197));
        }
        else{
            if(phone_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
            phone_text.setBackground(new Color(255, 186, 187));
             
        }
    }//GEN-LAST:event_phone_textFocusLost

    private void address_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_textActionPerformed

    private void address_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_textFocusLost
        // TODO add your handling code here:
        String regex = "[a-zA-Z]+";

        boolean isValid=check_regex(regex, address_text.getText());

        if(isValid)
        {
            if(address_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
            address_text.setBackground(new Color(170, 253, 197));
        }
        else{
            if(address_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
            address_text.setBackground(new Color(255, 186, 187));
           
        }
    }//GEN-LAST:event_address_textFocusLost

    private void lname_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lname_textFocusLost
        // TODO add your handling code here:
        String regex = "[a-zA-Z]+";

        boolean isValid=check_regex(regex, lname_text.getText());

        if(isValid)
        {
            if(lname_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
            lname_text.setBackground(new Color(170, 253, 197));
        }
        else{
            if(lname_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
            lname_text.setBackground(new Color(255, 186, 187));
            
        }
    }//GEN-LAST:event_lname_textFocusLost

    private void mname_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mname_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mname_textActionPerformed

    private void mname_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mname_textFocusLost
        // TODO add your handling code here:
        String regex = "[a-zA-Z]+";

        boolean isValid=check_regex(regex, mname_text.getText());

        if(isValid)
        {
            if(mname_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
            mname_text.setBackground(new Color(170, 253, 197));
        }
        else{
            if(mname_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
            mname_text.setBackground(new Color(255, 186, 187));
             
        }
    }//GEN-LAST:event_mname_textFocusLost

    private void fname_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_textActionPerformed

    private void fname_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fname_textFocusLost
        // TODO add your handling code here:
        String regex = "[a-zA-Z]+";

        boolean isValid=check_regex(regex, fname_text.getText());

        if(isValid)
        {
             
            if(fname_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
            fname_text.setBackground(new Color(170, 253, 197));
        }
        else{
            if(fname_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
            fname_text.setBackground(new Color(255, 186, 187));
             
        }
    }//GEN-LAST:event_fname_textFocusLost

    private void jDateChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jDateChooser1FocusLost

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        if(jDateChooser1.getDate()!=null)
        {
            LocalDate now = LocalDate.now();
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            String dob=format.format(jDateChooser1.getDate());
            //String now_date=format.format(now);
            long diffInMillies = Math.abs(jDateChooser1.getDate().getTime() - new Date().getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            //System.out.println("Days : "+diff+" Year "+diff/365);
            int yeardiff=(int) (diff/365);
            age_textField.setText(""+yeardiff);
            if(yeardiff>=18)
            {
                validate_all--;
                age_textField.setBackground(new Color(170, 253, 197));
            }
            else
            {
                validate_all++;
                age_textField.setBackground(new Color(255, 186, 187));
            }
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void age_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_textFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Add_volunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_volunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_volunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_volunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_volunteer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title_label;
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_text;
    private javax.swing.JTextField age_textField;
    private javax.swing.JLabel alt_phone_label;
    private javax.swing.JTextField alt_phone_text;
    private javax.swing.JLabel dob_label;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel emaill_label;
    private javax.swing.JLabel fname_label;
    private javax.swing.JTextField fname_text;
    private javax.swing.ButtonGroup gender_button_group;
    private javax.swing.JComboBox<String> gender_combo_box;
    private javax.swing.JLabel gender_label;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lname_label;
    private javax.swing.JTextField lname_text;
    private javax.swing.JLabel mname_label;
    private javax.swing.JTextField mname_text;
    private javax.swing.JLabel phone_label;
    private javax.swing.JLabel phone_label1;
    private javax.swing.JTextField phone_text;
    // End of variables declaration//GEN-END:variables
}
