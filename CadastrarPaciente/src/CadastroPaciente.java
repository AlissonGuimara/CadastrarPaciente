
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
        this.setExtendedState(MAXIMIZED_BOTH);
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
        jLabelAltura = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jInternalFrameLocalizacao = new javax.swing.JInternalFrame();
        jLabelcidade = new javax.swing.JLabel();
        jLabelestado = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        jLabeltelefone = new javax.swing.JLabel();
        jLabelbairro = new javax.swing.JLabel();
        jTextFieldcidade = new javax.swing.JTextField();
        jTextFieldbairro = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jTextFieldtelefone = new javax.swing.JTextField();
        jButtonproximo2 = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jComboBoxEstados = new javax.swing.JComboBox<>();
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
        getContentPane().setLayout(null);

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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

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

        jTextFieldCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jInternalFrameInformaçõesPessoais.getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(117, 89, 218, 20);
        jInternalFrameInformaçõesPessoais.getContentPane().add(jTextFieldnomepai);
        jTextFieldnomepai.setBounds(117, 115, 218, 20);
        jInternalFrameInformaçõesPessoais.getContentPane().add(jTextFieldnomemae);
        jTextFieldnomemae.setBounds(117, 146, 218, 20);

        getContentPane().add(jInternalFrameInformaçõesPessoais);
        jInternalFrameInformaçõesPessoais.setBounds(18, 20, 360, 440);
        jInternalFrameInformaçõesPessoais.getAccessibleContext().setAccessibleDescription("");

        jInternalFrameFichaTecnica.setTitle("Ficha técnica");
        jInternalFrameFichaTecnica.setVisible(true);

        jLabelTipoSangue.setText("Tipo sanguíneo");

        jLabelNomedoença.setText("Nome da doença");

        jLabelrRegSUS.setText("Registro SUS");

        jComboBoxTipoSangue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "AB+", "AB-", "O+", "O-" }));

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAnterior2.setText("Anterior");
        jButtonAnterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnterior2ActionPerformed(evt);
            }
        });

        jLabelAltura.setText("Altura");

        jLabelPeso.setText("Peso");

        javax.swing.GroupLayout jInternalFrameFichaTecnicaLayout = new javax.swing.GroupLayout(jInternalFrameFichaTecnica.getContentPane());
        jInternalFrameFichaTecnica.getContentPane().setLayout(jInternalFrameFichaTecnicaLayout);
        jInternalFrameFichaTecnicaLayout.setHorizontalGroup(
            jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeso))
                .addGap(28, 28, 28)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButtonSalvar)
                .addGap(6, 6, 6)
                .addComponent(jButtonCancelar)
                .addGap(6, 6, 6)
                .addComponent(jButtonAnterior2))
            .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomedoença)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeDoença, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTipoSangue, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelrRegSUS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldRegSUS, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoSangue, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jInternalFrameFichaTecnicaLayout.setVerticalGroup(
            jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelrRegSUS)
                    .addComponent(jTextFieldRegSUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoSangue)
                    .addComponent(jComboBoxTipoSangue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomedoença)
                    .addComponent(jTextFieldNomeDoença, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAltura)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAnterior2)))
        );

        getContentPane().add(jInternalFrameFichaTecnica);
        jInternalFrameFichaTecnica.setBounds(680, 20, 328, 440);

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

        jComboBoxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC  \t", "AL \t ", "AP \t ", "AM \t ", "BA \t ", "CE \t ", "DF", "ES \t ", "GO \t ", "MA \t ", "MT \t ", "MS \t ", "MG \t ", "PA \t  \t", "PB \t  ", "PR \t ", "PE \t ", "PI \t ", "RJ \t ", "RN \t ", "RS \t ", "RO \t ", "RR \t ", "SC \t ", "SP \t ", "SE \t ", "TO", " " }));

        javax.swing.GroupLayout jInternalFrameLocalizacaoLayout = new javax.swing.GroupLayout(jInternalFrameLocalizacao.getContentPane());
        jInternalFrameLocalizacao.getContentPane().setLayout(jInternalFrameLocalizacaoLayout);
        jInternalFrameLocalizacaoLayout.setHorizontalGroup(
            jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                        .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelestado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        jInternalFrameLocalizacaoLayout.setVerticalGroup(
            jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLocalizacaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jInternalFrameLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelestado)
                    .addComponent(jComboBoxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        getContentPane().add(jInternalFrameLocalizacao);
        jInternalFrameLocalizacao.setBounds(380, 20, 294, 440);

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
        met.setAltura(Float.parseFloat(jTextFieldAltura.getText()));
        met.setPeso(Float.parseFloat(jTextFieldPeso.getText()));
        
        //String nome = Integer.toString(met.getCpf());
        met.setSalvar();
        salvar.gravarArquivo(met.getSalvar(), met.getNome());
        jInternalFrameFichaTecnica.setVisible(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        jInternalFrameLocalizacao.setVisible(false);
        jInternalFrameInformaçõesPessoais.setVisible(true);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonproximo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonproximo2ActionPerformed
                 
        try {
            met.setEstado(jComboBoxEstados.getSelectedItem().toString());
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

        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        fc.showOpenDialog(this);

        File selFile = fc.getSelectedFile();

        System.out.println (selFile.getAbsolutePath());
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
    private javax.swing.JComboBox<String> jComboBoxEstados;
    private javax.swing.JComboBox<String> jComboBoxTipoSangue;
    private javax.swing.JComboBox<String> jComboBoxsexo;
    private javax.swing.JInternalFrame jInternalFrameContato;
    private javax.swing.JInternalFrame jInternalFrameFichaTecnica;
    private javax.swing.JInternalFrame jInternalFrameInformaçõesPessoais;
    private javax.swing.JInternalFrame jInternalFrameLocalizacao;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelNomedoença;
    private javax.swing.JLabel jLabelPeso;
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
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldNomeDoença;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldRegSUS;
    private javax.swing.JTextField jTextFieldbairro;
    private javax.swing.JTextField jTextFieldcidade;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldidade;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldnomemae;
    private javax.swing.JTextField jTextFieldnomepai;
    private javax.swing.JTextField jTextFieldtelefone;
    // End of variables declaration//GEN-END:variables

}
