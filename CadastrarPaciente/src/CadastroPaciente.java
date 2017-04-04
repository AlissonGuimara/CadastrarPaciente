
import javax.swing.JOptionPane;

public class CadastroPaciente extends javax.swing.JFrame {

    Metodos met = new Metodos();

    public CadastroPaciente() {
        initComponents();

        jInternalFrameCadastrarDados.setVisible(false);
        jInternalFramecontato.setVisible(false);
        jInternalFrameDadosPaciente.setVisible(false);
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
        jButtonAnterior = new javax.swing.JButton();
        jInternalFrameDadosPaciente = new javax.swing.JInternalFrame();
        jLabelTipoSangue = new javax.swing.JLabel();
        jLabelNomedoença = new javax.swing.JLabel();
        jLabelrRegSUS = new javax.swing.JLabel();
        jComboBoxTipoSangue = new javax.swing.JComboBox<>();
        jTextFieldNomeDoença = new javax.swing.JTextField();
        jTextFieldRegSUS = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAnterior2 = new javax.swing.JButton();
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
        jInternalFrameCadastrarDados.setTitle("Informações pessoais");
        jInternalFrameCadastrarDados.setName(""); // NOI18N
        try {
            jInternalFrameCadastrarDados.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameCadastrarDados.setVisible(true);
        jInternalFrameCadastrarDados.getContentPane().setLayout(null);

        jLabelnome.setText("Nome");
        jInternalFrameCadastrarDados.getContentPane().add(jLabelnome);
        jLabelnome.setBounds(18, 14, 56, 14);

        jLabelidade.setText("Idade");
        jInternalFrameCadastrarDados.getContentPane().add(jLabelidade);
        jLabelidade.setBounds(18, 66, 71, 14);

        jLabelsexo.setText("Sexo");
        jInternalFrameCadastrarDados.getContentPane().add(jLabelsexo);
        jLabelsexo.setBounds(18, 40, 24, 14);

        jLabelCPF.setText("CPF");
        jInternalFrameCadastrarDados.getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(18, 92, 19, 14);

        jLabelnomepai.setText("Nome do pai");
        jInternalFrameCadastrarDados.getContentPane().add(jLabelnomepai);
        jLabelnomepai.setBounds(18, 115, 59, 14);

        jLabelnomemae.setText("Nome da mãe");
        jInternalFrameCadastrarDados.getContentPane().add(jLabelnomemae);
        jLabelnomemae.setBounds(18, 149, 65, 14);

        jButtonproximo.setText("Próximo");
        jButtonproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproximoActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarDados.getContentPane().add(jButtonproximo);
        jButtonproximo.setBounds(117, 172, 100, 23);
        jInternalFrameCadastrarDados.getContentPane().add(jTextFieldnome);
        jTextFieldnome.setBounds(117, 11, 218, 20);

        jComboBoxsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jInternalFrameCadastrarDados.getContentPane().add(jComboBoxsexo);
        jComboBoxsexo.setBounds(117, 37, 81, 20);
        jInternalFrameCadastrarDados.getContentPane().add(jTextFieldidade);
        jTextFieldidade.setBounds(117, 63, 218, 20);
        jInternalFrameCadastrarDados.getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(117, 89, 218, 20);
        jInternalFrameCadastrarDados.getContentPane().add(jTextFieldnomepai);
        jTextFieldnomepai.setBounds(117, 115, 218, 20);
        jInternalFrameCadastrarDados.getContentPane().add(jTextFieldnomemae);
        jTextFieldnomemae.setBounds(117, 146, 218, 20);

        jInternalFramecontato.setTitle("Informações de localização");
        jInternalFramecontato.setVisible(true);
        jInternalFramecontato.getContentPane().setLayout(null);

        jLabelcidade.setText("Cidade");
        jInternalFramecontato.getContentPane().add(jLabelcidade);
        jLabelcidade.setBounds(0, 44, 77, 14);

        jLabelestado.setText("Estado");
        jInternalFramecontato.getContentPane().add(jLabelestado);
        jLabelestado.setBounds(0, 18, 57, 14);

        jLabelemail.setText("Email");
        jInternalFramecontato.getContentPane().add(jLabelemail);
        jLabelemail.setBounds(0, 96, 24, 14);

        jLabeltelefone.setText("Telefone");
        jInternalFramecontato.getContentPane().add(jLabeltelefone);
        jLabeltelefone.setBounds(0, 127, 42, 14);

        jLabelbairro.setText("Bairro");
        jInternalFramecontato.getContentPane().add(jLabelbairro);
        jLabelbairro.setBounds(0, 70, 28, 14);
        jInternalFramecontato.getContentPane().add(jTextFieldestado);
        jTextFieldestado.setBounds(81, 15, 183, 20);
        jInternalFramecontato.getContentPane().add(jTextFieldcidade);
        jTextFieldcidade.setBounds(81, 41, 183, 20);
        jInternalFramecontato.getContentPane().add(jTextFieldbairro);
        jTextFieldbairro.setBounds(81, 67, 183, 20);
        jInternalFramecontato.getContentPane().add(jTextFieldemail);
        jTextFieldemail.setBounds(81, 93, 183, 20);
        jInternalFramecontato.getContentPane().add(jTextFieldtelefone);
        jTextFieldtelefone.setBounds(81, 124, 183, 20);

        jButtonproximo2.setText("Próximo");
        jButtonproximo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproximo2ActionPerformed(evt);
            }
        });
        jInternalFramecontato.getContentPane().add(jButtonproximo2);
        jButtonproximo2.setBounds(184, 151, 71, 23);

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        jInternalFramecontato.getContentPane().add(jButtonAnterior);
        jButtonAnterior.setBounds(84, 151, 94, 23);

        jInternalFrameDadosPaciente.setTitle("Ficha técnica");
        jInternalFrameDadosPaciente.setVisible(true);
        jInternalFrameDadosPaciente.getContentPane().setLayout(null);

        jLabelTipoSangue.setText("Tipo sanguíneo");
        jInternalFrameDadosPaciente.getContentPane().add(jLabelTipoSangue);
        jLabelTipoSangue.setBounds(10, 14, 85, 14);

        jLabelNomedoença.setText("Nome da doença");
        jInternalFrameDadosPaciente.getContentPane().add(jLabelNomedoença);
        jLabelNomedoença.setBounds(10, 37, 80, 14);

        jLabelrRegSUS.setText("Registro SUS");
        jInternalFrameDadosPaciente.getContentPane().add(jLabelrRegSUS);
        jLabelrRegSUS.setBounds(10, 63, 62, 14);

        jComboBoxTipoSangue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "AB+", "AB-", "O+", "O-" }));
        jInternalFrameDadosPaciente.getContentPane().add(jComboBoxTipoSangue);
        jComboBoxTipoSangue.setBounds(99, 11, 58, 20);
        jInternalFrameDadosPaciente.getContentPane().add(jTextFieldNomeDoença);
        jTextFieldNomeDoença.setBounds(100, 37, 173, 20);
        jInternalFrameDadosPaciente.getContentPane().add(jTextFieldRegSUS);
        jTextFieldRegSUS.setBounds(100, 63, 173, 20);

        jButtonSalvar.setText("Salvar");
        jInternalFrameDadosPaciente.getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(51, 204, 63, 23);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jInternalFrameDadosPaciente.getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(120, 204, 75, 23);

        jButtonAnterior2.setText("Anterior");
        jInternalFrameDadosPaciente.getContentPane().add(jButtonAnterior2);
        jButtonAnterior2.setBounds(201, 204, 71, 23);

        jDesktopPane1.setLayer(jInternalFrameCadastrarDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jInternalFramecontato, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jInternalFrameDadosPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jInternalFrameCadastrarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jInternalFramecontato, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jInternalFrameDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 356, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jInternalFramecontato, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jInternalFrameCadastrarDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jInternalFrameDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jInternalFrameCadastrarDados.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
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
        jInternalFrameDadosPaciente.setVisible(true);

    }//GEN-LAST:event_jButtonproximo2ActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        jInternalFramecontato.setVisible(false);
        jInternalFrameCadastrarDados.setVisible(true);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
            jInternalFrameCadastrarDados.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CadastroPaciente().setVisible(true);
                new login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonAnterior2;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonproximo;
    private javax.swing.JButton jButtonproximo2;
    private javax.swing.JComboBox<String> jComboBoxTipoSangue;
    private javax.swing.JComboBox<String> jComboBoxsexo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameCadastrarDados;
    private javax.swing.JInternalFrame jInternalFrameContato;
    private javax.swing.JInternalFrame jInternalFrameDadosPaciente;
    private javax.swing.JInternalFrame jInternalFramecontato;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelNomedoença;
    private javax.swing.JLabel jLabelTipoSangue;
    private javax.swing.JLabel jLabelbairro;
    private javax.swing.JLabel jLabelcidade;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabelestado;
    private javax.swing.JLabel jLabelidade;
    private javax.swing.JLabel jLabelnome;
    private javax.swing.JLabel jLabelnomemae;
    private javax.swing.JLabel jLabelnomepai;
    private javax.swing.JLabel jLabelrRegSUS;
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
    private javax.swing.JTextField jTextFieldNomeDoença;
    private javax.swing.JTextField jTextFieldRegSUS;
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
