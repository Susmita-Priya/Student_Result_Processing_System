/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentResultProcessingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author My AsUs
 */
public class AdminUpdateClass extends javax.swing.JFrame {

    /**
     * Creates new form AdminUpdateClass
     */
    public AdminUpdateClass() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jTextFieldDld = new javax.swing.JTextField();
        jTextFieldJava = new javax.swing.JTextField();
        jTextFieldMath = new javax.swing.JTextField();
        jTextFieldAccounting = new javax.swing.JTextField();
        jTextFieldElectronics = new javax.swing.JTextField();
        jTextFieldStasitics = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Enter Id For Update Result");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 198, 56));
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 46, 180, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("DLD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, 91, 36));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 467, 81, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("JAVA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 73, 29));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("MATH");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 73, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("ACCOUNTING");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("ELECTRONICS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 297, 90, 29));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("STASITICS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 344, 90, 30));

        jButtonUpdate.setBackground(new java.awt.Color(0, 0, 255));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 405, 81, 32));

        jButtonReset.setBackground(new java.awt.Color(0, 255, 0));
        jButtonReset.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 405, 89, 32));

        jButtonBack.setBackground(new java.awt.Color(0, 255, 255));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 405, 91, 32));
        getContentPane().add(jTextFieldDld, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 120, 164, 28));
        getContentPane().add(jTextFieldJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 163, 164, 29));
        getContentPane().add(jTextFieldMath, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 203, 164, 28));

        jTextFieldAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAccountingActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAccounting, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 249, 164, 30));
        getContentPane().add(jTextFieldElectronics, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 297, 164, 29));
        getContentPane().add(jTextFieldStasitics, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 344, 164, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentResultProcessingSystem/Wallpaper20160706_022528.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAccountingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAccountingActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String password="";
            String url ="jdbc:mysql://127.0.0.1:3306/student?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            String s1=jTextFieldId.getText();
            int id=Integer.parseInt(s1);
            String d=jTextFieldDld.getText();
            String j=jTextFieldJava.getText();
            String m=jTextFieldMath.getText();
            String a=jTextFieldAccounting.getText();
            String e=jTextFieldElectronics.getText();
            String s=jTextFieldStasitics.getText();
            
            double total=18;
                 double d1=Double.parseDouble(d);
                 double j1=Double.parseDouble(j);
                 double m1=Double.parseDouble(m);
                 double a1=Double.parseDouble(a);
                 double e1=Double.parseDouble(e);
                 double s2=Double.parseDouble(s);
                 
                 double result;
                 result=(((d1*3)+(j1*3)+(m1*3)+(a1*3)+(e1*3)+(s2*3))/total);
                   String res=""+result;
                   
            String query ="UPDATE studentresultt SET dld="+d+",java="+j+",math="+m+",accounting="+a+",electronics="+e+",stasitics="+s+",total="+res+" WHERE id="+id;
            statement.executeUpdate(query);
                JOptionPane.showMessageDialog(AdminUpdateClass.this ," Information Update Successful ! And Total CGPA is "+res );
            
                  statement.close();
                     conn.close();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentUpdateClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
         AdminChooseClass bd=new AdminChooseClass();
        bd.setVisible(true);
        AdminUpdateClass.this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
         jTextFieldId.setText(null);
        jTextFieldDld.setText(null);
        jTextFieldAccounting.setText(null);
        jTextFieldMath.setText(null);
        jTextFieldJava.setText(null);
        jTextFieldElectronics.setText(null);
        jTextFieldStasitics.setText(null);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUpdateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUpdateClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldAccounting;
    private javax.swing.JTextField jTextFieldDld;
    private javax.swing.JTextField jTextFieldElectronics;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldJava;
    private javax.swing.JTextField jTextFieldMath;
    private javax.swing.JTextField jTextFieldStasitics;
    // End of variables declaration//GEN-END:variables
}
