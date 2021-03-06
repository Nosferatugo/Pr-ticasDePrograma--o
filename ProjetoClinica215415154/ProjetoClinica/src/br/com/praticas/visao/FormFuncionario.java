/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.praticas.visao;

import br.com.praticas.modelobeans.BeansFuncionario;
import br.com.praticas.modelobeans.ModeloTabela;
import br.com.praticas.modeloconection.ConexaoBD;
import br.com.praticas.modelodao.DaoFuncionario;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author HugoNathan
 */
public class FormFuncionario extends javax.swing.JFrame {
    
    BeansFuncionario mod = new BeansFuncionario();
    DaoFuncionario control = new DaoFuncionario();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    public FormFuncionario() {
        initComponents();
        preencherTabela("select *from funcionarios order by nome_funcionario");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jToggleButtonNovo = new javax.swing.JToggleButton();
        jToggleButtonSalvar = new javax.swing.JToggleButton();
        jToggleButtonEditar = new javax.swing.JToggleButton();
        jToggleButtonExcluir = new javax.swing.JToggleButton();
        jToggleButtonCancelar = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jToggleButtonPesquisar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxFuncao = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jTextFieldNome.setEnabled(false);

        jFormattedTextFieldCpf.setEnabled(false);

        jLabel4.setText("Função:");

        jToggleButtonNovo.setText("Novo");
        jToggleButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonNovoActionPerformed(evt);
            }
        });

        jToggleButtonSalvar.setText("Salvar");
        jToggleButtonSalvar.setEnabled(false);
        jToggleButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSalvarActionPerformed(evt);
            }
        });

        jToggleButtonEditar.setText("Editar");
        jToggleButtonEditar.setEnabled(false);
        jToggleButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEditarActionPerformed(evt);
            }
        });

        jToggleButtonExcluir.setText("Excluir");
        jToggleButtonExcluir.setEnabled(false);
        jToggleButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonExcluirActionPerformed(evt);
            }
        });

        jToggleButtonCancelar.setText("Cancelar");
        jToggleButtonCancelar.setEnabled(false);
        jToggleButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Pesquisa:");

        jToggleButtonPesquisar.setText("Pesquisar");
        jToggleButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPesquisarActionPerformed(evt);
            }
        });

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionario);

        jLabel6.setText("Matricula:");

        jTextFieldMatricula.setEnabled(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/praticas/imagens/cropped_1.png"))); // NOI18N

        jComboBoxFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Médico", "Atendente", "Enfermeiro" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonPesquisar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(42, 42, 42))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE FUNCIONÁRIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(735, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonNovoActionPerformed
    flag = 1;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);
        jComboBoxFuncao.setEnabled(true);
        jToggleButtonSalvar.setEnabled(true);
        jToggleButtonCancelar.setEnabled(true);
        jTextFieldNome.setText("");
        jFormattedTextFieldCpf.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldMatricula.setText("");
        jToggleButtonEditar.setEnabled(false);
        jToggleButtonExcluir.setEnabled(false);
        jToggleButtonPesquisar.setEnabled(true);
        jToggleButtonPesquisar.setEnabled(false);
        preencherTabela("select *from funcionarios order by nome_funcionario");
                
    }//GEN-LAST:event_jToggleButtonNovoActionPerformed

    private void jToggleButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPesquisarActionPerformed
        
        mod.setPesquisa(jTextFieldPesquisa.getText());
        BeansFuncionario model = control.buscaFuncionario(mod);
        jTextFieldNome.setText(model.getNome());
        jTextFieldMatricula.setText(String.valueOf(model.getMatricula()));
        jFormattedTextFieldCpf.setText(String.valueOf(model.getCpf()));
        jComboBoxFuncao.setSelectedItem(model.getFuncao());

        preencherTabela("select *from funcionarios where nome_funcionario like'%"+mod.getPesquisa()+"%'");
        
    }//GEN-LAST:event_jToggleButtonPesquisarActionPerformed

    private void jToggleButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonExcluirActionPerformed
        
        int resposta=0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir?");
        if (resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(jTextFieldMatricula.getText()));
            control.excluir(mod);
            jTextFieldMatricula.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCpf.setText("");

            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCpf.setEnabled(false);
            jComboBoxFuncao.setEnabled(false);
            jToggleButtonSalvar.setEnabled(false);
            jToggleButtonNovo.setEnabled(true);
            jToggleButtonCancelar.setEnabled(false);
            jToggleButtonEditar.setEnabled(false);
            jToggleButtonExcluir.setEnabled(false);
            preencherTabela("select *from funcionarios order by nome_funcionario");
        }  
    }//GEN-LAST:event_jToggleButtonExcluirActionPerformed

    private void jToggleButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEditarActionPerformed
        
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);
        jComboBoxFuncao.setEnabled(true);
        jToggleButtonSalvar.setEnabled(true);
        jToggleButtonCancelar.setEnabled(true);
        jToggleButtonEditar.setEnabled(false);
        jToggleButtonNovo.setEnabled(false);
        jToggleButtonExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jToggleButtonEditarActionPerformed

    private void jToggleButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCancelarActionPerformed
       
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCpf.setEnabled(!true);
        jComboBoxFuncao.setEnabled(!true);
        jToggleButtonSalvar.setEnabled(!true);
        jToggleButtonCancelar.setEnabled(!true);
        jToggleButtonNovo.setEnabled(true);
        jToggleButtonEditar.setEnabled(false);
        jToggleButtonExcluir.setEnabled(false);
        jTextFieldPesquisa.setEnabled(true);
        jToggleButtonPesquisar.setEnabled(true);
        
    }//GEN-LAST:event_jToggleButtonCancelarActionPerformed

    private void jToggleButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSalvarActionPerformed
       
        if (jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o nome para continuar!" );
            jTextFieldNome.requestFocus();

        }else if(jFormattedTextFieldCpf.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o CPF para continuar!" );
            jFormattedTextFieldCpf.requestFocus();

        }else
        if (flag == 1){
            mod.setNome(jTextFieldNome.getText());
            mod.setFuncao((String) jComboBoxFuncao.getSelectedItem());
            mod.setCpf(Integer.parseInt(jFormattedTextFieldCpf.getText()));
            control.salvar(mod);

            jTextFieldNome.setText("");
            jFormattedTextFieldCpf.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCpf.setEnabled(false);
            jComboBoxFuncao.setEnabled(false);
            jToggleButtonSalvar.setEnabled(false);
            jToggleButtonCancelar.setEnabled(false);
            preencherTabela("select *from funcionarios order by nome_funcionario");
        }else{
            mod.setCodigo(Integer.parseInt(jTextFieldMatricula.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setFuncao((String)jComboBoxFuncao.getSelectedItem());
            mod.setCpf(Integer.parseInt(jFormattedTextFieldCpf.getText()));
            control.editar(mod);
            jTextFieldMatricula.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCpf.setText("");

            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCpf.setEnabled(false);
            jComboBoxFuncao.setEnabled(false);
            jToggleButtonSalvar.setEnabled(false);
            jToggleButtonNovo.setEnabled(true);
            jToggleButtonCancelar.setEnabled(false);

            preencherTabela("select *from funcionarios order by nome_funcionario");

        }
        
    }//GEN-LAST:event_jToggleButtonSalvarActionPerformed
/*
    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableFuncionarioMouseClicked
*/
    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {                                          
        String nome_funcionario =""+jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 1);
        conex.conexao();
        conex.executarSql("select *from funcionarios where nome_funcionario='"+nome_funcionario+"'");
        try {
            conex.rs.first();
            jTextFieldMatricula.setText(String.valueOf(conex.rs.getInt("cod_funcionario")));
            jTextFieldNome.setText(conex.rs.getString("nome_funcionario"));
            jComboBoxFuncao.setSelectedItem(conex.rs.getString("funcao_funcionario"));
            jFormattedTextFieldCpf.setText(conex.rs.getString("cpf_funcionario"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar Dados!");
        }
        conex.desconecta();
        jToggleButtonEditar.setEnabled(true);
        jToggleButtonExcluir.setEnabled(true);
        jToggleButtonPesquisar.setEnabled(true);

    }                                         

    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Matrícula","Nome","Função","CPF"};
        conex.conexao();
        conex.executarSql(Sql);
        
        try{
        conex.rs.first();
        do{
            dados.add(new Object[]{conex.rs.getInt("cod_funcionario"),conex.rs.getString("nome_funcionario"),conex.rs.getString("funcao_funcionario"),conex.rs.getInt("cpf_funcionario")});
        }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque por outro Funcionário!");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableFuncionario.setModel(modelo);
        jTableFuncionario.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableFuncionario.getColumnModel().getColumn(0).setResizable(false);
        jTableFuncionario.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTableFuncionario.getColumnModel().getColumn(1).setResizable(false);
        jTableFuncionario.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableFuncionario.getColumnModel().getColumn(2).setResizable(false);
        jTableFuncionario.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableFuncionario.getColumnModel().getColumn(3).setResizable(false);
        jTableFuncionario.getTableHeader().setReorderingAllowed(false);
        jTableFuncionario.setAutoResizeMode(jTableFuncionario.AUTO_RESIZE_OFF);
        jTableFuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
    
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
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxFuncao;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JToggleButton jToggleButtonCancelar;
    private javax.swing.JToggleButton jToggleButtonEditar;
    private javax.swing.JToggleButton jToggleButtonExcluir;
    private javax.swing.JToggleButton jToggleButtonNovo;
    private javax.swing.JToggleButton jToggleButtonPesquisar;
    private javax.swing.JToggleButton jToggleButtonSalvar;
    // End of variables declaration//GEN-END:variables
}
