/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INF;

/**
 *
 * @author ktec
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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
        jPanel1 = new javax.swing.JPanel();
        btnOrderD = new javax.swing.JButton();
        btnSearchrCm = new javax.swing.JButton();
        btnSearchrPh = new javax.swing.JButton();
        btnRegisterCm1 = new javax.swing.JButton();
        btnRegisterPh1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btmExit1 = new javax.swing.JButton();
        icon3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("WELCOME TO GOOD HEALTH COOPORATION!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 650, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrderD.setBackground(new java.awt.Color(255, 204, 204));
        btnOrderD.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnOrderD.setText("ORDERS AND DRUGS DETAILS");
        btnOrderD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrderD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 480, 50));

        btnSearchrCm.setBackground(new java.awt.Color(255, 204, 204));
        btnSearchrCm.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnSearchrCm.setText("SEARCH A COMPANY ");
        btnSearchrCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchrCmActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchrCm, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 230, 50));

        btnSearchrPh.setBackground(new java.awt.Color(255, 204, 204));
        btnSearchrPh.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnSearchrPh.setText("SEARCH  A PHARMACY");
        btnSearchrPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchrPhActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchrPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 230, 50));

        btnRegisterCm1.setBackground(new java.awt.Color(255, 204, 204));
        btnRegisterCm1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnRegisterCm1.setText("REGISTER A NEW COMPANY ");
        btnRegisterCm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCm1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisterCm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 240, 50));

        btnRegisterPh1.setBackground(new java.awt.Color(255, 204, 204));
        btnRegisterPh1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnRegisterPh1.setText("REGISTER A NEW PHARMACY");
        btnRegisterPh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPh1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisterPh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 250, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ktec\\Documents\\NetBeansProjects\\GOOD HEALTH COOPORATION PHMS\\src\\INF\\maxresdefault.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 790, 240));

        btmExit1.setBackground(new java.awt.Color(255, 255, 204));
        btmExit1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btmExit1.setText("EXIT");
        getContentPane().add(btmExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 150, 40));

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/INF/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 510));

        setSize(new java.awt.Dimension(857, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterPh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPh1ActionPerformed
        RegisterPharmacyOrSearch rpos = new RegisterPharmacyOrSearch();
        rpos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterPh1ActionPerformed

    private void btnRegisterCm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCm1ActionPerformed
         RegisterCompaniiesOrSearch rcos = new RegisterCompaniiesOrSearch();
        rcos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterCm1ActionPerformed

    private void btnSearchrPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchrPhActionPerformed
        // TODO add your handling code here:
        RegisterPharmacyOrSearch rpos = new RegisterPharmacyOrSearch();
        rpos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSearchrPhActionPerformed

    private void btnSearchrCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchrCmActionPerformed
        // TODO add your handling code here:
        RegisterCompaniiesOrSearch rcos = new RegisterCompaniiesOrSearch();
        rcos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSearchrCmActionPerformed

    private void btnOrderDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDActionPerformed
        // TODO add your handling code here:
        Drugs O = new Drugs();
        O.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderDActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmExit1;
    private javax.swing.JButton btnOrderD;
    private javax.swing.JButton btnRegisterCm1;
    private javax.swing.JButton btnRegisterPh1;
    private javax.swing.JButton btnSearchrCm;
    private javax.swing.JButton btnSearchrPh;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
