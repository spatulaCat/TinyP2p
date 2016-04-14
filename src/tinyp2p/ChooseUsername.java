/*
 * The MIT License
 *
 * Copyright 2015 Nicky.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package tinyp2p;

import java.awt.Rectangle;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hive2hive.core.api.interfaces.IH2HNode;

/**
 *
 * @author Nicky
 */

public class ChooseUsername extends javax.swing.JFrame {

    private String username;
    private String password;
    private IH2HNode node;
    private String[] ips;
   // private PeerMapChangeListener pmc;
    
    public ChooseUsername() {
        initComponents();
    }
    
    public ChooseUsername(IH2HNode node, Rectangle bounds, String[] ips){
        this.ips = ips;
        this.node = node;
        initComponents();
        this.setBounds(bounds);
        this.setSize(340, 245);
        tinyButt.setOpaque(false);
        tinyButt.setContentAreaFilled(false); //to make the content area transparent
        tinyButt.setBorderPainted(false);
        //pmc = new PMListener();
        
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tinyButt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(340, 245));
        setMinimumSize(new java.awt.Dimension(340, 245));
        setPreferredSize(new java.awt.Dimension(344, 256));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel1.setText("TinyP2P");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setText("Choose a display name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jTextField1.setText("Username");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 115, -1));

        jButton1.setBackground(new java.awt.Color(255, 224, 193));
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 30));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 225, -1, -1));

        tinyButt.setBackground(new java.awt.Color(204, 255, 204));
        tinyButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tinyhelp.png"))); // NOI18N
        tinyButt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tinyButt.setPreferredSize(new java.awt.Dimension(33, 53));
        tinyButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinyButtActionPerformed(evt);
            }
        });
        getContentPane().add(tinyButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 40, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user=jTextField1.getText();
        String pwd = "123456"; 
    
        try {
            new MainMenu(user,pwd,node,this.getBounds(),ips).setVisible(true);
            this.dispose();
        } catch (IOException  ex) {
            Logger.getLogger(ChooseUsername.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tinyButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinyButtActionPerformed
        Help h = new Help(this.getBounds(),ips);
        h.setVisible(true);
    }//GEN-LAST:event_tinyButtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Random r = new Random();
       jTextField1.setText(Mnemonics.words[r.nextInt(255)]);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(ChooseUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseUsername().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton tinyButt;
    // End of variables declaration//GEN-END:variables

//class PMListener implements PeerMapChangeListener{
//
//    @Override
//    public void peerInserted(PeerAddress pa, boolean bln) {
//        System.out.println("user joined");
//      displayUsersWorker.execute();
//    }
//
//    @Override
//    public void peerRemoved(PeerAddress pa, PeerStatistic ps) {
//        System.out.println("user left");
//        displayUsersWorker.execute();
//    }
//
//    @Override
//    public void peerUpdated(PeerAddress pa, PeerStatistic ps) {
//        displayUsersWorker.execute();
//    }
//        SwingWorker displayUsersWorker = new SwingWorker<String, Void>() {
//        @Override
//        public String doInBackground() throws Exception {
//           lm = new DefaultListModel();    
//            online.setModel(lm);
//            try{  
//                peerMap = node.getPeer().peerBean().peerMap().all();
//             for (PeerAddress pa : peerMap){   
//                    FutureGet futureGet = node.getPeer().get(pa.peerId()).start();
//                    futureGet.awaitUninterruptibly();                   
//                    if (!futureGet.isEmpty()){
//                        try {          
//                            Object n = futureGet.data().object();
//                            lm.addElement(n);
//                            userIPs.putIfAbsent(n.toString(),pa.inetAddress().toString());
//
//                        } catch (ClassNotFoundException | IOException ex) {
//                        }
//                    }        
//             }
//            online.setModel(lm);
//            }catch(NullPointerException e){            
//            }  
//            
//            return null;
//        }
//     };
//}
//    };

}
