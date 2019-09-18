/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import Model.Netflix;

/**
 *
 * @author EriikD
 */
public class TelaDoADM extends javax.swing.JFrame {

    private Netflix netflixBancoDeDadosAtual;
    private JFrame telaanterior;
    private CadastrarConteudo cadastrarConteudo;
    private VerUsuariosCadastrados verUsuariosCadastrados;
    private VerConteudosCadastrados verConteudosCadastrados;
    private ExcluirConteudo excluirConteudo;
    private AtualizarConteudo atualizarConteudo;

    /**
     * Creates new form TelaDoADM
     */
    public TelaDoADM() {
        initComponents();
    }

    public TelaDoADM(Netflix netflixBancoDeDadosAtual, JFrame telaanterior) {
        initComponents();
        this.netflixBancoDeDadosAtual = netflixBancoDeDadosAtual;
        this.telaanterior = telaanterior;
        this.cadastrarConteudo = new CadastrarConteudo(this, this.netflixBancoDeDadosAtual);
        this.verUsuariosCadastrados = new VerUsuariosCadastrados(this.netflixBancoDeDadosAtual, this);
        this.verConteudosCadastrados = new VerConteudosCadastrados(this.netflixBancoDeDadosAtual, this);
        this.excluirConteudo = new ExcluirConteudo(this.netflixBancoDeDadosAtual, this);
        this.atualizarConteudo = new AtualizarConteudo(this.netflixBancoDeDadosAtual, this);
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
        sairDaTelaBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cadastrarConteudoBotao = new javax.swing.JButton();
        verConteudosCadastradosBotao = new javax.swing.JButton();
        atualizarConteudoBotao = new javax.swing.JButton();
        verUsuariosCadastradosBotao = new javax.swing.JButton();
        excluirConteudoBotao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        sairDaTelaBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        sairDaTelaBotao.setText("SAIR");
        sairDaTelaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairDaTelaBotaoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        jLabel1.setText("XETFLIX SYSTEM");

        cadastrarConteudoBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cadastrarConteudoBotao.setText("Cadastrar Conteúdo");
        cadastrarConteudoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarConteudoBotaoActionPerformed(evt);
            }
        });

        verConteudosCadastradosBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        verConteudosCadastradosBotao.setText("Ver conteúdos cadastrados");
        verConteudosCadastradosBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verConteudosCadastradosBotaoActionPerformed(evt);
            }
        });

        atualizarConteudoBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        atualizarConteudoBotao.setText("Atualizar Conteúdo");
        atualizarConteudoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarConteudoBotaoActionPerformed(evt);
            }
        });

        verUsuariosCadastradosBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        verUsuariosCadastradosBotao.setText("Ver usuários cadastrados");
        verUsuariosCadastradosBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verUsuariosCadastradosBotaoActionPerformed(evt);
            }
        });

        excluirConteudoBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        excluirConteudoBotao.setText("Excluir Conteúdo");
        excluirConteudoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirConteudoBotaoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atualizarConteudoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(excluirConteudoBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cadastrarConteudoBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(verUsuariosCadastradosBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(verConteudosCadastradosBotao, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(sairDaTelaBotao)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cadastrarConteudoBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verUsuariosCadastradosBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verConteudosCadastradosBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(excluirConteudoBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atualizarConteudoBotao)
                .addGap(24, 24, 24)
                .addComponent(sairDaTelaBotao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairDaTelaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairDaTelaBotaoActionPerformed
        this.setVisible(false);
        this.telaanterior.setVisible(true);
    }//GEN-LAST:event_sairDaTelaBotaoActionPerformed

    private void cadastrarConteudoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarConteudoBotaoActionPerformed
        this.setVisible(false);
        this.cadastrarConteudo.resetarCampos();
        this.cadastrarConteudo.preencheCategorias();
        this.cadastrarConteudo.preencheSubCategorias();
//        this.cadastrarConteudo.preencheImagem();
        this.cadastrarConteudo.setVisible(true);
    }//GEN-LAST:event_cadastrarConteudoBotaoActionPerformed

    private void verUsuariosCadastradosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verUsuariosCadastradosBotaoActionPerformed
        this.setVisible(false);
        this.verUsuariosCadastrados.atualizarTabelaUsuariosCadastrados();
        this.verUsuariosCadastrados.setVisible(true);
    }//GEN-LAST:event_verUsuariosCadastradosBotaoActionPerformed

    private void verConteudosCadastradosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verConteudosCadastradosBotaoActionPerformed
        this.setVisible(false);
        this.verConteudosCadastrados.atualizarTabelaUsuariosCadastrados();
        this.verConteudosCadastrados.setVisible(true);
    }//GEN-LAST:event_verConteudosCadastradosBotaoActionPerformed

    private void excluirConteudoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirConteudoBotaoActionPerformed
        this.setVisible(false);
        this.excluirConteudo.setVisible(true);
    }//GEN-LAST:event_excluirConteudoBotaoActionPerformed

    private void atualizarConteudoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarConteudoBotaoActionPerformed
        this.setVisible(false);
        this.atualizarConteudo.desabilitarCampos();
        this.atualizarConteudo.setVisible(true);
    }//GEN-LAST:event_atualizarConteudoBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDoADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDoADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDoADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDoADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarConteudoBotao;
    private javax.swing.JButton cadastrarConteudoBotao;
    private javax.swing.JButton excluirConteudoBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sairDaTelaBotao;
    private javax.swing.JButton verConteudosCadastradosBotao;
    private javax.swing.JButton verUsuariosCadastradosBotao;
    // End of variables declaration//GEN-END:variables
}
