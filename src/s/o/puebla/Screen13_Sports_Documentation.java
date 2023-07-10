/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.o.puebla;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Screen13_Sports_Documentation extends javax.swing.JFrame {

    /**
     * Creates new form SportGuides13
     */
    Connection con;
    
    public Screen13_Sports_Documentation() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 204, 204));

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton2 = new javax.swing.JButton();
        BBasquet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BFutbol = new javax.swing.JButton();
        BAtletismo = new javax.swing.JButton();
        BBochas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BBasquet.setBackground(new java.awt.Color(255, 255, 255));
        BBasquet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s/o/images/Basket_icon.png"))); // NOI18N
        BBasquet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBasquetActionPerformed(evt);
            }
        });

        jLabel1.setText("Fútbol");

        jLabel2.setText("Atletismo");

        jLabel3.setText("Bochas");

        jLabel5.setText("Básquetbol");

        BFutbol.setBackground(new java.awt.Color(255, 255, 255));
        BFutbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s/o/images/Soccer_icon.png"))); // NOI18N
        BFutbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFutbolActionPerformed(evt);
            }
        });

        BAtletismo.setBackground(new java.awt.Color(255, 255, 255));
        BAtletismo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s/o/images/Athletism_icon.png"))); // NOI18N
        BAtletismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtletismoActionPerformed(evt);
            }
        });

        BBochas.setBackground(new java.awt.Color(255, 255, 255));
        BBochas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s/o/images/Marbles_icon.png"))); // NOI18N
        BBochas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBochasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        jLabel6.setText("Reglamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BBochas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBasquet, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAtletismo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BAtletismo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBochas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBasquet, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)))
                .addGap(49, 49, 49)
                .addComponent(jButton2)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBasquetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBasquetActionPerformed
        // TODO add your handling code here:       
if (Desktop.isDesktopSupported()) {
            try {
            File f = new File("/Users/Jose/NetBeansProjects/S.O.Puebla/src/Files/ReglamentoBaloncesto.pdf");
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error con el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
      
    }//GEN-LAST:event_BBasquetActionPerformed

    private void BFutbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFutbolActionPerformed
        
        if (Desktop.isDesktopSupported()) {
            try {
            File f = new File("/Users/Jose/NetBeansProjects/S.O.Puebla/src/Files/ReglamentoFutbol.pdf");
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error con el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
        

    }//GEN-LAST:event_BFutbolActionPerformed

    private void BAtletismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtletismoActionPerformed
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
            try {
            File f = new File("/Users/Jose/NetBeansProjects/S.O.Puebla/src/Files/ReglamentoAtletismo.pdf");
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error con el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_BAtletismoActionPerformed

    private void BBochasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBochasActionPerformed
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
            try {
            File f = new File("/Users/Jose/NetBeansProjects/S.O.Puebla/src/Files/ReglamentoBochas.pdf");
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error con el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_BBochasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Screen6_Sports Ventana;
            Ventana=new Screen6_Sports();
            Ventana.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen13_Sports_Documentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen13_Sports_Documentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen13_Sports_Documentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen13_Sports_Documentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen13_Sports_Documentation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAtletismo;
    private javax.swing.JButton BBasquet;
    private javax.swing.JButton BBochas;
    private javax.swing.JButton BFutbol;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}