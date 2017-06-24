package eventos;

import janelas.CadastroFichaTecnica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import metodos.Ficha;
import log.ArquivoManipular;
import exception.AplicacaoException;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FichaActionListener implements ActionListener {

    private CadastroFichaTecnica frame;

    public FichaActionListener(CadastroFichaTecnica frame) {
        this.frame = frame;
    }


    @Override
  public void actionPerformed(ActionEvent e) {
        //todo: VAI TER ACESSO AO CADASTRO
        String mensagem = "";
        if("gravar".equals(e.getActionCommand())){
            //o botão gravar foi clicado
            mensagem = "gravando dados da ficha tecnica";
            Ficha fic = frame.getFicha();
            System.out.println(fic.toString());
            try {
                ErrosFic(fic.getRegSUS(), fic.getNomeDoença(), fic.getAltura(), fic.getPeso());
                
                JOptionPane.showMessageDialog(null, mensagem = "Operação Salva com Sucesso !");
            } catch (AplicacaoException ex) {
                Logger.getLogger(LocalizacaoActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    ArquivoManipular.EscreverArquivo("log.txt", new Date() + " -> Tela: " + this.frame.getClass() + " = " + mensagem + "\r\n", true);
                } catch (IOException ex) {
                    Logger.getLogger(LocalizacaoActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if ("limpar".equals(e.getActionCommand())){
             frame.Limpar();
             mensagem = "limpando dados da ficha tecnica";
                try {
                    ArquivoManipular.EscreverArquivo("log.txt", new Date() + " -> Tela: " + this.frame.getClass() + " = " + mensagem + "\r\n", true);
                } catch (IOException ex) {
                    Logger.getLogger(LocalizacaoActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        if("cancelar".equals(e.getActionCommand())){
            frame.dispose();
            mensagem = "cancelar janela da ficha tecnica";
                try {
                    ArquivoManipular.EscreverArquivo("log.txt", new Date() + " -> Tela: " + this.frame.getClass() + " = " + mensagem + "\r\n", true);
                } catch (IOException ex) {
                    Logger.getLogger(LocalizacaoActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    }
  
  private void ErrosFic(String SUS, String doenca, String altura, String peso) throws AplicacaoException {

        if (SUS == null || SUS.isEmpty() || doenca == null || doenca.isEmpty() || altura == null || altura.isEmpty()
                || peso == null || peso.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            throw new AplicacaoException("Todos os campos devem ser preenchidos");
           
        }
    }
  
}
