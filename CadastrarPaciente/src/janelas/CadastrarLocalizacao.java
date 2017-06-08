package janelas;
import eventos.LocalizacaoActionListener;
import metodos.Localizacao;

public class CadastrarLocalizacao extends javax.swing.JInternalFrame {
    
    private LocalizacaoActionListener listener = new LocalizacaoActionListener(this);
    
    Localizacao l = new Localizacao();

        
    public Localizacao getLocalizacao(){
        //Localizacao l = new Localizacao();
        l.setEstado(estados.getSelectedItem().toString());
        l.setCidade(cidade.getText());
        l.setBairro(bairro.getText());
        l.setEmail(email.getText());
        l.setTelefone(telefone.getText());
        return l;
    }
    
    public CadastrarLocalizacao() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1Nome9 = new javax.swing.JLabel();
        jLabel1Nome10 = new javax.swing.JLabel();
        jLabel1Nome11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        estados = new javax.swing.JComboBox<>();
        cidade = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        telefone = new javax.swing.JFormattedTextField();
        Cancelar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        gravar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Cadastrar Localização");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel1Nome9.setText("Cidade:");

        jLabel1Nome10.setText("Email:");

        jLabel1Nome11.setText("Telefone:");

        jLabel1.setText("Estado:");

        jLabel19.setText("Bairro:");

        estados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC  \t", "AL \t ", "AP \t ", "AM \t ", "BA \t ", "CE \t ", "DF", "ES \t ", "GO \t ", "MA \t ", "MT \t ", "MS \t ", "MG \t ", "PA \t  \t", "PB \t  ", "PR \t ", "PE \t ", "PI \t ", "RJ \t ", "RN \t ", "RS \t ", "RO \t ", "RR \t ", "SC \t ", "SP \t ", "SE \t ", "TO" }));

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        gravar.setText("Gravar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1Nome11)
                            .addComponent(jLabel1Nome10)
                            .addComponent(jLabel19)
                            .addComponent(jLabel1Nome9)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cidade, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(email)
                            .addComponent(bairro)
                            .addComponent(estados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(gravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limpar)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1Nome9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Nome10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1Nome11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Limpar)
                    .addComponent(gravar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.getAccessibleContext().setAccessibleName("Informações Pessoais");
        jPanel4.getAccessibleContext().setAccessibleDescription("Informaçoes Pessoais");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
            dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
            estados.setSelectedItem(null);
            cidade.setText(null);
            bairro.setText(null);
            email.setText(null);
            telefone.setText(null);
            
    }//GEN-LAST:event_LimparActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> estados;
    private javax.swing.JButton gravar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1Nome10;
    private javax.swing.JLabel jLabel1Nome11;
    private javax.swing.JLabel jLabel1Nome9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
}
