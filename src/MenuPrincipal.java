
import javax.swing.JOptionPane;


public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Vendas = new javax.swing.JButton();
        CadastrarFuncionario = new javax.swing.JButton();
        CadastrarRemedios = new javax.swing.JButton();
        CadastrarClientes = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        Jsair = new javax.swing.JToggleButton();
        ConsultarMedicamento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(78, 171, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Vendas.setBackground(new java.awt.Color(78, 171, 51));
        Vendas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Vendas.setForeground(new java.awt.Color(255, 255, 255));
        Vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sale-icon.png"))); // NOI18N
        Vendas.setText("VENDAS");
        Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasActionPerformed(evt);
            }
        });

        CadastrarFuncionario.setBackground(new java.awt.Color(78, 171, 51));
        CadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Preppy-icon.png"))); // NOI18N
        CadastrarFuncionario.setText("CADASTRAR FUNCIONARIOS");
        CadastrarFuncionario.setPreferredSize(new java.awt.Dimension(91, 25));
        CadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFuncionarioActionPerformed(evt);
            }
        });

        CadastrarRemedios.setBackground(new java.awt.Color(78, 171, 51));
        CadastrarRemedios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastrarRemedios.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarRemedios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Healthcare-Pill-icon.png"))); // NOI18N
        CadastrarRemedios.setText("CADASTRAR REMÉDIOS");
        CadastrarRemedios.setPreferredSize(new java.awt.Dimension(91, 25));
        CadastrarRemedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarRemediosActionPerformed(evt);
            }
        });

        CadastrarClientes.setBackground(new java.awt.Color(78, 171, 51));
        CadastrarClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastrarClientes.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User-Group-icon.png"))); // NOI18N
        CadastrarClientes.setText("CADASTRAR CLIENTES");
        CadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClientesActionPerformed(evt);
            }
        });

        Estoque.setBackground(new java.awt.Color(78, 171, 51));
        Estoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Estoque.setForeground(new java.awt.Color(255, 255, 255));
        Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Box-icon.png"))); // NOI18N
        Estoque.setText("ESTOQUE");
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });

        Jsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_ic_exit_to_app_48px_352328.png"))); // NOI18N
        Jsair.setText("Sair");
        Jsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsairActionPerformed(evt);
            }
        });

        ConsultarMedicamento.setBackground(new java.awt.Color(78, 171, 51));
        ConsultarMedicamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ConsultarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/13416400251535694869-16.png"))); // NOI18N
        ConsultarMedicamento.setText("CONSULTAR MEDICAMENTOS");
        ConsultarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarMedicamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastrarRemedios, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Jsair)
                        .addGap(112, 112, 112))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastrarRemedios, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CadastrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(Jsair)
                .addGap(43, 43, 43))
        );

        jPanel1.setBackground(new java.awt.Color(78, 171, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unifarm-peq.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
        );

        jMenu1.setText("Arquivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Vendas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Cadastro Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Estoque");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Salvar >");

        jMenuItem2.setText("Salvar como ctrl+U");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Salvar Ctrl+C");
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarRemediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarRemediosActionPerformed
        new CadastrarRemedios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarRemediosActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        new Estoque().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EstoqueActionPerformed

    private void CadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarClientesActionPerformed
        new CadastrarClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarClientesActionPerformed

    private void CadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFuncionarioActionPerformed
        new CadastrarFuncionarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarFuncionarioActionPerformed

    private void ConsultarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarMedicamentoActionPerformed
        new ConsultarMedicamento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ConsultarMedicamentoActionPerformed

    private void JsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsairActionPerformed
     this.dispose();
    }//GEN-LAST:event_JsairActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
      new Vendas().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_VendasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Vendas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new CadastrarClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Estoque().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarClientes;
    private javax.swing.JButton CadastrarFuncionario;
    private javax.swing.JButton CadastrarRemedios;
    private javax.swing.JButton ConsultarMedicamento;
    private javax.swing.JButton Estoque;
    private javax.swing.JToggleButton Jsair;
    private javax.swing.JButton Vendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
