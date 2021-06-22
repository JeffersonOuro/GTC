
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import static javax.swing.Spring.height;
import javax.swing.JOptionPane;


public class telalogin extends javax.swing.JFrame {
public Connection icon;
   
        public telalogin() {
        initComponents();
  
   
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GTC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        campologin = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        camposenha = new javax.swing.JPasswordField();
        administrador = new javax.swing.JCheckBox();
        cliente = new javax.swing.JCheckBox();
        entrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GTC.setBackground(new java.awt.Color(255, 255, 255));
        GTC.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        GTC.setForeground(new java.awt.Color(102, 102, 0));
        GTC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GTC.setText("Golden Tecnology Corporation");
        GTC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GTC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(GTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrar no Sistema", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dubai", 3, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, -1));

        campologin.setBackground(new java.awt.Color(255, 255, 255));
        campologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campologinActionPerformed(evt);
            }
        });
        jPanel1.add(campologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, -1));

        senha.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("Senha");
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 20));

        camposenha.setBackground(new java.awt.Color(255, 255, 255));
        camposenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposenhaActionPerformed(evt);
            }
        });
        jPanel1.add(camposenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, -1));

        administrador.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        administrador.setForeground(new java.awt.Color(255, 255, 255));
        administrador.setText("Administrador");
        administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradorActionPerformed(evt);
            }
        });
        jPanel1.add(administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 120, 110, -1));

        cliente.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        cliente.setForeground(new java.awt.Color(255, 255, 255));
        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, -1));

        entrar.setBackground(new java.awt.Color(255, 255, 255));
        entrar.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        entrar.setForeground(new java.awt.Color(0, 0, 0));
        entrar.setText("Entrar");
        entrar.setBorder(null);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 91, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 300, 200));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KC-Sales-Technology-resized-600.jpg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campologinActionPerformed
        
    }//GEN-LAST:event_campologinActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        //Botão entrar
        String Login = campologin.getText();
        String Senha = new String (camposenha.getPassword());
        
        if((login == null || Login.isEmpty())
               || Senha.isEmpty()){
        JOptionPane.showMessageDialog(this, "Informe login e senha", "Dados Inválidos",JOptionPane.ERROR_MESSAGE);
        }else{
            
            //login -> admin
            //Senha -> 123
        }
        
    }//GEN-LAST:event_entrarActionPerformed

    private void camposenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camposenhaActionPerformed
        // 
    }//GEN-LAST:event_camposenhaActionPerformed

    private void administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradorActionPerformed
       
        telaadm Tela = new telaadm();
        Tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_administradorActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
      
        
        new telacliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telalogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GTC;
    private javax.swing.JCheckBox administrador;
    private javax.swing.JTextField campologin;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JCheckBox cliente;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel senha;
    // End of variables declaration//GEN-END:variables
}
