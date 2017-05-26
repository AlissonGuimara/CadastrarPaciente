
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
        jTextFieldnomepai = new javax.swing.JTextField();
        jTextFieldnomemae = new javax.swing.JTextField();
        jFormattedTextFieldIdade = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jInternalFrameFichaTecnica = new javax.swing.JInternalFrame();
        jLabelTipoSangue = new javax.swing.JLabel();
        jLabelNomedoença = new javax.swing.JLabel();
        jLabelrRegSUS = new javax.swing.JLabel();
        jComboBoxTipoSangue = new javax.swing.JComboBox<>();
        jTextFieldNomeDoença = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAnterior2 = new javax.swing.JButton();
        jLabelAltura = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jFormattedTextFieldAltura = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPeso = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSUS = new javax.swing.JFormattedTextField();
        jInternalFrameLocalizacao = new javax.swing.JInternalFrame();
        jLabelcidade = new javax.swing.JLabel();
        jLabelestado = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        jLabeltelefone = new javax.swing.JLabel();
        jLabelbairro = new javax.swing.JLabel();
        jTextFieldcidade = new javax.swing.JTextField();
        jTextFieldbairro = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jButtonproximo2 = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jComboBoxEstados = new javax.swing.JComboBox<>();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadastrar = new javax.swing.JMenuItem();
        jMenuItemBuscarPaciente = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

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

        jLabelnome.setText("Nome");

        jLabelidade.setText("Idade");

        jLabelsexo.setText("Sexo");

        jLabelCPF.setText("CPF");

        jLabelnomepai.setText("Nome do pai");

        jLabelnomemae.setText("Nome da mãe");

        jButtonproximo.setText("Próximo");
        jButtonproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproximoActionPerformed(evt);
            }
        });

        jComboBoxsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        try {
            jFormattedTextFieldIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jInternalFrameInformaçõesPessoaisLayout = new javax.swing.GroupLayout(jInternalFrameInformaçõesPessoais.getContentPane());
        jInternalFrameInformaçõesPessoais.getContentPane().setLayout(jInternalFrameInformaçõesPessoaisLayout);
        jInternalFrameInformaçõesPessoaisLayout.setHorizontalGroup(
            jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelnome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelsexo)
                        .addGap(75, 75, 75)
                        .addComponent(jComboBoxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPF))
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldIdade)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelnomepai)
                        .addGap(40, 40, 40)
                        .addComponent(jTextFieldnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelnomemae)
                        .addGap(34, 34, 34)
                        .addComponent(jTextFieldnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButtonproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameInformaçõesPessoaisLayout.setVerticalGroup(
            jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelnome))
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelsexo))
                    .addComponent(jComboBoxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelidade)
                    .addComponent(jFormattedTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelnomepai)
                    .addComponent(jTextFieldnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jInternalFrameInformaçõesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameInformaçõesPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelnomemae))
                    .addComponent(jTextFieldnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jButtonproximo))
        );

        getContentPane().add(jInternalFrameInformaçõesPessoais);
        jInternalFrameInformaçõesPessoais.setBounds(20, 20, 340, 240);
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

        try {
            jFormattedTextFieldAltura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldSUS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jInternalFrameFichaTecnicaLayout = new javax.swing.GroupLayout(jInternalFrameFichaTecnica.getContentPane());
        jInternalFrameFichaTecnica.getContentPane().setLayout(jInternalFrameFichaTecnicaLayout);
        jInternalFrameFichaTecnicaLayout.setHorizontalGroup(
            jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNomedoença)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldNomeDoença, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonSalvar)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonCancelar)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonAnterior2))
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPeso))
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldPeso)))
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoSangue, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelrRegSUS))
                        .addGap(4, 4, 4)
                        .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTipoSangue, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldSUS))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameFichaTecnicaLayout.setVerticalGroup(
            jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelrRegSUS)
                    .addComponent(jFormattedTextFieldSUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelTipoSangue))
                    .addComponent(jComboBoxTipoSangue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelNomedoença))
                    .addComponent(jTextFieldNomeDoença, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelAltura))
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelPeso))
                    .addGroup(jInternalFrameFichaTecnicaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jInternalFrameFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAnterior2)))
        );

        getContentPane().add(jInternalFrameFichaTecnica);
        jInternalFrameFichaTecnica.setBounds(660, 20, 290, 240);

        jInternalFrameLocalizacao.setTitle("Informações de localização");
        jInternalFrameLocalizacao.setVisible(true);
        jInternalFrameLocalizacao.getContentPane().setLayout(null);

        jLabelcidade.setText("Cidade");
        jInternalFrameLocalizacao.getContentPane().add(jLabelcidade);
        jLabelcidade.setBounds(0, 44, 77, 14);

        jLabelestado.setText("Estado");
        jInternalFrameLocalizacao.getContentPane().add(jLabelestado);
        jLabelestado.setBounds(0, 18, 57, 14);

        jLabelemail.setText("Email");
        jInternalFrameLocalizacao.getContentPane().add(jLabelemail);
        jLabelemail.setBounds(0, 96, 24, 14);

        jLabeltelefone.setText("Telefone");
        jInternalFrameLocalizacao.getContentPane().add(jLabeltelefone);
        jLabeltelefone.setBounds(0, 127, 42, 14);

        jLabelbairro.setText("Bairro");
        jInternalFrameLocalizacao.getContentPane().add(jLabelbairro);
        jLabelbairro.setBounds(0, 70, 28, 14);
        jInternalFrameLocalizacao.getContentPane().add(jTextFieldcidade);
        jTextFieldcidade.setBounds(81, 41, 183, 20);
        jInternalFrameLocalizacao.getContentPane().add(jTextFieldbairro);
        jTextFieldbairro.setBounds(81, 67, 183, 20);
        jInternalFrameLocalizacao.getContentPane().add(jTextFieldemail);
        jTextFieldemail.setBounds(81, 93, 183, 20);

        jButtonproximo2.setText("Próximo");
        jButtonproximo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproximo2ActionPerformed(evt);
            }
        });
        jInternalFrameLocalizacao.getContentPane().add(jButtonproximo2);
        jButtonproximo2.setBounds(172, 151, 71, 23);

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        jInternalFrameLocalizacao.getContentPane().add(jButtonAnterior);
        jButtonAnterior.setBounds(80, 151, 86, 23);

        jComboBoxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC  \t", "AL \t ", "AP \t ", "AM \t ", "BA \t ", "CE \t ", "DF", "ES \t ", "GO \t ", "MA \t ", "MT \t ", "MS \t ", "MG \t ", "PA \t  \t", "PB \t  ", "PR \t ", "PE \t ", "PI \t ", "RJ \t ", "RN \t ", "RS \t ", "RO \t ", "RR \t ", "SC \t ", "SP \t ", "SE \t ", "TO", " " }));
        jInternalFrameLocalizacao.getContentPane().add(jComboBoxEstados);
        jComboBoxEstados.setBounds(81, 15, 47, 20);

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jInternalFrameLocalizacao.getContentPane().add(jFormattedTextFieldTelefone);
        jFormattedTextFieldTelefone.setBounds(80, 120, 180, 20);

        getContentPane().add(jInternalFrameLocalizacao);
        jInternalFrameLocalizacao.setBounds(370, 20, 280, 240);

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

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjudaActionPerformed(evt);
            }
        });

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

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
        met.setRegSUS(jFormattedTextFieldSUS.getText());
        met.setAltura(jFormattedTextFieldAltura.getText());
        met.setPeso(jFormattedTextFieldPeso.getText());
        
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
                 
       
            met.setEstado(jComboBoxEstados.getSelectedItem().toString());
            met.setCidade(jTextFieldcidade.getText());
            met.setBairro(jTextFieldbairro.getText());
            met.setEmail(jTextFieldemail.getText());
            met.setTelefone(jFormattedTextFieldTelefone.getText());
        
        jInternalFrameLocalizacao.setVisible(false);
        jInternalFrameFichaTecnica.setVisible(true);
    }//GEN-LAST:event_jButtonproximo2ActionPerformed

    private void jButtonproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonproximoActionPerformed
           
        
    
            met.setNome(jTextFieldnome.getText());
            met.setSexo(jComboBoxsexo.getSelectedItem().toString());
            met.setIdade(Integer.parseInt(jFormattedTextFieldIdade.getText()));
            met.setCpf(jFormattedTextFieldCPF.getText());
            met.setNomePai(jTextFieldnomepai.getText());
            met.setNomeMae(jTextFieldnomemae.getText());
        
            met.setIdade(0);
            
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

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjudaActionPerformed

    }//GEN-LAST:event_jMenuAjudaActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
     JOptionPane.showMessageDialog(null,"Projeto desenvolvido por: Alisson Guimara, Carlos Kombo, Novato Martins");
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

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
    private javax.swing.JFormattedTextField jFormattedTextFieldAltura;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdade;
    private javax.swing.JFormattedTextField jFormattedTextFieldPeso;
    private javax.swing.JFormattedTextField jFormattedTextFieldSUS;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
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
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBuscarPaciente;
    private javax.swing.JMenuItem jMenuItemCadastrar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNomeDoença;
    private javax.swing.JTextField jTextFieldbairro;
    private javax.swing.JTextField jTextFieldcidade;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldnomemae;
    private javax.swing.JTextField jTextFieldnomepai;
    // End of variables declaration//GEN-END:variables

}
