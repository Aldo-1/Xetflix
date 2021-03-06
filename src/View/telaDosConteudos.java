/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Conteudo;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Nunes
 */
public class telaDosConteudos extends javax.swing.JFrame {

    Cliente clienteAtual;
    Conteudo conteudoDaTela;
    TelaDoUsuario telaAnterior;

    /**
     * Creates new form telaDosConteudos
     */
    public telaDosConteudos() {
        initComponents();
    }

    public telaDosConteudos(Conteudo conteudoDaTela, TelaDoUsuario telaAnterior,Cliente clienteAtual) {
        this.conteudoDaTela = conteudoDaTela;
        this.clienteAtual = clienteAtual;
        this.telaAnterior = telaAnterior;
        initComponents();
        this.verificaAvaliacao();
        this.preencherCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myGroup = new javax.swing.ButtonGroup();
        labelDeConteudo = new javax.swing.JLabel();
        botao1 = new javax.swing.JRadioButton();
        botao2 = new javax.swing.JRadioButton();
        botao3 = new javax.swing.JRadioButton();
        botao4 = new javax.swing.JRadioButton();
        botao5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diretor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        atores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelDeConteudo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        labelDeConteudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDeConteudo.setText("Avalie esse filme:");

        myGroup.add(botao1);
        botao1.setText("1");

        myGroup.add(botao2);
        botao2.setText("2");

        myGroup.add(botao3);
        botao3.setText("3");

        myGroup.add(botao4);
        botao4.setText("4");

        myGroup.add(botao5);
        botao5.setText("5");

        voltar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        salvar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Diretor:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Atores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelDeConteudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao5)
                        .addContainerGap(242, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(voltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salvar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(atores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(5, 5, 5)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeConteudo)
                    .addComponent(botao1)
                    .addComponent(botao2)
                    .addComponent(botao3)
                    .addComponent(botao4)
                    .addComponent(botao5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(diretor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(atores, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(salvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Verifica se o cliente ja avaliou determinado titulo
    private void verificaAvaliacao(){
        if (this.clienteAtual.getConteudosAvaliados().contains(this.conteudoDaTela)){
            this.botao1.setEnabled(false);
            this.botao2.setEnabled(false);
            this.botao3.setEnabled(false);
            this.botao4.setEnabled(false);
            this.botao5.setEnabled(false);
        }
    }
    
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
        this.telaAnterior.setVisible(true);
        
    }//GEN-LAST:event_voltarActionPerformed
    private String retornarAtores(){
        StringBuilder stringer = new StringBuilder();
        for (int i = 0; i < conteudoDaTela.getListaDeAtores().length; i++) {
            stringer.append(conteudoDaTela.getListaDeAtores()[i] + "  ");
        }
        return stringer.toString();
    }
    private void preencherCampos(){
        this.nome1.setText(this.conteudoDaTela.getNome());
        this.descricao.setText(this.conteudoDaTela.getDescricao());
        this.diretor.setText(this.conteudoDaTela.getDiretor());
        this.atores.setText(this.retornarAtores());
    }
    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        ButtonModel modeloSelecionado = this.myGroup.getSelection();
        if (modeloSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Selecione ao menos uma opcao de avaliacao");
        } else {
            Integer avaliacaoAntiga = this.conteudoDaTela.getAvaliacao();
            if (this.botao1.getModel().equals(modeloSelecionado)) {
                this.clienteAtual.avaliarTitulo(this.conteudoDaTela,1);
            } else if (this.botao2.getModel().equals(modeloSelecionado)) {
                this.clienteAtual.avaliarTitulo(this.conteudoDaTela,2);
            } else if (this.botao3.getModel().equals(modeloSelecionado)) {
                this.clienteAtual.avaliarTitulo(this.conteudoDaTela,3);
            } else if (this.botao4.getModel().equals(modeloSelecionado)) {
                this.clienteAtual.avaliarTitulo(this.conteudoDaTela,4);
            } else if (this.botao5.getModel().equals(modeloSelecionado)) {
                this.clienteAtual.avaliarTitulo(this.conteudoDaTela,5);
            }
            Integer novaAvaliacao = this.conteudoDaTela.getAvaliacao();
            if (avaliacaoAntiga == null){
                this.telaAnterior.getNetflixBancoDeDadosAtual().adicionaNovoConteudoAvaliado(novaAvaliacao, conteudoDaTela);
            }else{
                this.telaAnterior.getNetflixBancoDeDadosAtual().mudaAvaliacaoConteudo(avaliacaoAntiga, novaAvaliacao, conteudoDaTela);
            }
            this.botao1.setEnabled(false);
            this.botao2.setEnabled(false);
            this.botao3.setEnabled(false);
            this.botao4.setEnabled(false);
            this.botao5.setEnabled(false);
        }
    }//GEN-LAST:event_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(telaDosConteudos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDosConteudos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDosConteudos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDosConteudos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDosConteudos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atores;
    private javax.swing.JRadioButton botao1;
    private javax.swing.JRadioButton botao2;
    private javax.swing.JRadioButton botao3;
    private javax.swing.JRadioButton botao4;
    private javax.swing.JRadioButton botao5;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel diretor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelDeConteudo;
    private javax.swing.ButtonGroup myGroup;
    private javax.swing.JLabel nome1;
    private javax.swing.JButton salvar;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
