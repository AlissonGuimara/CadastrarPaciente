package eventos;

import janelas.CadastrarLocalizacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import metodos.Localizacao;

public class LocalizacaoActionListener implements ActionListener {
    
    private CadastrarLocalizacao frame;
    
    public LocalizacaoActionListener(CadastrarLocalizacao frame){
        this.frame = frame;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //todo: VAI TER ACESSO AO CADASTRO
        if("gravar".equals(e.getActionCommand())){
            //o botão gravar foi clicado
            Localizacao loc = frame.getLocalizacao();
            System.out.println(loc.toString());
            System.out.println("ASJKASJKD");
        }
        
    }
}
