
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tinho
 */
public class telaservicos extends javax.swing.JFrame {

    /**
     * Creates new form telaservicos
     */
    public telaservicos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        infohelp = new javax.swing.JButton();
        infoeducacionais = new javax.swing.JButton();
        infogestao = new javax.swing.JButton();
        infopesquisa = new javax.swing.JButton();
        infoplataforma = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        inforealizar1 = new javax.swing.JButton();
        GTC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informações e serviços");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informaçoes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infohelp.setBackground(new java.awt.Color(255, 255, 255));
        infohelp.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        infohelp.setForeground(new java.awt.Color(0, 0, 0));
        infohelp.setText("Help Desk (01)");
        infohelp.setBorder(null);
        infohelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infohelpActionPerformed(evt);
            }
        });
        jPanel1.add(infohelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, -1));

        infoeducacionais.setBackground(new java.awt.Color(255, 255, 255));
        infoeducacionais.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        infoeducacionais.setForeground(new java.awt.Color(0, 0, 0));
        infoeducacionais.setText("Educacionais T.I (05)");
        infoeducacionais.setBorder(null);
        infoeducacionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoeducacionaisActionPerformed(evt);
            }
        });
        jPanel1.add(infoeducacionais, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 40, 130, -1));

        infogestao.setBackground(new java.awt.Color(255, 255, 255));
        infogestao.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        infogestao.setForeground(new java.awt.Color(0, 0, 0));
        infogestao.setText("Gestão T.I (03)");
        infogestao.setBorder(null);
        infogestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infogestaoActionPerformed(evt);
            }
        });
        jPanel1.add(infogestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 100, -1));

        infopesquisa.setBackground(new java.awt.Color(255, 255, 255));
        infopesquisa.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        infopesquisa.setForeground(new java.awt.Color(0, 0, 0));
        infopesquisa.setText("Pesquisa e desenvolvimento (04)");
        infopesquisa.setBorder(null);
        infopesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(infopesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, -1));

        infoplataforma.setBackground(new java.awt.Color(255, 255, 255));
        infoplataforma.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        infoplataforma.setForeground(new java.awt.Color(0, 0, 0));
        infoplataforma.setText("Manutenção de plataforma (02)");
        infoplataforma.setBorder(null);
        infoplataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoplataformaActionPerformed(evt);
            }
        });
        jPanel1.add(infoplataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 180, -1));

        voltar.setBackground(new java.awt.Color(255, 255, 255));
        voltar.setForeground(new java.awt.Color(0, 0, 0));
        voltar.setText("Voltar - Tela  Principal");
        voltar.setBorder(null);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 30));

        inforealizar1.setBackground(new java.awt.Color(255, 255, 255));
        inforealizar1.setForeground(new java.awt.Color(0, 0, 0));
        inforealizar1.setText("Avançar para Realizar o cadastro");
        inforealizar1.setBorder(null);
        inforealizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inforealizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(inforealizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 440, 160));

        GTC.setBackground(new java.awt.Color(255, 255, 255));
        GTC.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        GTC.setForeground(new java.awt.Color(102, 102, 0));
        GTC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GTC.setText("Golden Tecnology Corporation");
        GTC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GTC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(GTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KC-Sales-Technology-resized-600.jpg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infohelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infohelpActionPerformed
        // help desk:   
        JOptionPane.showMessageDialog(null, "Serviço de atendimento aos clientes \nque procuram por soluções, esclarecimentos \nsobre dúvidas e outras solicitações para problemas  ");
        JOptionPane.showMessageDialog(null, "valor : R$ 1400,00 \n tempo : 1 ano  ");

    }//GEN-LAST:event_infohelpActionPerformed

    private void infoeducacionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoeducacionaisActionPerformed
        //Educação 
        JOptionPane.showMessageDialog(null, "Responsável pela capacitação, treinamento e \n apoio aos diversos usuários que estão utilizando os \n sistemas corporativos de uma empresa e os demais aplicativos de informação");
        JOptionPane.showMessageDialog(null, "valor : R$ 800,00 \n Tempo : 15 a 30 Dias ");
    }//GEN-LAST:event_infoeducacionaisActionPerformed

    private void infogestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infogestaoActionPerformed
        // Gestão
        JOptionPane.showMessageDialog(null, "foco no planejamento e gestão dos recursos tecnológicos em empresas de diversos segmentos de negócios em cargos de Gestão de Serviços em TI,\n Engenharia de Software,\n Governança em TI e \nGerenciamento de Projetos de TI. ");
        JOptionPane.showMessageDialog(null, "valor : R$ 1400,00 \n tempo : 1 ano  ");
    }//GEN-LAST:event_infogestaoActionPerformed

    private void infopesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopesquisaActionPerformed
        // Pesquisa e desenvolvimento
        JOptionPane.showMessageDialog(null, "profissionais que visam a inovação e criação de novos \n instrumentos tecnológicos para Clientes.");
        JOptionPane.showMessageDialog(null, "valor : R$ 4000,00 \n tempo : 1 MÊS ");
    }//GEN-LAST:event_infopesquisaActionPerformed

    private void infoplataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoplataformaActionPerformed
        // Manutenção de plataforma
        JOptionPane.showMessageDialog(null, "Garantem que os múltiplos dispositivos computacionais \ndentro da empresa, como os computadores de alto nível,\nnotebooks e dispositivos móveis, sejam mantidos em bom funcionamento.");
        JOptionPane.showMessageDialog(null, "valor : R$ 2000,00 \n tempo : 8 Semanas ");
    }//GEN-LAST:event_infoplataformaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        //Botão
        new telaprincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void inforealizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inforealizar1ActionPerformed
        //Botão
        new telacadastro().setVisible(true);
        dispose();
    }//GEN-LAST:event_inforealizar1ActionPerformed

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
            java.util.logging.Logger.getLogger(telaservicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaservicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaservicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaservicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaservicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GTC;
    private javax.swing.JButton infoeducacionais;
    private javax.swing.JButton infogestao;
    private javax.swing.JButton infohelp;
    private javax.swing.JButton infopesquisa;
    private javax.swing.JButton infoplataforma;
    private javax.swing.JButton inforealizar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
