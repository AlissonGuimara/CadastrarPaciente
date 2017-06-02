package janelas;
import LerSalvar.Salvar;
import LerSalvar.Ler;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import metodos.Ficha;
import metodos.Localizacao;
import metodos.Pessoa;
import metodos.VarSalvar;
//import metodos.VarSalvar;

public class CadastroPaciente extends javax.swing.JFrame {

    Localizacao l = new Localizacao();
    Salvar salvar = new Salvar();
    Ler ler = new Ler();
    Pessoa p = new Pessoa();
    Ficha f = new Ficha();
    JFileChooser fc = new JFileChooser();
    VarSalvar v = new VarSalvar();
    

    
    public CadastroPaciente() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameContato = new javax.swing.JInternalFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cadastrar = new javax.swing.JMenuItem();
        Localização = new javax.swing.JMenuItem();
        FichaTecnica = new javax.swing.JMenuItem();
        ItemSalvar = new javax.swing.JMenuItem();
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

        jPanel1.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Cadastrar.setText("Cadastrar Paciente");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(Cadastrar);

        Localização.setText("Cadastrar Localização");
        Localização.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalizaçãoActionPerformed(evt);
            }
        });
        jMenu1.add(Localização);

        FichaTecnica.setText("Cadastrar Ficha Técnica");
        FichaTecnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaTecnicaActionPerformed(evt);
            }
        });
        jMenu1.add(FichaTecnica);

        ItemSalvar.setText("Salvar");
        ItemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSalvarActionPerformed(evt);
            }
        });
        jMenu1.add(ItemSalvar);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
       //jInternalFrameInformaçõesPessoais.setVisible(true);
        DadosPessoais dad = new DadosPessoais();
       
        jDesktopPane1.add(dad);
        dad.setVisible(true);
                 
    }//GEN-LAST:event_CadastrarActionPerformed

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

    private void LocalizaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalizaçãoActionPerformed
        CadastrarLocalizacao loc = new CadastrarLocalizacao();
        jDesktopPane1.add(loc);
        loc.setVisible(true);
              
    }//GEN-LAST:event_LocalizaçãoActionPerformed

    private void FichaTecnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaTecnicaActionPerformed
        CadastroFichaTecnica fic = new CadastroFichaTecnica();
        jDesktopPane1.add(fic);
        fic.setVisible(true);
              
    }//GEN-LAST:event_FichaTecnicaActionPerformed

    private void ItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSalvarActionPerformed
        
        salvar.gravarArquivo(v.getSalvar(), "oiiii");
    }//GEN-LAST:event_ItemSalvarActionPerformed

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
    private javax.swing.JMenuItem Cadastrar;
    private javax.swing.JMenuItem FichaTecnica;
    private javax.swing.JMenuItem ItemSalvar;
    private javax.swing.JMenuItem Localização;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JInternalFrame jInternalFrameContato;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBuscarPaciente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
