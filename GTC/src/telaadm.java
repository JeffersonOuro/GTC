import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class telaadm extends javax.swing.JFrame {

         public Connection con;
         public Statement st ;
         public ResultSet resultado = null;
         
    public telaadm() {
        initComponents();
         try{
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gtc","root","");
          st = (Statement)  con.createStatement();
          //JOptionPane.showMessageDialog(null," conectado com sucesso ");
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(null," falhou ERROR banco de dados  ");
      }     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Caracteres = new javax.swing.JPanel();
        cpf = new javax.swing.JLabel();
        campocpf = new javax.swing.JFormattedTextField();
        nomecnpj = new javax.swing.JLabel();
        camposocial = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        campoemail = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        campotel = new javax.swing.JFormattedTextField();
        senha = new javax.swing.JLabel();
        camposenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        camposer = new javax.swing.JTextField();
        Fundo = new javax.swing.JPanel();
        GTC = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Administrador");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Caracteres.setBackground(new java.awt.Color(0, 0, 0));
        Caracteres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Caracteres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpf.setFont(new java.awt.Font("Dubai", 3, 14)); // NOI18N
        cpf.setForeground(new java.awt.Color(255, 255, 255));
        cpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpf.setText("CPF/CNPJ*");
        Caracteres.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 20));

        campocpf.setBackground(new java.awt.Color(255, 255, 255));
        campocpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campocpf.setForeground(new java.awt.Color(0, 0, 0));
        campocpf.setCaretColor(new java.awt.Color(102, 102, 102));
        campocpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocpfActionPerformed(evt);
            }
        });
        Caracteres.add(campocpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 20));

        nomecnpj.setFont(new java.awt.Font("Dubai", 3, 14)); // NOI18N
        nomecnpj.setForeground(new java.awt.Color(255, 255, 255));
        nomecnpj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomecnpj.setText("Nome/Razão Social*");
        Caracteres.add(nomecnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 20));

        camposocial.setBackground(new java.awt.Color(255, 255, 255));
        camposocial.setForeground(new java.awt.Color(0, 0, 0));
        camposocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        camposocial.setCaretColor(new java.awt.Color(102, 102, 102));
        camposocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposocialActionPerformed(evt);
            }
        });
        Caracteres.add(camposocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 20));

        email.setFont(new java.awt.Font("Dubai", 3, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("E-mail*");
        Caracteres.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 20));

        campoemail.setBackground(new java.awt.Color(255, 255, 255));
        campoemail.setForeground(new java.awt.Color(0, 0, 0));
        campoemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoemail.setCaretColor(new java.awt.Color(102, 102, 102));
        campoemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoemailActionPerformed(evt);
            }
        });
        Caracteres.add(campoemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 20));

        Telefone.setFont(new java.awt.Font("Dubai", 3, 14)); // NOI18N
        Telefone.setForeground(new java.awt.Color(255, 255, 255));
        Telefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Telefone.setText("Telefone*");
        Caracteres.add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 20));

        campotel.setBackground(new java.awt.Color(255, 255, 255));
        campotel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campotel.setForeground(new java.awt.Color(0, 0, 0));
        campotel.setCaretColor(new java.awt.Color(102, 102, 102));
        campotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotelActionPerformed(evt);
            }
        });
        Caracteres.add(campotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 20));

        senha.setFont(new java.awt.Font("Dubai", 3, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senha.setText("Senha*");
        Caracteres.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, 20));

        camposenha.setBackground(new java.awt.Color(255, 255, 255));
        camposenha.setForeground(new java.awt.Color(0, 0, 0));
        camposenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        camposenha.setCaretColor(new java.awt.Color(102, 102, 102));
        camposenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposenhaActionPerformed(evt);
            }
        });
        Caracteres.add(camposenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Atualizar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Caracteres.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 69, 20));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Salvar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Caracteres.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 69, 20));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Limpar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Caracteres.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 69, 20));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Excluir");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Caracteres.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 69, 20));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Sair");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Caracteres.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 69, 20));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF/CNPJ", "Nome/Razão Social", "E-mail", "Telefone", "Senha", "serviços", "id servicos", "nome do Servicos", "descrição", "duração", "valor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Caracteres.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 630, 190));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Pesquisar");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Caracteres.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 90, 20));

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField8.setCaretColor(new java.awt.Color(102, 102, 102));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        Caracteres.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 220, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dubai", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesquisar cliente ");
        Caracteres.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 110, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Buscar Nome");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Caracteres.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 90, 20));

        jLabel2.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo Serviço");
        Caracteres.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        camposer.setBackground(new java.awt.Color(255, 255, 255));
        camposer.setForeground(new java.awt.Color(0, 0, 0));
        camposer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        camposer.setCaretColor(new java.awt.Color(102, 102, 102));
        Caracteres.add(camposer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 90, 20));

        getContentPane().add(Caracteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 960, 250));

        Fundo.setBackground(new java.awt.Color(255, 255, 255));
        Fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GTC.setBackground(new java.awt.Color(255, 255, 255));
        GTC.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        GTC.setForeground(new java.awt.Color(102, 102, 0));
        GTC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GTC.setText("Golden Tecnology Corporation");
        GTC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GTC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Fundo.add(GTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        img2.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KC-Sales-Technology-resized-600.jpg.png"))); // NOI18N
        img2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Fundo.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 960, 310));

        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 470));

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
        // atualizar
        try{
          String cpf = campocpf.getText();
          String nome = camposocial.getText();
          String email = campoemail.getText();
          String celular = campotel.getText();
          String senha = camposenha.getText();
          String servicos = camposer.getText();
          
          String sqlatualizar ="update clientes set nome ='"
                  +nome+"',email = '"
                  +email+"',celular = '"
                  +celular+"',senha = '"
                  +senha+"'servicos = "
                  +servicos+" where cpf ='"+cpf+"';";
                  
          
          st.executeUpdate(sqlatualizar);
          JOptionPane.showMessageDialog(null," Atualizado ");
          
          campocpf.setText("");
          campoemail.setText("");
          campotel.setText("");
          camposenha.setText("");
          camposocial.setText("");
          camposer.setText("");
          
       }
       catch(Exception e ){
          JOptionPane.showMessageDialog(null," nao Atualizou ");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // salvar
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
          
          campocpf.setText("");
          campoemail.setText("");
          campotel.setText("");
          camposenha.setText("");
       }
       catch(Exception e ){
        JOptionPane.showMessageDialog(null," Erro ");
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // limpar
          camposocial.setText("");
          campocpf.setText("");
          campoemail.setText("");
          campotel.setText("");
          camposenha.setText("");
          camposer.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       // excluir 
        String cpf = campocpf.getText();
        try{
          
          
          String sqlexcluir ="delete from clientes where cpf ="+cpf+";";
          st.executeUpdate(sqlexcluir);
          JOptionPane.showMessageDialog(null," excluido com sucesso ");
        }
       catch(Exception e ){
          JOptionPane.showMessageDialog(null," Erro de Exclusão ");
        }
          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // pesquisa
       
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Pesquisa
        try{
          
          
          String sqlipesquisar ="select * from clientes where cpf ="+jTextField8.getText()+";";
                
          
            resultado =  st.executeQuery(sqlipesquisar);
          
            if(resultado.next()){//posso fazer em while 
              JOptionPane.showMessageDialog(null," Encontrado ");
              campocpf.setText(resultado.getString("cpf"));
              camposocial.setText(resultado.getString("nome"));
              campoemail.setText(resultado.getString("email"));
              campotel.setText(resultado.getString("celular"));
              camposenha.setText(resultado.getString("senha"));
              camposer.setText(resultado.getString("senha"));
              
            }
                
           
            
        }
       catch(Exception e ){
          JOptionPane.showMessageDialog(null," cliente nao encontrado ");
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // tabela
        try{
            
          DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
          
          String sqlipesquisar ="select * from clientes join servicos as ser on clientes.servicos = ser.id where clientes.nome like'"+jTextField8.getText()+"%' order by nome ; ";
                
          resultado =  st.executeQuery(sqlipesquisar);
          
            while(resultado.next()){//passo fazer em while 
              
              
            
              
                tabela.addRow(new Object []{
                  
                    resultado.getString("cpf"),
                    resultado.getString("nome"),
                    resultado.getString("email"),
                    resultado.getString("celular"),
                    resultado.getString("senha"),
                    resultado.getString("servicos"),
                    resultado.getString("id"),
                    resultado.getString("nome"),
                    resultado.getString("descricao"),
                    resultado.getString("duracao"),
                    resultado.getString("valor")
                    
                    
                    
                });
            }
            
        }
       catch(Exception e ){
          JOptionPane.showMessageDialog(null," Nome não Localizado ");
       }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(telaadm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaadm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaadm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaadm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaadm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Caracteres;
    private javax.swing.JPanel Fundo;
    private javax.swing.JLabel GTC;
    private javax.swing.JLabel Telefone;
    private javax.swing.JFormattedTextField campocpf;
    private javax.swing.JTextField campoemail;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JTextField camposer;
    private javax.swing.JTextField camposocial;
    private javax.swing.JFormattedTextField campotel;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JLabel img2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel nomecnpj;
    private javax.swing.JLabel senha;
    // End of variables declaration//GEN-END:variables
}
