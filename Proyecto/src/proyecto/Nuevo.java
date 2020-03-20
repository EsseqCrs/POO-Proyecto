/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Nuevo extends javax.swing.JFrame {

   BD bd;
   
    public Nuevo(BD f) {
        bd=f;
        initComponents();
        setLocationRelativeTo(null); 
        validacion1.setVisible(false);
        validacion2.setVisible(false);
        validacion3.setVisible(false);
        //validacion4.setVisible(false);
        validacion5.setVisible(false);
        validacion6.setVisible(false);
    }

    int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0;
    
    public void Validar(){
        if(txtTitulo.getText().equals("")){validacion1.setVisible(true);cont1++;} else{validacion1.setVisible(false);}
        if(txtDirector.getText().equals("")){validacion2.setVisible(true);cont2++;} else{validacion2.setVisible(false);}
        if(txtGenero.getText().equals("")){validacion3.setVisible(true);cont3++;} else{validacion3.setVisible(false);}
        //if(txt.getText().equals("")){validacion4.setVisible(true);cont4++;} else{validacion4.setVisible(false);}
        if(txtPrecio.getText().equals("")){validacion5.setVisible(true);cont5++;} else{validacion5.setVisible(false);}
        if(txtInventario.getText().equals("")){validacion6.setVisible(true);cont6++;} else{validacion6.setVisible(false);}

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        txtInventario = new javax.swing.JTextField();
        buttonAceptar = new javax.swing.JButton();
        buttonRegresar = new javax.swing.JButton();
        validacion2 = new javax.swing.JLabel();
        validacion3 = new javax.swing.JLabel();
        validacion5 = new javax.swing.JLabel();
        validacion6 = new javax.swing.JLabel();
        validacion1 = new javax.swing.JLabel();
        fondoNuevo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 240, 30));

        txtDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirectorActionPerformed(evt);
            }
        });
        getContentPane().add(txtDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 240, 30));
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 240, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AA", "A", "B", "B15", "C", "D" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 90, 30));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 240, 30));
        getContentPane().add(txtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 240, 30));

        buttonAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonAceptar.setText("Confirmar");
        buttonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 160, 40));

        buttonRegresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonRegresar.setText("Regresar");
        buttonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 160, 40));

        validacion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion2.setForeground(new java.awt.Color(240, 240, 240));
        validacion2.setText("Campo Requerido");
        getContentPane().add(validacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        validacion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion3.setForeground(new java.awt.Color(240, 240, 240));
        validacion3.setText("Campo Requerido");
        getContentPane().add(validacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        validacion5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion5.setForeground(new java.awt.Color(240, 240, 240));
        validacion5.setText("Campo Requerido");
        getContentPane().add(validacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));

        validacion6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion6.setForeground(new java.awt.Color(240, 240, 240));
        validacion6.setText("Campo Requerido");
        getContentPane().add(validacion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        validacion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validacion1.setForeground(new java.awt.Color(240, 240, 240));
        validacion1.setText("Campo Requerido");
        getContentPane().add(validacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        fondoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Nuevo.png"))); // NOI18N
        getContentPane().add(fondoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirectorActionPerformed

    private void buttonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptarActionPerformed
        
        if(txtTitulo.getText().isEmpty() || txtDirector.getText().isEmpty() || txtGenero.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtInventario.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
            Validar();
        }else{
            try {
                Pelicula peli1 = new Pelicula();
                peli1.setTitulo(txtTitulo.getText());
                peli1.setDirector(txtDirector.getText());
                peli1.setGenero(txtGenero.getText());
                //CLASIFICACION
                peli1.setPrecio(Integer.parseInt(txtPrecio.getText()));
                peli1.setStock(Integer.parseInt(txtInventario.getText()));
                if (peli1.save()){
                        JOptionPane.showMessageDialog(this, "Pelicula guardada exitosamente");
                        txtTitulo.setText(" ");
                        txtDirector.setText(" ");
                        txtGenero.setText(" ");
                        txtPrecio.setText(" ");
                        txtInventario.setText(" ");
                        txtTitulo.requestFocus();
                    }
            } catch (IOException ex) {
                System.out.println("Error: "+ex.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_buttonAceptarActionPerformed

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed
        Admin ventana = new Admin(bd);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonRegresarActionPerformed

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
//            java.util.logging.Logger.getLogger(Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Nuevo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAceptar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel fondoNuevo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtInventario;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JLabel validacion1;
    private javax.swing.JLabel validacion2;
    private javax.swing.JLabel validacion3;
    private javax.swing.JLabel validacion5;
    private javax.swing.JLabel validacion6;
    // End of variables declaration//GEN-END:variables
}
