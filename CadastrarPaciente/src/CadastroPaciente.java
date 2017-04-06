
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class CadastroPaciente extends javax.swing.JFrame {

    Metodos met = new Metodos();
    Salvar salvar = new Salvar();
    Ler ler = new Ler();
    JFileChooser fc = new JFileChooser();

    public CadastroPaciente() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
        jInternalFrameInformaçõesPessoais.setVisible(false);
        jInternalFrameLocalizacao.setVisible(false);
        jInternalFrameFichaTecnica.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameContato = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrameInformaçõesPessoais = new javax.swing.JInternalFrame();
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
        jInternalFrameFichaTecnica = new javax.swing.JInternalFrame();
        jLabelTipoSangue = new javax.swing.JLabel();
        jLabelNomedoença = new javax.swing.JLabel();
        jLabelrRegSUS = new javax.swing.JLabel();
        jComboBoxTipoSangue = new javax.swing.JComboBox<>();
        jTextFieldNomeDoença = new javax.swing.JTextField();
        jTextFieldRegSUS = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAnterior2 = new javax.swing.JButton();
        jInternalFrameLocalizacao = new javax.swing.JInternalFrame();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadastrar = new javax.swing.JMenuItem();
        jMenuItemBuscarPaciente = new javax.swing.JMenuItem();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jInternalFrameInformaçõesPessoais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jInternalFrameInformaçõesPessoais.setTitle("Informações pessoais");
        jInternalFrameInformaçõesPessoais.setName(""); // NOI18N
        try {
            jInternalFrameInformaçõesPessoais.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameInformaçõesPessoais.setVisible(true);
        jInternalFrameInformaçõesPessoais.getContentPane().setLayout(null);

        jLabelnome.setText("Nome");
        jInternalFrameInformaçõesPessoais.getContentPane().add(jLabelnome);
        jLabelnome.setBounds(18, 14, 56, 14);

        jLabelidade.setText("Idade");
        jInternalFrameInformaçõesPessoais.getContentPane().add(jLabelidade);
        jLabelidade.setBounds(18, 66, 71, 14);

        jLabelsexo.setText("Sexo");
        jInternalFrameInformaçõesPessoais.getContentPane().add(jLabelsexo);
        jLabelsexo.setBounds(18, 40, 24, 14);

        jLabelCPF.setText("CPF");
        jInternalFrameInformaçõesPessoais.getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(18, 92, 19, 14);

        jLabelnomepai.setText("Nome do pai");
        jInternalFrameInformaçõesPessoais.getContentPane().add(jLabelnomepai);
        jLabelnomepai.setBounds(18, 115, 59, 14);

        jLabelnomemae.setText("Nome da mãe");
        jInternalFrameInformaçõesPessoais.getContentPane().add(jLabelnomemae);
        jLabelnomemae.setBounds(18, 149, 65, 14);

        jButtonproximo.setText("Próximo");
        jButtonproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproximoActionPerformed(evt);
            }
        });
        jInternalFrameInformaçõesPessoais.getContentPane().add(jButtonproximo);
        jButtonproximo.setBounds(117, 172, 100, 23);
        jInternalFrameInformaçõesPessoais.getContentPane().add(jTextFieldnome);
        jTextFieldnome.setBounds(117, 11, 218, 20);

        jComboBoxsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jInternalFrameInformaçõesPessoais.getContentPane().add(jComboBoxsexo);
        jComboBoxsexo.setBounds(117, 37, 81, 20);
        jInternalFrameInformaçõesPessoais.getContentPane().add(jTextFieldidade);
        jTextFieldidade.setBounds(117, 63, 218, 20);
        jInternalFrameInformaçõesPessoais.getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(117, 89, 218, 20);
        jInternalFrameInformaçõesPessoais.getContentPane().add(jTextFieldnomepai);
        jTextFieldnomepai.setBounds(117, 115, 218, 20);
        jInternalFrameInformaçõesPessoais.getContentPane().add(jTextFieldnomemae);
        jTextFieldnomemae.setBounds(117, 146, 218, 20);

        jInternalFrameFichaTecnica.setTitle("Ficha técnica");
        jInternalFrameFichaTecnica.setVisible(true);
        jInternalFrameFichaTecnica.getContentPane().setLayout(null);

        jLabelTipoSangue.setText("Tipo sanguíneo");
        jInternalFrameFichaTecnica.getContentPane().add(jLabelTipoSangue);
        jLabelTipoSangue.setBounds(10, 14, 85, 14);

        jLabelNomedoença.setText("Nome da doença");
        jInternalFrameFichaTecnica.getContentPane().add(jLabelNomedoença);
        jLabelNomedoença.setBounds(10, 37, 80, 14);

        jLabelrRegSUS.setText("Registro SUS");
        jInternalFrameFichaTecnica.getContentPane().add(jLabelrRegSUS);
        jLabelrRegSUS.setBounds(10, 63, 62, 14);

        jComboBoxTipoSangue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "AB+", "AB-", "O+", "O-" }));
        jInternalFrameFichaTecnica.getContentPane().add(jComboBoxTipoSangue);
        jComboBoxTipoSangue.setBounds(99, 11, 58, 20);
        jInternalFrameFichaTecnica.getContentPane().add(jTextFieldNomeDoença);
        jTextFieldNomeDoença.setBounds(100, 37, 173, 20);
        jInternalFrameFichaTecnica.getContentPane().add(jTextFieldRegSUS);
        jTextFieldRegSUS.setBounds(100, 63, 173, 20);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jInternalFrameFichaTecnica.getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(51, 204, 63, 23);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jInternalFrameFichaTecnica.getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(120, 204, 75, 23);

        jButtonAnterior2.setText("Anterior");
        jButtonAnterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnterior2ActionPerformed(evt);
            }
        });
        jInternalFrameFichaTecnica.getContentPane().add(jButtonAnterior2);
        jButtonAnterior2.setBounds(201, 204, 71, 23);

        jInternalFrameLocalizacao.setTitle("Informações de localização");
        jInternalFrameLocalizacao.setVisible(true);

        jLabelcidade.setText("Cidade");

        jLabelestado.setText("Estado");

        jLabelemail.setText("Email");

        jLabeltelefone.setText("Telefone");

        jLabelbairro.setText("Bairro");

        jButtonproximo2.setText("Próximo");
        jButtonproximo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproximo2ActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameLocalizacaoLayout = new javax.swing.GroupLayout(jInternalFrameLocalizacao.getContentPane());
        jInternalFrameLocalizacao.getContentPane().setLayout(jInternalFrameLocalizacaoLayout);
        jInternalFrameLocalizacaoLayout.setHorizontalGroup(
            jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addComponent(jLabelestado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jTextFieldestado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addComponent(jLabelcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addComponent(jLabelbairro)
                        .addGap(53, 53, 53)
                        .addComponent(jTextFieldbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonproximo2))
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelemail)
                            .addComponent(jLabeltelefone))
                        .addGap(39, 39, 39)
                        .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        jInternalFrameLocalizacaoLayout.setVerticalGroup(
            jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelestado))
                    .addComponent(jTextFieldestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelcidade))
                    .addComponent(jTextFieldcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelbairro))
                    .addComponent(jTextFieldbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelemail))
                    .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabeltelefone))
                    .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonproximo2)
                    .addComponent(jButtonAnterior)))
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

        jMenuItemBuscarPaciente.setText("Buscar paciente");
        jMenuItemBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemBuscarPaciente);

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
                .addGap(18, 18, 18)
                .addComponent(jInternalFrameInformaçõesPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jInternalFrameLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jInternalFrameFichaTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrameInformaçõesPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrameLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrameFichaTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jInternalFrameInformaçõesPessoais.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarActionPerformed
        jInternalFrameInformaçõesPessoais.setVisible(true);

    }//GEN-LAST:event_jMenuItemCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jInternalFrameInformaçõesPessoais.setVisible(false);
        jInternalFrameLocalizacao.setVisible(false);
        jInternalFrameFichaTecnica.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        met.setTipoSangue(jComboBoxTipoSangue.getSelectedItem().toString());
        met.setNomeDoença(jTextFieldNomeDoença.getText());
        met.setRegSUS(Integer.parseInt(jTextFieldRegSUS.getText()));
        
        met.setSalvar();
        //JOptionPane.showMessageDialog(null, met.getSalvar());
        salvar.gravarArquivo(met.getSalvar());
        jInternalFrameFichaTecnica.setVisible(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        jInternalFrameLocalizacao.setVisible(false);
        jInternalFrameInformaçõesPessoais.setVisible(true);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

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
        jInternalFrameLocalizacao.setVisible(false);
        jInternalFrameFichaTecnica.setVisible(true);
    }//GEN-LAST:event_jButtonproximo2ActionPerformed

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
        jInternalFrameInformaçõesPessoais.setVisible(false);
        jInternalFrameLocalizacao.setVisible(true);
    }//GEN-LAST:event_jButtonproximoActionPerformed

    private void jButtonAnterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnterior2ActionPerformed
        jInternalFrameFichaTecnica.setVisible(false);
        jInternalFrameLocalizacao.setVisible(true);
    }//GEN-LAST:event_jButtonAnterior2ActionPerformed

    private void jMenuItemBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarPacienteActionPerformed

       
//Define que apenar diretórios podem ser selecionados

        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//Exibe o diálogo. Deve ser passado por parâmetro o JFrame de origem.

        fc.showOpenDialog(this);
//Captura o objeto File que representa o diretório selecionado.
        File selFile = fc.getSelectedFile();
//Mostra o caminho do diretório

        //System.out.println (selFile.getAbsolutePath());
        String sb = ler.lerArquivo(selFile);
        JOptionPane.showMessageDialog(null, sb);
    }//GEN-LAST:event_jMenuItemBuscarPacienteActionPerformed

    public static void main(String args[]) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (InstantiationException exc) {
            exc.printStackTrace();
        } catch (IllegalAccessException exc) {
            exc.printStackTrace();
        }

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
    private javax.swing.JInternalFrame jInternalFrameContato;
    private javax.swing.JInternalFrame jInternalFrameFichaTecnica;
    private javax.swing.JInternalFrame jInternalFrameInformaçõesPessoais;
    private javax.swing.JInternalFrame jInternalFrameLocalizacao;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemBuscarPaciente;
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
