/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.o.puebla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Screen2_Register extends javax.swing.JFrame {

    /**
     * Creates new form Register2
     */
    
    Connection con;
     //Crea conección con la base de datos.
    
    public Screen2_Register() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 204, 204));
        //Establecer el color de fondo a uno gris.
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        TfUser = new javax.swing.JTextField();
        TfName = new javax.swing.JTextField();
        TfEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TfPass = new javax.swing.JTextField();
        TfPass2 = new javax.swing.JTextField();
        Button_Register = new javax.swing.JButton();
        Button_Return = new javax.swing.JButton();
        RbAtleta = new javax.swing.JRadioButton();
        RbEntrenador = new javax.swing.JRadioButton();
        RbOtro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TfName.setForeground(new java.awt.Color(51, 51, 51));
        TfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TfNameFocusGained(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Usuario");

        jLabel3.setText("E-mail");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Contraseña");

        Button_Register.setBackground(new java.awt.Color(255, 255, 255));
        Button_Register.setText("Registrarse");
        Button_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegisterActionPerformed(evt);
            }
        });

        Button_Return.setBackground(new java.awt.Color(255, 255, 255));
        Button_Return.setText("Regresar");
        Button_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ReturnActionPerformed(evt);
            }
        });

        Grupo1.add(RbAtleta);
        RbAtleta.setText("Atleta");

        Grupo1.add(RbEntrenador);
        RbEntrenador.setText("Entrenador");

        Grupo1.add(RbOtro);
        RbOtro.setText("Otro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfPass2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_Return)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Register))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RbAtleta)
                        .addComponent(RbEntrenador)
                        .addComponent(RbOtro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TfPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(RbAtleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RbEntrenador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RbOtro)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Return)
                    .addComponent(Button_Register))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RegisterActionPerformed
        
        String npassword1,npassword2;
        //Crear 2 variables de contraseña para su verificación. 
       
        npassword1=TfPass.getText();
        npassword2=TfPass2.getText();
        //Recuperar la información de sus cajas de texto. 
        
        
        String tipo;
        //Almacenar la información del tipo de usuario.
        if (RbAtleta.isSelected()){
            tipo="Atleta";
        } if (RbEntrenador.isSelected()){
            tipo="Entrenador";
        } else {
            tipo="Otro";
        }
        //Dependiendo de que radiobox se seleccionó, guardar el tipo.
        
        if (Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", TfEmail.getText())){ 
            //En caso de que haya una secuencia de terminos, seguida de arroba, terminos, punto, y terminos en la caja de Email, continuar el resto de la verificacion. 
            
            if (npassword1.equals(npassword2)){
                    //Si ambas contraseñas coiniciden, registrar al usuario y abrir ventana de menu.
        
                    try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost/sopueblausers","root","admin26");
                    //Conexión a la a base de datos "sopueblausers", con usuario "root", y contraseña "admin26". 
        
                    Statement stmt = con.createStatement();
                    //Un "statement" es la interfaz que representa una función en la base de datos SQL, en esta caso crear una nueva fila.   
        
                    stmt.executeUpdate("INSERT INTO usuarios VALUES('"+TfName.getText()+"','"+TfUser.getText()+"','"+TfEmail.getText()+"','"+TfPass.getText()+"','"+tipo+"')");
                    //Insertar en la base de datos "usuarios" los valores obtenidos de las cajas de texto correspondientes a Nombre, Usuario, Email, y Contraseña.
        
                    } catch (SQLException ex) {
                    Logger.getLogger(Screen2_Register.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "No se conectó con la librería SQL.");
                }
        //Valida que se conectó a la base de datos "usuarios". Si no, mostrar un mensaje.  
            
        JOptionPane.showMessageDialog(this, "Usuario registrado.");
        //Notifica al usuario del éxito de la operación.
         
            Screen3_Menu Ventana;
            Ventana=new Screen3_Menu();
            Ventana.setVisible(true);
            dispose();
        //Cierra ventana y entra al menú principal.
        
        } else {
          JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
          //En caso de que las contraseñas no coincidan, notificar al usuario del error. 
        } 
        } else {
          JOptionPane.showMessageDialog(null, "Ingrese un email válido.", "Error", JOptionPane.ERROR_MESSAGE);
          //En caso de que no se cumpla el patrón de un email, notificar al usuario del error. <<
        }
        
    }//GEN-LAST:event_Button_RegisterActionPerformed

    private void Button_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ReturnActionPerformed

        Screen1_Login Ventana;
            Ventana=new Screen1_Login();
            Ventana.setVisible(true);
            dispose();
        //Regresar a la ventana de login. 
          
    }//GEN-LAST:event_Button_ReturnActionPerformed

    private void TfNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TfNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNameFocusGained

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
            java.util.logging.Logger.getLogger(Screen2_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen2_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen2_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen2_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen2_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Register;
    private javax.swing.JButton Button_Return;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JRadioButton RbAtleta;
    private javax.swing.JRadioButton RbEntrenador;
    private javax.swing.JRadioButton RbOtro;
    private javax.swing.JTextField TfEmail;
    private javax.swing.JTextField TfName;
    private javax.swing.JTextField TfPass;
    private javax.swing.JTextField TfPass2;
    private javax.swing.JTextField TfUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
