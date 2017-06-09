
package eventos;

import janelas.DadosPessoais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import metodos.Pessoa;


public class DadospActionListener implements ActionListener{
    
    private DadosPessoais frame;
    
    public DadospActionListener (DadosPessoais frame){
    this.frame = frame;
    }
    
    @Override
   public void actionPerformed(ActionEvent e) {
        //todo: VAI TER ACESSO AO CADASTRO
        if("gravar".equals(e.getActionCommand())){
            //o botão gravar foi clicado
            Pessoa pe = frame.getPessoa();
            System.out.println(pe.toString());
        }
        if ("limpar".equals(e.getActionCommand())){
             frame.Limpar();
        }
        
        if("cancelar".equals(e.getActionCommand())){
            frame.dispose();
            
        }
        
    }
    
    
    
}
