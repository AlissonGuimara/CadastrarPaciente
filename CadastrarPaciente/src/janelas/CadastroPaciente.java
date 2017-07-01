package janelas;

import eventos.ListenerPrincipal;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class CadastroPaciente extends javax.swing.JFrame {

    private ListenerPrincipal listener = new ListenerPrincipal(this);
    
    protected CadastrarPaciente dad = null;
    protected CadastrarLocalizacao loc = null;
    protected CadastroFichaTecnica fic = null;

    public CadastroPaciente() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);

    }
    
    public  JDesktopPane jDesktopPane1(){
    
        return jDesktopPane1;
        
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
        setPreferredSize(new java.awt.Dimension(450, 450));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(450, 450));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2676, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1);

        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Cadastrar.setText("Cadastrar Paciente");
        /*
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        */
        jMenu1.add(Cadastrar);
        Cadastrar.addActionListener(listener);
        Cadastrar.setActionCommand("Cadastrar");

        Localização.setText("Cadastrar Localização");
        /*
        Localização.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalizaçãoActionPerformed(evt);
            }
        });
        */
        jMenu1.add(Localização);
        Localização.addActionListener(listener);
        Localização.setActionCommand("Localização");

        FichaTecnica.setText("Cadastrar Ficha Técnica");
        /*
        FichaTecnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaTecnicaActionPerformed(evt);
            }
        });
        */
        jMenu1.add(FichaTecnica);
        FichaTecnica.addActionListener(listener);
        FichaTecnica.setActionCommand("FichaTecnica");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
      
    }//GEN-LAST:event_CadastrarActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjudaActionPerformed

    }//GEN-LAST:event_jMenuAjudaActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Projeto desenvolvido por: Alisson Guimara, Carlos Kombo, Novato Martins");
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void LocalizaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalizaçãoActionPerformed
  
    }//GEN-LAST:event_LocalizaçãoActionPerformed

    private void FichaTecnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaTecnicaActionPerformed
       
    }//GEN-LAST:event_FichaTecnicaActionPerformed

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

            @Override
            public void run() {
                
                new login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cadastrar;
    private javax.swing.JMenuItem FichaTecnica;
    private javax.swing.JMenuItem Localização;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JInternalFrame jInternalFrameContato;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
