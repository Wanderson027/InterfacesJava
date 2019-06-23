
public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Vendas = new javax.swing.JButton();
        CadastrarFuncionario = new javax.swing.JButton();
        CadastrarRemedios = new javax.swing.JButton();
        CadastrarClientes = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        Jsair = new javax.swing.JToggleButton();
        ConsultarMedicamento = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(78, 171, 51));

        jPanel1.setBackground(new java.awt.Color(78, 171, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unifarm-peq.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Vendas.setBackground(new java.awt.Color(78, 171, 51));
        Vendas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Vendas.setForeground(new java.awt.Color(255, 255, 255));
        Vendas.setText("VENDAS");
        Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasActionPerformed(evt);
            }
        });

        CadastrarFuncionario.setBackground(new java.awt.Color(78, 171, 51));
        CadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
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
        CadastrarClientes.setText("CADASTRAR CLIENTES");
        CadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClientesActionPerformed(evt);
            }
        });

        Estoque.setBackground(new java.awt.Color(78, 171, 51));
        Estoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Estoque.setForeground(new java.awt.Color(255, 255, 255));
        Estoque.setText("ESTOQUE");
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });

        Jsair.setText("Sair");
        Jsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsairActionPerformed(evt);
            }
        });

        ConsultarMedicamento.setBackground(new java.awt.Color(78, 171, 51));
        ConsultarMedicamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ConsultarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jsair)
                    .addComponent(CadastrarRemedios, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
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
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Jsair)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
