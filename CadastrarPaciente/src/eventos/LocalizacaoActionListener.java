package eventos;

import janelas.CadastrarLocalizacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import metodos.Localizacao;
import log.ArquivoManipular;
import exception.AplicacaoException;
import javax.swing.JOptionPane;

public class LocalizacaoActionListener implements ActionListener {

    public CadastrarLocalizacao frame;

    public LocalizacaoActionListener(CadastrarLocalizacao frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //todo: VAI TER ACESSO AO CADASTRO
        String mensagem = "";
        if ("gravar".equals(e.getActionCommand())) {
            //o botão gravar foi clicado
            mensagem = "gravando dados de localização";
            Localizacao loc = frame.getLocalizacao();
            System.out.println(loc.toString());
            try {
                ErrosLoc(loc.getCidade(), loc.getBairro(), loc.getEmail(), loc.getTelefone());
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
            if ("limpar".equals(e.getActionCommand())) {
                frame.Limpar();
                mensagem = "limpando dados de localização";
                try {
                    ArquivoManipular.EscreverArquivo("log.txt", new Date() + " -> Tela: " + this.frame.getClass() + " = " + mensagem + "\r\n", true);
                } catch (IOException ex) {
                    Logger.getLogger(LocalizacaoActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if ("cancelar".equals(e.getActionCommand())) {
                frame.dispose();
                mensagem = "cancelar janela de localização";
                try {
                    ArquivoManipular.EscreverArquivo("log.txt", new Date() + " -> Tela: " + this.frame.getClass() + " = " + mensagem + "\r\n", true);
                } catch (IOException ex) {
                    Logger.getLogger(LocalizacaoActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    
    private void ErrosLoc(String cidade, String bairro, String email, String telefone) throws AplicacaoException {

        if (cidade == null || cidade.isEmpty() || bairro == null || bairro.isEmpty() || email == null || email.isEmpty()
                || telefone == null || telefone.isEmpty()) {
            
            JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos" );
            throw new AplicacaoException("Todos os campos devem ser preenchidos");
        }
    }
}
