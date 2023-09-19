/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author u04127224290
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Jogos");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMniUsuario = new javax.swing.JMenuItem();
        jMniCliente = new javax.swing.JMenuItem();
        jMniVendedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMniLivro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMniSair = new javax.swing.JMenuItem();
        JMenu = new javax.swing.JMenu();
        jMniVendas = new javax.swing.JMenuItem();
        jMniEmprestimos = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setMnemonic('C');
        jMenu1.setText("Cadastros");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });

        jMniUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMniUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jMniUsuario.setMnemonic('U');
        jMniUsuario.setText("Usuário");
        jMniUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMniUsuario);

        jMniCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMniCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMniCliente.setMnemonic('C');
        jMniCliente.setText("Cliente");
        jMniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMniCliente);

        jMniVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMniVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedor.png"))); // NOI18N
        jMniVendedor.setMnemonic('V');
        jMniVendedor.setText("Vendedor");
        jMniVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniVendedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMniVendedor);
        jMenu1.add(jSeparator1);

        jMniLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMniLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/livro.png"))); // NOI18N
        jMniLivro.setMnemonic('L');
        jMniLivro.setText("Jogo");
        jMniLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniLivroActionPerformed(evt);
            }
        });
        jMenu1.add(jMniLivro);
        jMenu1.add(jSeparator2);

        jMniSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMniSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jMniSair.setText("Sair");
        jMniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMniSair);

        jMenuBar1.add(jMenu1);

        JMenu.setMnemonic('M');
        JMenu.setText("Movimentos");

        jMniVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMniVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas.png"))); // NOI18N
        jMniVendas.setMnemonic('V');
        jMniVendas.setText("Vendas");
        jMniVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniVendasActionPerformed(evt);
            }
        });
        JMenu.add(jMniVendas);

        jMniEmprestimos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMniEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emprestado.png"))); // NOI18N
        jMniEmprestimos.setMnemonic('E');
        jMniEmprestimos.setText("Entrega");
        JMenu.add(jMniEmprestimos);

        jMenuBar1.add(JMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMniVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniVendasActionPerformed
        // TODO add your handling code here:
        JDlgVendasNovo jDlgVendass = new JDlgVendasNovo(this, true);
        jDlgVendass.setVisible(true);
    }//GEN-LAST:event_jMniVendasActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMniSairActionPerformed

    private void jMniLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniLivroActionPerformed
        // TODO add your handling code here:
        JDlgJogo jDlgLivros = new JDlgJogo(this, true);
        jDlgJogo.setVisible(true);
    }//GEN-LAST:event_jMniLivroActionPerformed

    private void jMniVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniVendedorActionPerformed
        // TODO add your handling code here:
        JDlgVendedor jDlgVendedors = new JDlgVendedor(this, true);
        jDlgVendedors.setVisible(true);
    }//GEN-LAST:event_jMniVendedorActionPerformed

    private void jMniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniClienteActionPerformed
        // TODO add your handling code here:
        JDlgCliente jDlgClientes = new JDlgCliente(this, true);
        jDlgClientes.setVisible(true);
    }//GEN-LAST:event_jMniClienteActionPerformed

    private void jMniUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniUsuarioActionPerformed
        // TODO add your handling code here:
        JDlgUsuariosNovo jDlgUsuarios = new JDlgUsuariosNovo(this, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMniUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenu;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMniCliente;
    private javax.swing.JMenuItem jMniEmprestimos;
    private javax.swing.JMenuItem jMniLivro;
    private javax.swing.JMenuItem jMniSair;
    private javax.swing.JMenuItem jMniUsuario;
    private javax.swing.JMenuItem jMniVendas;
    private javax.swing.JMenuItem jMniVendedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
