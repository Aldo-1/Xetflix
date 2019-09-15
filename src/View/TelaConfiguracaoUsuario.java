/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Netflix;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author EriikD
 */
public class TelaConfiguracaoUsuario extends javax.swing.JFrame {

    private Netflix netflixBancoDeDadosAtual;
    private JFrame telaanterior;
    private Cliente clientePesquisado;
    
    /**
     * Creates new form TelaConfiguracaoUsuario
     */
    public TelaConfiguracaoUsuario() {
        initComponents();
    }

    public TelaConfiguracaoUsuario(Netflix netflixBancoDeDadosAtual, JFrame telaanterior) {
        this.netflixBancoDeDadosAtual = netflixBancoDeDadosAtual;
        this.telaanterior = telaanterior;
        this.clientePesquisado = null;
        initComponents();
    }
    
    public void desabilitarCamposConfig(){
        this.novaSenhaUsuarioText.setEnabled(false);
        this.novoEmailText.setEnabled(false);
        this.novoNomeText.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mudarNomeDeUsuarioBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mudarEmailUsuarioBotao = new javax.swing.JButton();
        mudarSenhaDoUsuarioBotao = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        novoNomeUsuarioLabel = new javax.swing.JLabel();
        novoEmailUsuarioLabel = new javax.swing.JLabel();
        novaSenhaUsuarioLabel = new javax.swing.JLabel();
        novoNomeText = new javax.swing.JTextField();
        novoEmailText = new javax.swing.JTextField();
        novaSenhaUsuarioText = new javax.swing.JTextField();
        salvarTelaConfigBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mudarNomeDeUsuarioBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        mudarNomeDeUsuarioBotao.setText("MUDAR NOME DE USUÁRIO");
        mudarNomeDeUsuarioBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarNomeDeUsuarioBotaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("TELA DE CONFIGURAÇÃO DO USUÁRIO");

        mudarEmailUsuarioBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        mudarEmailUsuarioBotao.setText("MUDAR E-MAIL DE USUÁRIO");
        mudarEmailUsuarioBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarEmailUsuarioBotaoActionPerformed(evt);
            }
        });

        mudarSenhaDoUsuarioBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        mudarSenhaDoUsuarioBotao.setText("MUDAR SENHA DE USUÁRIO");
        mudarSenhaDoUsuarioBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarSenhaDoUsuarioBotaoActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton4.setText("SAIR DA TELA DE CONFIGURAÇÃO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        novoNomeUsuarioLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        novoNomeUsuarioLabel.setText("NOVO NOME:");

        novoEmailUsuarioLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        novoEmailUsuarioLabel.setText("NOVO E-MAIL:");

        novaSenhaUsuarioLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        novaSenhaUsuarioLabel.setText("NOVA SENHA:");

        novoNomeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                novoNomeTextKeyTyped(evt);
            }
        });

        novoEmailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                novoEmailTextKeyTyped(evt);
            }
        });

        novaSenhaUsuarioText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                novaSenhaUsuarioTextKeyTyped(evt);
            }
        });

        salvarTelaConfigBotao.setText("Salvar");
        salvarTelaConfigBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarTelaConfigBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mudarEmailUsuarioBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mudarNomeDeUsuarioBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mudarSenhaDoUsuarioBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(novoNomeUsuarioLabel)
                                    .addComponent(novoEmailUsuarioLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(novoNomeText, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(novoEmailText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(novaSenhaUsuarioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salvarTelaConfigBotao)
                                    .addComponent(novaSenhaUsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(mudarNomeDeUsuarioBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mudarEmailUsuarioBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mudarSenhaDoUsuarioBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoNomeUsuarioLabel)
                    .addComponent(novoNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoEmailUsuarioLabel)
                    .addComponent(novoEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaSenhaUsuarioLabel)
                    .addComponent(novaSenhaUsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(salvarTelaConfigBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        this.telaanterior.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mudarNomeDeUsuarioBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarNomeDeUsuarioBotaoActionPerformed
        this.novoNomeText.setEnabled(true);
        this.novaSenhaUsuarioText.setEnabled(false);
        this.novoEmailText.setEnabled(false);
        this.novaSenhaUsuarioText.removeAll();
        this.novoEmailText.removeAll();
    }//GEN-LAST:event_mudarNomeDeUsuarioBotaoActionPerformed

    private void mudarEmailUsuarioBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarEmailUsuarioBotaoActionPerformed
        this.novoNomeText.setEnabled(false);
        this.novaSenhaUsuarioText.setEnabled(false);
        this.novoNomeText.removeAll();
        this.novaSenhaUsuarioText.removeAll();
        this.novoEmailText.setEnabled(true);
    }//GEN-LAST:event_mudarEmailUsuarioBotaoActionPerformed

    private void mudarSenhaDoUsuarioBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarSenhaDoUsuarioBotaoActionPerformed
        this.novoNomeText.setEnabled(false);
        this.novaSenhaUsuarioText.setEnabled(true);
        this.novoEmailText.setEnabled(false);
        this.novoNomeText.removeAll();
        this.novoEmailText.removeAll();
    }//GEN-LAST:event_mudarSenhaDoUsuarioBotaoActionPerformed

    private void salvarTelaConfigBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarTelaConfigBotaoActionPerformed
        
    }//GEN-LAST:event_salvarTelaConfigBotaoActionPerformed

    private void novoNomeTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novoNomeTextKeyTyped
        String caracteres = "/-+,'!@#$%¨&()_+{}][´`^~,<.>:;/?|*=0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_novoNomeTextKeyTyped

    private void novoEmailTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novoEmailTextKeyTyped
        String caracteres = "/-+,'!@#$%¨&()_+{}][´`^~,<.>:;/?|*=0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_novoEmailTextKeyTyped

    private void novaSenhaUsuarioTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novaSenhaUsuarioTextKeyTyped
        String caracteres = "/-+,'!@#$%¨&()_+{}][´`^~,<.>:;/?|*=";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_novaSenhaUsuarioTextKeyTyped

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
            java.util.logging.Logger.getLogger(TelaConfiguracaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfiguracaoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mudarEmailUsuarioBotao;
    private javax.swing.JButton mudarNomeDeUsuarioBotao;
    private javax.swing.JButton mudarSenhaDoUsuarioBotao;
    private javax.swing.JLabel novaSenhaUsuarioLabel;
    private javax.swing.JTextField novaSenhaUsuarioText;
    private javax.swing.JTextField novoEmailText;
    private javax.swing.JLabel novoEmailUsuarioLabel;
    private javax.swing.JTextField novoNomeText;
    private javax.swing.JLabel novoNomeUsuarioLabel;
    private javax.swing.JButton salvarTelaConfigBotao;
    // End of variables declaration//GEN-END:variables
}