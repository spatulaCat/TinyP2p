/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinyp2p;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author (._.)
 */
public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */

    public Help() {
         initComponents();
    }
    
    public Help(Rectangle bounds, String[] ips) {
        initComponents();

        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        
        jScrollPane3.setOpaque(false);
        jScrollPane3.getViewport().setOpaque(false);
        jScrollPane3.setBorder(null);
        jScrollPane3.setViewportBorder(null);
        
        jScrollPane4.setOpaque(false);
        jScrollPane4.getViewport().setOpaque(false);
        jScrollPane4.setBorder(null);
        jScrollPane4.setViewportBorder(null);
        
        jTextPane1.setBorder(null);
        jTextPane1.setBackground(new Color(0, 0, 0, 0));
      
        jTextPane2.setBorder(null);
        jTextPane2.setBackground(new Color(0, 0, 0, 0));
        
        jTextPane3.setBorder(null);
        jTextPane3.setBackground(new Color(0, 0, 0, 0));
       
        this.setBounds(bounds);
        
        eip.setText(ips[0]);      
        emne.setText(Mnemonics.getMnemonics(ips[0]));
        iip.setText(ips[1]);
        imne.setText(Mnemonics.getMnemonics(ips[1]));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        emne = new javax.swing.JTextField();
        imne = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        iip = new javax.swing.JLabel();
        eip = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("LAN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 50, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("NAT");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, -1));

        jTextPane2.setEditable(false);
        jTextPane2.setBorder(null);
        jTextPane2.setText("You can still connect with peers on your local (LAN) network, even  if your internet connection is down. Just provide them with your internal mnemonic.");
        jTextPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 400, 60));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setText("Your TinyP2P Mnemonic is a 4-word key that make it easier to communicate your IP address to peers who want to join your TinyNet.\nIf you want to join a peer's TinyNet, you need their Mnemonic. However, real IP addresses work the same way in TinyP2P as a Mnemonic so feel free to use them if you wish. ");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 400, 110));

        jTextPane3.setEditable(false);
        jTextPane3.setBorder(null);
        jTextPane3.setText("Some routers do network address translation (NAT).  This means that your internal IP address may be different from the IP address that is seen by the world beyond your local network. If you are behind the same NAT router as your peer, you need to provide them with your internal IP address or TinyP2P mnemonic.\n");
        jTextPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 400, 110));

        jLabel3.setText("Internal Mnemonic:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 140, -1));

        jLabel5.setText("External Mnemonic:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 130, -1));

        jLabel7.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel7.setText("TinyP2P Help");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 29));

        jButton1.setBackground(new java.awt.Color(255, 224, 193));
        jButton1.setText("OK");
        jButton1.setMargin(new java.awt.Insets(1, 10, 1, 10));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        emne.setEditable(false);
        emne.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        emne.setText("jTextField2");
        emne.setPreferredSize(new java.awt.Dimension(59, 23));
        getContentPane().add(emne, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 130, -1));

        imne.setEditable(false);
        imne.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        imne.setText("jTextField4");
        imne.setPreferredSize(new java.awt.Dimension(59, 23));
        getContentPane().add(imne, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 130, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Mnemonics");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, -1));

        iip.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        iip.setText("jLabel6");
        getContentPane().add(iip, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 100, -1));

        eip.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        eip.setText("jLabel8");
        getContentPane().add(eip, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tiny5.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                new Help().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eip;
    private javax.swing.JTextField emne;
    private javax.swing.JLabel iip;
    private javax.swing.JTextField imne;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}
