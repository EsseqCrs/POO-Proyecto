/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {
    
    BD bd;
    
    public Login(BD f) {
 
        bd=f;
        initComponents();
        setLocationRelativeTo(null);
        validacion1.setVisible(false);
        validacion2.setVisible(false);

    }

    int cont1=0, cont2=0;
    
 public void Validar(){
        if(txtPass.getText().equals("")){validacion1.setVisible(true);cont1++;} else{validacion1.setVisible(false);}
        if(txtUser.getText().equals("")){validacion2.setVisible(true);cont2++;} else{validacion2.setVisible(false);}
 
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        buttonEntrar = new javax.swing.JButton();
        buttonEntrar1 = new javax.swing.JButton();
        validacion2 = new javax.swing.JLabel();
        validacion1 = new javax.swing.JLabel();
        fondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 310, 50));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 310, 50));

        buttonEntrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonEntrar.setText("ENTRAR");
        buttonEntrar.setToolTipText("");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 130, 50));

        buttonEntrar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonEntrar1.setText("REGISTRATE");
        buttonEntrar1.setToolTipText("");
        buttonEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 190, 50));

        validacion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion2.setForeground(new java.awt.Color(255, 255, 255));
        validacion2.setText("Campo Requerido");
        getContentPane().add(validacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        validacion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion1.setForeground(new java.awt.Color(255, 255, 255));
        validacion1.setText("Campo Requerido");
        getContentPane().add(validacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Login.png"))); // NOI18N
        getContentPane().add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrar1ActionPerformed
        Registro ventana = new Registro(bd);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonEntrar1ActionPerformed

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        
        if(txtUser.getText().isEmpty() || txtPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
            Validar();
        }else{
            Usuario admin = bd.Login(txtUser.getText(), txtPass.getText());
            Menu menu = new Menu(bd);
            Admin adminroot = new Admin(bd);

            if(admin==null){
                    System.out.println("FALLO");
                    JOptionPane.showMessageDialog(this, "USUARIO O CONTRASEÑA INCORRECTA");
             }else{
                if( admin.getUser().equals("admin")){
                    adminroot.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "ADMINISTRADOR");
                    System.out.println("BIEN");
             }else{ menu.setVisible(true);
                    System.out.println("BIEN, PERO NO ES ADMIN");
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "INICIO DE SESION SATISFACTORIO");
                }
            }
        }
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[],BD f) {
////        bd = f;
////        
////        /* Set the Nimbus look and feel */
////        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
////        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
////         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
////         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
////        //</editor-fold>
////
////        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new Login().setVisible(true);
////            }
////        });
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JButton buttonEntrar1;
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel validacion1;
    private javax.swing.JLabel validacion2;
    // End of variables declaration//GEN-END:variables
}   
