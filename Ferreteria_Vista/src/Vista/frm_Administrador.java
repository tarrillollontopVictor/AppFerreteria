package Vista;

import Modelo.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frm_Administrador extends javax.swing.JFrame {


    public frm_Administrador() {
        initComponents();
        
        this.setLocationRelativeTo(null); //centrar en pantalla
        this.setResizable(false);//bloquear el maximizar
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnIniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtContraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnSalir.setBackground(new java.awt.Color(0, 0, 0));
        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir a ventana.png"))); // NOI18N
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenid@");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 350, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIE SESIÓN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, 20));

        jbtnIniciar.setBackground(new java.awt.Color(153, 255, 204));
        jbtnIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Inicio de sesion.png"))); // NOI18N
        jbtnIniciar.setText("INICAR");
        jbtnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 160, 70));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("@2023-2 by Grupo 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 350, 30));

        jtxtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jtxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 240, 60));

        jtxtContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTRASEÑA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jtxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtContraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(jtxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 460));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Imagen Inicio.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 460));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String Usuario = jtxtUsuario.getText();
        String Contraseña = jtxtContraseña.getText();
        
        if(Usuario.isEmpty()) JOptionPane.showMessageDialog(null, "Usuario esta vacio");
        else if(Contraseña.isEmpty()) JOptionPane.showMessageDialog(null, "Contraseña esta vacio");
        else {
            
            String url = "SELECT * FROM USUARIOS WHERE Usuario = '"+Usuario+"';";
            
            try {
                Connection con = Conexion.getInstance().getCon();
                PreparedStatement ps = con.prepareStatement(url);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    String u = rs.getString("Usuario");
                    String p = rs.getString("Contraseña");
                    
                    if (Contraseña.equals(p)) {
                        JOptionPane.showMessageDialog(null,"Bienvenido Estimado "+Usuario);
                        new frm_VentanaPrincipal().setVisible(true);
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "La contraseña no es correcta");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario no existe en la Base de Datos");
                }
                
            }catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            
        }
        
        }
        
    }//GEN-LAST:event_jtxtUsuarioKeyPressed

    private void jtxtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtContraseñaKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String Usuario = jtxtUsuario.getText();
        String Contraseña = jtxtContraseña.getText();
        
        if(Usuario.isEmpty()) JOptionPane.showMessageDialog(null, "Usuario esta vacio");
        else if(Contraseña.isEmpty()) JOptionPane.showMessageDialog(null, "Contraseña esta vacio");
        else {
            
            String url = "SELECT * FROM USUARIOS WHERE Usuario = '"+Usuario+"';";
            
            try {
                Connection con =Conexion.getInstance().getCon();
                PreparedStatement ps = con.prepareStatement(url);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    String u = rs.getString("Usuario");
                    String p = rs.getString("Contraseña");
                    
                    if (Contraseña.equals(p)) {
                        JOptionPane.showMessageDialog(null,"Bienvenido Estimado "+Usuario);
                        new frm_VentanaPrincipal().setVisible(true);
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "La contraseña no es correcta");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario no existe en la Base de Datos");
                }
                
            }catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            
        }
        
        }
        
    }//GEN-LAST:event_jtxtContraseñaKeyPressed

    private void jbtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarActionPerformed
        
        
        // agregar metodo de validacion
        String Usuario = jtxtUsuario.getText();
        String Contraseña = jtxtContraseña.getText();
        
        if(Usuario.isEmpty()) JOptionPane.showMessageDialog(null, "Usuario esta vacio");
        else if(Contraseña.isEmpty()) JOptionPane.showMessageDialog(null, "Contraseña esta vacio");
        else {
            
            String url = "SELECT * FROM USUARIOS WHERE Usuario = '"+Usuario+"';";
            
            try {
                Connection con = Conexion.getInstance().getCon();
                PreparedStatement ps = con.prepareStatement(url);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    String u = rs.getString("Usuario");
                    String p = rs.getString("Contraseña");
                    
                    if (Contraseña.equals(p)) {
                        JOptionPane.showMessageDialog(null,"Bienvenido Estimado "+Usuario);
                        new frm_VentanaPrincipal().setVisible(true);
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "La contraseña no es correcta");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario no existe en la Base de Datos");
                }
                
            }catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            
        }
        
    }//GEN-LAST:event_jbtnIniciarActionPerformed

    private void jPanel1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentMoved

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed

        new frm_Inicio().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnIniciar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JPasswordField jtxtContraseña;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
