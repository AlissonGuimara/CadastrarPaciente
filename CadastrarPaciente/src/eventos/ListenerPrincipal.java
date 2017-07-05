package eventos;

import janelas.CadastrarLocalizacao;
import janelas.CadastrarPaciente;
import janelas.CadastroFichaTecnica;
import janelas.CadastroPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ListenerPrincipal implements ActionListener {

    private CadastroPaciente frame;
    protected CadastrarPaciente dad = null;
    protected CadastrarLocalizacao loc = null;
    protected CadastroFichaTecnica fic = null;

    public ListenerPrincipal(CadastroPaciente frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //todo: VAI TER ACESSO AO CADASTRO
        if ("Cadastrar".equals(e.getActionCommand())) {
            //o botão Cadastrar foi clicado
            if (dad == null || dad.isClosed()) {
                dad = new CadastrarPaciente();
                frame.jDesktopPane1().add(dad);
                dad.setVisible(true);
            }
            frame.jDesktopPane1().moveToFront(dad);
        }

        if ("Localização".equals(e.getActionCommand())) {
            //o botão Cadastrar foi clicado
            if (loc == null || loc.isClosed()) {
                loc = new CadastrarLocalizacao();
                frame.jDesktopPane1().add(loc);
                loc.setVisible(true);
            }
            frame.jDesktopPane1().moveToFront(loc);
        }

        if ("FichaTecnica".equals(e.getActionCommand())) {

            if (fic == null || fic.isClosed()) {
                fic = new CadastroFichaTecnica();
                frame.jDesktopPane1().add(fic);
                fic.setVisible(true);
            }
            frame.jDesktopPane1().moveToFront(fic);
        }
        
        if ("sobre".equals(e.getActionCommand())) {

         JOptionPane.showMessageDialog(null, "Projeto desenvolvido por: Alisson Guimara, Carlos Kombo, Novato Martins");
        }
        
           if ("Sair".equals(e.getActionCommand())) {
            
               System.exit(0);
        }

    }
}
