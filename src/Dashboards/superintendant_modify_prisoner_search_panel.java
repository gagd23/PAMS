/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import databaseConnectivity.MyPrisonConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 702
 */
public class superintendant_modify_prisoner_search_panel extends javax.swing.JPanel {

    /**
     * Creates new form superintendant_modify_prisoner_search_panel
     */
    Connection con;
    JPanel loadingpanel;
    private superintendant_modify_prisoner_search_loadpanel search;
    public superintendant_modify_prisoner_search_panel(JPanel ref) {
        initComponents();
        MyPrisonConnection o = new MyPrisonConnection();
             con = o.getMyConnection();
             loadingpanel = ref;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchtxtf = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        loadin_panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 270, -1));

        searchtxtf.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        searchtxtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchtxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtfActionPerformed(evt);
            }
        });
        searchtxtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchtxtfKeyTyped(evt);
            }
        });
        jPanel1.add(searchtxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 260, 30));

        search_button.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        loadin_panel.setBackground(new java.awt.Color(255, 255, 255));
        loadin_panel.setLayout(new javax.swing.BoxLayout(loadin_panel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(loadin_panel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 750, 420));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void searchtxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtfActionPerformed

    private void searchtxtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtfKeyReleased
        // TODO add your handling code here:
        //  String st = searchtxtf.getText().trim();

        //String query = "SELECT "
    }//GEN-LAST:event_searchtxtfKeyReleased

    private void searchtxtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtfKeyTyped
        // TODO add your handling code here:

        String searchstr=searchtxtf.getText();

        if(evt.getKeyChar()==java.awt.event.KeyEvent.VK_BACK_SPACE)
        {
            System.out.println("Im in BACKSPACE");

        }
        else
        {
            searchstr=searchtxtf.getText()+evt.getKeyChar();

        }
        System.out.println(searchstr+" "+searchstr.length());

        if(searchstr.isEmpty())
        {
            System.out.println("in if....");
            loadin_panel.removeAll();
            loadin_panel.revalidate();
            loadin_panel.repaint();
        }
        else
        {
            System.out.println("in else.....");
            String query = "SELECT t_id,p_firstname,p_midname,p_lastname,p_indate FROM trial_prisoner WHERE p_firstname LIKE '"+searchstr+"%' AND t_remarks=0";
            PreparedStatement pst;
            ResultSet rs;
            String pris,fir_name,mi_name,l_nm,indate;
            try {
                pst = con.prepareStatement(query);
                // searchtxtf.getText()+"%");
            rs = pst.executeQuery();
            loadin_panel.removeAll();
            while(rs.next()){

                pris = rs.getString("t_id");
                fir_name = rs.getString("p_firstname");
                mi_name = rs.getString("p_midname");
                l_nm = rs.getString("p_lastname");
                indate = rs.getString("p_indate");
                search = new superintendant_modify_prisoner_search_loadpanel(loadingpanel,pris,fir_name,mi_name,l_nm,indate);

                search.fetch_id_label.setText(pris);
                search.fetch_name_label.setText(fir_name+" "+mi_name+" "+l_nm);

                loadin_panel.add(search);
                loadin_panel.revalidate();
                loadin_panel.repaint();
                /*   prison_work = new prisoners_working_in_unit_panel();
                String pr_id = rs.getString("c_id");
                System.out.println(pr_id);
                String first_name = rs.getString("p_firstname");
                String mid_name = rs.getString("p_midname");
                String last_name = rs.getString("p_lastname");
                String fullname = (first_name+" "+mid_name+" "+last_name);
                String end_date1 = rs.getString("end_date");
                prison_work.fetch_id_label.setText(pr_id);
                prison_work.fetch_name_label.setText(fullname);
                prison_work.fetch_end_date_label.setText(end_date1);

                status_view.active_prisoner_panel.add(prison_work);
                status_view.active_prisoner_panel.revalidate();
                status_view.active_prisoner_panel.repaint();*/
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_searchtxtfKeyTyped

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
/*
        if(searchtxtf.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter prisoner name");
            return;
        }

        String qString = "SELECT c_id,p_firstname,p_midname,p_lastname,p_occupation,p_qualification,c_type FROM convicted_prisoner WHERE p_firstname LIKE ?";

        PreparedStatement pst;
        //     PreparedStatement pst1;
        try {
            pst = con.prepareStatement(qString);
            pst.setString(1, searchtxtf.getText());
            // pst.setString(2, searchtxtf.getText()+"%");
            //  pst.setString(3, searchtxtf.getText()+"%");

            ResultSet rs = pst.executeQuery();
            //String s = rs.getString("name");
            //System.out.println(s);
            String id ;
            if(rs.next()){

                //    if(Integer.parsers)

                id =   rs.getString("c_id");

                loadingpanel.removeAll();
                svm = new superintendant_view_prisoner(loadingpanel,id);
                loadingpanel.add(svm, BorderLayout.CENTER);
                loadingpanel.revalidate();
                loadingpanel.repaint();

            }

            /* loadingPanel.add(svm,BorderLayout.CENTER);
            loadingPanel.revalidate();
            loadingPanel.repaint();

            aw.fetch_id.setText(c_id);
            aw.fetch_name.setText(first_name+" "+middle_name+" "+last_name);
            aw.fetch_type.setText(type);
            aw.fetch_occupation.setText(occupation);
            aw.fetch_qualification.setText(qualification);

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Record not found.");
        }

        /*     String c_id    =     rs.getString("c_id");
        pst1 = con.prepareStatement(q);
        pst1.setString(1, c_id);
        ResultSet rs1 = pst1.executeQuery();

        if () {

        }

        } catch (SQLException ex) {
            Logger.getLogger(superintendant_view_prisoner_search.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }//GEN-LAST:event_search_buttonActionPerformed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel loadin_panel;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField searchtxtf;
    // End of variables declaration//GEN-END:variables
}
