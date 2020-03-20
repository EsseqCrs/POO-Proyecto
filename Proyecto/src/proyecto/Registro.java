/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Registro extends javax.swing.JFrame {


    BD bd;
    
    public Registro(BD f) {
        bd=f;
        initComponents();
        setLocationRelativeTo(null);  
        validacion1.setVisible(false);
        validacion2.setVisible(false);
        validacion3.setVisible(false);
        validacion4.setVisible(false);
        validacion5.setVisible(false);
        validacion6.setVisible(false);
        validacion7.setVisible(false);
    }

    int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0;

    public void Validar(){
        if(txtUsuario.getText().equals("")){validacion1.setVisible(true);cont1++;} else{validacion1.setVisible(false);}
        if(txtNombre.getText().equals("")){validacion2.setVisible(true);cont2++;} else{validacion2.setVisible(false);}
        if(txtApellido.getText().equals("")){validacion3.setVisible(true);cont3++;} else{validacion3.setVisible(false);}
        if(txtEdad.getText().equals("")){validacion4.setVisible(true);cont4++;} else{validacion4.setVisible(false);}
        //if(txtNombre.getText().equals("")){validacion5.setVisible(true);cont5++;} else{validacion5.setVisible(false);}
        if(txtEmail.getText().equals("")){validacion6.setVisible(true);cont6++;} else{validacion6.setVisible(false);}
        if(txtPass.getText().equals("")){validacion7.setVisible(true);cont7++;} else{validacion7.setVisible(false);}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoGroup = new javax.swing.ButtonGroup();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtPass = new javax.swing.JPasswordField();
        buttonRegisterBack = new javax.swing.JButton();
        buttonRegisterConfirm = new javax.swing.JButton();
        validacion1 = new javax.swing.JLabel();
        validacion2 = new javax.swing.JLabel();
        validacion3 = new javax.swing.JLabel();
        validacion4 = new javax.swing.JLabel();
        validacion5 = new javax.swing.JLabel();
        validacion6 = new javax.swing.JLabel();
        validacion7 = new javax.swing.JLabel();
        fondoRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 240, 30));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 240, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 240, 30));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 240, 30));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 240, 30));

        sexoGroup.add(jRadioButton1);
        jRadioButton1.setText("Mujer");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        sexoGroup.add(jRadioButton2);
        jRadioButton2.setText("Hombre");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 240, 30));

        buttonRegisterBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonRegisterBack.setText("REGRESAR");
        buttonRegisterBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterBackActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegisterBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 180, 40));

        buttonRegisterConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonRegisterConfirm.setText("CONFIRMAR");
        buttonRegisterConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegisterConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 180, 40));

        validacion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion1.setForeground(new java.awt.Color(255, 255, 255));
        validacion1.setText("Campo Requerido");
        getContentPane().add(validacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        validacion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion2.setForeground(new java.awt.Color(255, 255, 255));
        validacion2.setText("Campo Requerido");
        getContentPane().add(validacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        validacion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion3.setForeground(new java.awt.Color(255, 255, 255));
        validacion3.setText("Campo Requerido");
        getContentPane().add(validacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        validacion4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion4.setForeground(new java.awt.Color(255, 255, 255));
        validacion4.setText("Campo Requerido");
        getContentPane().add(validacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        validacion5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion5.setForeground(new java.awt.Color(255, 255, 255));
        validacion5.setText("Campo Requerido");
        getContentPane().add(validacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        validacion6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion6.setForeground(new java.awt.Color(255, 255, 255));
        validacion6.setText("Campo Requerido");
        getContentPane().add(validacion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        validacion7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion7.setForeground(new java.awt.Color(255, 255, 255));
        validacion7.setText("Campo Requerido");
        getContentPane().add(validacion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, -1));

        fondoRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Registro.png"))); // NOI18N
        getContentPane().add(fondoRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegisterConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterConfirmActionPerformed
        if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtEdad.getText().isEmpty() || txtEmail.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtPass.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
            Validar();
        }else{
            try {
                //ARREGLAR ID
                Usuario user1 = new Usuario();
                user1.setUser(txtUsuario.getText());
                user1.setNombre(txtNombre.getText());
                user1.setApellido(txtApellido.getText());
                user1.setEdad(Integer.parseInt(txtEdad.getText()));
                //sexo
                user1.setEmail(txtEmail.getText());
                user1.setPass(txtPass.getText());
                if (user1.save()){
                    JOptionPane.showMessageDialog(this, "Perfil Creado Correctamente");
                    txtUsuario.setText(" ");
                    txtNombre.setText(" ");
                    txtApellido.setText(" ");
                    txtEdad.setText(" ");
                    txtEmail.setText(" ");
                    txtPass.setText(" ");
                    txtUsuario.requestFocus();
                }
            } catch (IOException ex) {
                System.out.println("Error: "+ex.getLocalizedMessage());
            }
            Login ventana = new Login(bd);
            ventana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonRegisterConfirmActionPerformed

    private void buttonRegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterBackActionPerformed
        Login ventana2 = new Login(bd);
        ventana2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonRegisterBackActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registro(bd).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegisterBack;
    private javax.swing.JButton buttonRegisterConfirm;
    private javax.swing.JLabel fondoRegister;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.ButtonGroup sexoGroup;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel validacion1;
    private javax.swing.JLabel validacion2;
    private javax.swing.JLabel validacion3;
    private javax.swing.JLabel validacion4;
    private javax.swing.JLabel validacion5;
    private javax.swing.JLabel validacion6;
    private javax.swing.JLabel validacion7;
    // End of variables declaration//GEN-END:variables
}
