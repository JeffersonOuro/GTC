import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class telacadastro extends javax.swing.JFrame {

         public Connection con;
         public Statement st ;
         public ResultSet resultado = null;
         
    public telacadastro() {
        initComponents();
        try{
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gtc","root","");
          st = (Statement)  con.createStatement();
          JOptionPane.showMessageDialog(null," conectado com sucesso ");
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(null," falhou...  ");
      }     
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        GTC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cpf = new javax.swing.JLabel();
        campocpf = new javax.swing.JFormattedTextField();
        nomesocial = new javax.swing.JLabel();
        camposocial = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        campoemail = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        campotel = new javax.swing.JFormattedTextField();
        senha = new javax.swing.JLabel();
        camposenha = new javax.swing.JPasswordField();
        codigoservico = new javax.swing.JLabel();
        camposer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GTC.setBackground(new java.awt.Color(255, 255, 255));
        GTC.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        GTC.setForeground(new java.awt.Color(102, 102, 0));
        GTC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GTC.setText("Golden Tecnology Corporation");
        GTC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GTC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpf.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        cpf.setForeground(new java.awt.Color(255, 255, 255));
        cpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpf.setText("CPF/CNPJ*");
        jPanel1.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        campocpf.setBackground(new java.awt.Color(255, 255, 255));
        campocpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campocpf.setForeground(new java.awt.Color(0, 0, 0));
        campocpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocpfActionPerformed(evt);
            }
        });
        jPanel1.add(campocpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 20));

        nomesocial.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        nomesocial.setForeground(new java.awt.Color(255, 255, 255));
        nomesocial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomesocial.setText("Nome/Razão Social*");
        jPanel1.add(nomesocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 20));

        camposocial.setBackground(new java.awt.Color(255, 255, 255));
        camposocial.setForeground(new java.awt.Color(0, 0, 0));
        camposocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        camposocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposocialActionPerformed(evt);
            }
        });
        jPanel1.add(camposocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 20));

        email.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("E-mail*");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, 20));

        campoemail.setBackground(new java.awt.Color(255, 255, 255));
        campoemail.setForeground(new java.awt.Color(0, 0, 0));
        campoemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoemailActionPerformed(evt);
            }
        });
        jPanel1.add(campoemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 20));

        Telefone.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        Telefone.setForeground(new java.awt.Color(255, 255, 255));
        Telefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Telefone.setText("Telefone*");
        jPanel1.add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 20));

        campotel.setBackground(new java.awt.Color(255, 255, 255));
        campotel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campotel.setForeground(new java.awt.Color(0, 0, 0));
        campotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotelActionPerformed(evt);
            }
        });
        jPanel1.add(campotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 280, 20));

        senha.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senha.setText("Senha*");
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 20));

        camposenha.setBackground(new java.awt.Color(255, 255, 255));
        camposenha.setForeground(new java.awt.Color(0, 0, 0));
        camposenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        camposenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposenhaActionPerformed(evt);
            }
        });
        jPanel1.add(camposenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 20));

        codigoservico.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        codigoservico.setForeground(new java.awt.Color(255, 255, 255));
        codigoservico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoservico.setText("Codigo de Serviço*");
        jPanel1.add(codigoservico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, 20));

        camposer.setBackground(new java.awt.Color(255, 255, 255));
        camposer.setForeground(new java.awt.Color(0, 0, 0));
        camposer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        camposer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposerActionPerformed(evt);
            }
        });
        jPanel1.add(camposer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cadastrar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 130, 20));

        voltar.setBackground(new java.awt.Color(255, 255, 255));
        voltar.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        voltar.setForeground(new java.awt.Color(0, 0, 0));
        voltar.setText("Voltar - Tela  Principal");
        voltar.setBorder(null);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 130, 20));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serviços", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dubai", 3, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Help Desk - ( 1 )");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Educacionais T.I ( 5 )");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pesquisa e desenvolvimento ( 4 )");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manutenção de plataforma ( 2 )");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestão T.I ( 3 )");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 280, 130));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 300, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KC-Sales-Technology-resized-600.jpg.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campocpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocpfActionPerformed

    private void camposocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camposocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camposocialActionPerformed

    private void campoemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoemailActionPerformed

    private void campotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotelActionPerformed

    private void camposenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camposenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camposenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // salvar ou cadastrar 
        try{
          
          String cpf = campocpf.getText();
          String nome = camposocial.getText();
          String email = campoemail.getText();
          String celular = campotel.getText();
          String senha = camposenha.getText();
          String servicos = camposer.getText();
                  
          String sqlsalvar ="insert into clientes values('"
                  +cpf+"','"
                  +nome+"','"
                  +email+"','"
                  +celular+"','"
                  +senha+"',"
                  +servicos+");";
                  
          
          st.executeUpdate(sqlsalvar);
          JOptionPane.showMessageDialog(null," Salvo ");
          
         /* camposocial.setText("");
          campocpf.setText("");
          campoemail.setText("");
          campotel.setText("");
          camposenha.setText("");*/
         // new telaprincipal().setVisible(true);
         //dispose();
       }
       catch(Exception e ){
        JOptionPane.showMessageDialog(null," Erro ");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        //Botão
        new telaprincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void camposerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camposerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camposerActionPerformed

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
            java.util.logging.Logger.getLogger(telacadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telacadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telacadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telacadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telacadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GTC;
    private javax.swing.JLabel Telefone;
    private javax.swing.JFormattedTextField campocpf;
    private javax.swing.JTextField campoemail;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JTextField camposer;
    private javax.swing.JTextField camposocial;
    private javax.swing.JFormattedTextField campotel;
    private javax.swing.JLabel codigoservico;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomesocial;
    private javax.swing.JLabel senha;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
