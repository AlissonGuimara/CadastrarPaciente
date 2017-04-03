
import javax.swing.JOptionPane;

public class CadastroPaciente extends javax.swing.JFrame {

    Metodos met = new Metodos();

    public CadastroPaciente() {
        initComponents();

        jInternalFrameCadastrarDados.setVisible(false);
        jInternalFramecontato.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameContato = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrameCadastrarDados = new javax.swing.JInternalFrame();
        jLabelnome = new javax.swing.JLabel();
        jLabelidade = new javax.swing.JLabel();
        jLabelsexo = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelnomepai = new javax.swing.JLabel();
        jLabelnomemae = new javax.swing.JLabel();
        jButtonproximo = new javax.swing.JButton();
        jTextFieldnome = new javax.swing.JTextField();
        jComboBoxsexo = new javax.swing.JComboBox<>();
        jTextFieldidade = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldnomepai = new javax.swing.JTextField();
        jTextFieldnomemae = new javax.swing.JTextField();
        jInternalFramecontato = new javax.swing.JInternalFrame();
        jLabelcidade = new javax.swing.JLabel();
        jLabelestado = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        jLabeltelefone = new javax.swing.JLabel();
        jLabelbairro = new javax.swing.JLabel();
        jTextFieldestado = new javax.swing.JTextField();
        jTextFieldcidade = new javax.swing.JTextField();
        jTextFieldbairro = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jTextFieldtelefone = new javax.swing.JTextField();
        jButtonproximo2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadastrar = new javax.swing.JMenuItem();
        jMeneItemExibirDados = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jInternalFrameContato.setVisible(true);

        javax.swing.GroupLayout jInternalFrameContatoLayout = new javax.swing.GroupLayout(jInternalFrameContato.getContentPane());
        jInternalFrameContato.getContentPane().setLayout(jInternalFrameContatoLayout);
        jInternalFrameContatoLayout.setHorizontalGroup(
            jInternalFrameContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jInternalFrameContatoLayout.setVerticalGroup(
            jInternalFrameContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1087, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(200, 200));

        jInternalFrameCadastrarDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jInternalFrameCadastrarDados.setName(""); // NOI18N
        try {
            jInternalFrameCadastrarDados.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameCadastrarDados.setVisible(true);

        jLabelnome.setText("Nome");

        jLabelidade.setText("Idade");

        jLabelsexo.setText("Sexo");

        jLabelCPF.setText("CPF");

        jLabelnomepai.setText("Nome do pai");

        jLabelnomemae.setText("Nome da mãe");

        jButtonproximo.setText("PRÓXIMO");
        jButtonproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproximoActionPerformed(evt);
            }
        });

        jComboBoxsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        javax.swing.GroupLayout jInternalFrameCadastrarDadosLayout = new javax.swing.GroupLayout(jInternalFrameCadastrarDados.getContentPane());
        jInternalFrameCadastrarDados.getContentPane().setLayout(jInternalFrameCadastrarDadosLayout);
        jInternalFrameCadastrarDadosLayout.setHorizontalGroup(
            jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastrarDadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelnome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelsexo)
                    .addComponent(jLabelidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPF)
                    .addComponent(jLabelnomepai)
                    .addComponent(jLabelnomemae))
                .addGap(28, 28, 28)
                .addGroup(jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jComboBoxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldidade)
                    .addComponent(jTextFieldCPF)
                    .addComponent(jTextFieldnomepai)
                    .addComponent(jTextFieldnomemae)
                    .addComponent(jButtonproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameCadastrarDadosLayout.setVerticalGroup(
            jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastrarDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnome)
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelsexo)
                    .addComponent(jComboBoxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelidade)
                    .addComponent(jTextFieldidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelnomepai)
                    .addComponent(jTextFieldnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameCadastrarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnomemae)
                    .addComponent(jTextFieldnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonproximo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jInternalFramecontato.setVisible(true);

        jLabelcidade.setText("Cidade");

        jLabelestado.setText("Estado");

        jLabelemail.setText("Email");

        jLabeltelefone.setText("Telefone");

        jLabelbairro.setText("Bairro");

        jButtonproximo2.setText("PRÓXIMO");
        jButtonproximo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproximo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFramecontatoLayout = new javax.swing.GroupLayout(jInternalFramecontato.getContentPane());
        jInternalFramecontato.getContentPane().setLayout(jInternalFramecontatoLayout);
        jInternalFramecontatoLayout.setHorizontalGroup(
            jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFramecontatoLayout.createSequentialGroup()
                .addGroup(jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelestado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelbairro)
                    .addComponent(jLabelemail)
                    .addComponent(jLabeltelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldestado)
                        .addComponent(jTextFieldcidade)
                        .addComponent(jTextFieldbairro)
                        .addComponent(jTextFieldemail)
                        .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                    .addComponent(jButtonproximo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jInternalFramecontatoLayout.setVerticalGroup(
            jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFramecontatoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelestado)
                    .addComponent(jTextFieldestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcidade)
                    .addComponent(jTextFieldcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelbairro)
                    .addComponent(jTextFieldbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelemail)
                    .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFramecontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltelefone)
                    .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonproximo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jInternalFrameCadastrarDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jInternalFramecontato, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jInternalFrameCadastrarDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jInternalFramecontato))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jInternalFrameCadastrarDados)
                    .addComponent(jInternalFramecontato))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jInternalFrameCadastrarDados.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemCadastrar.setText("Cadastrar paciente");
        jMenuItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadastrar);

        jMeneItemExibirDados.setText("Exibir Dados");
        jMenu1.add(jMeneItemExibirDados);

        jMenuItem1.setText("Buscar paciente");
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Sair");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarActionPerformed
        jInternalFrameCadastrarDados.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarActionPerformed

    private void jButtonproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonproximoActionPerformed
        try {
            met.setNome(jTextFieldnome.getText());
            met.setSexo(jComboBoxsexo.getSelectedItem().toString());
            met.setIdade(Integer.parseInt(jTextFieldidade.getText()));
            met.setCpf(Integer.parseInt(jTextFieldCPF.getText()));
            met.setNomePai(jTextFieldnomepai.getText());
            met.setNomeMae(jTextFieldnomemae.getText());
        } catch (NumberFormatException numberEx) {
            met.setIdade(0);
            numberEx.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro \n " + e.getMessage());
        }
        jInternalFrameCadastrarDados.setVisible(false);
        jInternalFramecontato.setVisible(true);
    }//GEN-LAST:event_jButtonproximoActionPerformed

    private void jButtonproximo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonproximo2ActionPerformed
        try {
            met.setEstado(jTextFieldestado.getText());
            met.setCidade(jTextFieldcidade.getText());
            met.setBairro(jTextFieldbairro.getText());
            met.setEmail(jTextFieldemail.getText());
            met.setTelefone(Integer.parseInt(jTextFieldtelefone.getText()));
        } catch (NumberFormatException numberEx) {
            met.setTelefone(0);
            numberEx.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro \n " + e.getMessage());
        }
        jInternalFramecontato.setVisible(false);
                    
    }//GEN-LAST:event_jButtonproximo2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CadastroPaciente().setVisible(true);
                new login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonproximo;
    private javax.swing.JButton jButtonproximo2;
    private javax.swing.JComboBox<String> jComboBoxsexo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameCadastrarDados;
    private javax.swing.JInternalFrame jInternalFrameContato;
    private javax.swing.JInternalFrame jInternalFramecontato;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelbairro;
    private javax.swing.JLabel jLabelcidade;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabelestado;
    private javax.swing.JLabel jLabelidade;
    private javax.swing.JLabel jLabelnome;
    private javax.swing.JLabel jLabelnomemae;
    private javax.swing.JLabel jLabelnomepai;
    private javax.swing.JLabel jLabelsexo;
    private javax.swing.JLabel jLabeltelefone;
    private javax.swing.JMenuItem jMeneItemExibirDados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldbairro;
    private javax.swing.JTextField jTextFieldcidade;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldestado;
    private javax.swing.JTextField jTextFieldidade;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldnomemae;
    private javax.swing.JTextField jTextFieldnomepai;
    private javax.swing.JTextField jTextFieldtelefone;
    // End of variables declaration//GEN-END:variables

}
