package eventos;

import janelas.CadastroFichaTecnica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import metodos.Ficha;

public class FichaActionListener implements ActionListener {

    private CadastroFichaTecnica frame;

    public FichaActionListener(CadastroFichaTecnica frame) {
        this.frame = frame;
    }


    @Override
  public void actionPerformed(ActionEvent e) {
        //todo: VAI TER ACESSO AO CADASTRO
        if("gravar".equals(e.getActionCommand())){
            //o botão gravar foi clicado
            Ficha fic = frame.getFicha();
            System.out.println(fic.toString());
        }
        if ("limpar".equals(e.getActionCommand())){
             frame.Limpar();
        }
        
        if("cancelar".equals(e.getActionCommand())){
            frame.dispose();
            
        }
    }
  
}
