public class telaprincipal extends javax.swing.JFrame {

    public telaprincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        servicos = new javax.swing.JButton();
        sobre = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        GTC = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Login");
        login.setBorder(null);
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        servicos.setBackground(new java.awt.Color(255, 255, 255));
        servicos.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        servicos.setForeground(new java.awt.Color(0, 0, 0));
        servicos.setText("Serviços");
        servicos.setBorder(null);
        servicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosActionPerformed(evt);
            }
        });
        jPanel1.add(servicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 30));

        sobre.setBackground(new java.awt.Color(255, 255, 255));
        sobre.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        sobre.setForeground(new java.awt.Color(0, 0, 0));
        sobre.setText("Sobre");
        sobre.setBorder(null);
        sobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        jPanel1.add(sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 100, 30));

        sair.setBackground(new java.awt.Color(255, 255, 255));
        sair.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        sair.setForeground(new java.awt.Color(0, 0, 0));
        sair.setText("Sair");
        sair.setBorder(null);
        sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel1.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 410, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GTC.setBackground(new java.awt.Color(255, 255, 255));
        GTC.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        GTC.setForeground(new java.awt.Color(102, 102, 0));
        GTC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GTC.setText("Golden Tecnology Corporation");
        GTC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GTC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 6, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        img.setBackground(new java.awt.Color(255, 255, 255));
        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KC-Sales-Technology-resized-600.jpg.png"))); // NOI18N
        img.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        //Botão Login
        new telalogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosActionPerformed
        // Botão Serviços
        new telaservicos().setVisible(true);
        dispose();
    }//GEN-LAST:event_servicosActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        // Botão Sobre
        new telasobre().setVisible(true);
        dispose();
    }//GEN-LAST:event_sobreActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // Botão Sair
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed


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
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GTC;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JButton sair;
    private javax.swing.JButton servicos;
    private javax.swing.JButton sobre;
    // End of variables declaration//GEN-END:variables
}
