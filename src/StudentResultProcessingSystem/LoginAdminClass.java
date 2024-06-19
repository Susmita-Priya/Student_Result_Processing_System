/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentResultProcessingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author My AsUs
 */
public class LoginAdminClass extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdminClass
     */
    public LoginAdminClass() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("    LOG IN");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 120, 52));

        jLabelName.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(51, 255, 51));
        jLabelName.setText("Id");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 108, 88, 27));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 107, 185, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 172, 78, 25));
        getContentPane().add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 169, 185, 36));

        jButtonLogin.setBackground(new java.awt.Color(0, 0, 204));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButtonLogin.setText("Log In");
        jButtonLogin.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 286, 100, 38));

        jButtonClear.setBackground(new java.awt.Color(0, 255, 0));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButtonClear.setText("Reset");
        jButtonClear.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 286, 125, 38));

        jButtonBack.setBackground(new java.awt.Color(0, 255, 255));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 286, 101, 38));

        jButtonExit.setBackground(new java.awt.Color(255, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 478, 91, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\java project pic\\WhatsApp Image 2021-06-26 at 6.06.28 PM (1).jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        ChooseClass bd=new ChooseClass();
        bd.setVisible(true);
        LoginAdminClass.this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextFieldName.setText(null);
        jPasswordFieldPassword.setText(null);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
         // TODO add your handling code here:
           String name= jTextFieldName.getText();
        String pass= jPasswordFieldPassword.getText();
       
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginAdminClass.class.getName()).log(Level.SEVERE, null, ex);
        }
           Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?serverTimezone=UTC", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminClass.class.getName()).log(Level.SEVERE, null, ex);
        }
            String query="SELECT `password` FROM `admininfom` WHERE `id`='"+jTextFieldName.getText()+"'";
           PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(query);
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminClass.class.getName()).log(Level.SEVERE, null, ex);
        }
           ResultSet  result = null;
        try {
            result = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(result.next())
            {
                String paw=result.getString("Password");
                if(paw.equals(pass))
                {
                    JOptionPane.showMessageDialog(null, "Welcome Admin");
                    AdminChooseClass a= new AdminChooseClass();
                    a.setVisible(true);
                    LoginAdminClass.this.dispose();
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Your Password is wrong ");
                     jPasswordFieldPassword.setText(null);
                }
            } 
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminClass.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_jButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdminClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdminClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdminClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdminClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdminClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
