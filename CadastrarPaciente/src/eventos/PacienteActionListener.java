package eventos;

import connection.FichaDao;
import connection.PacienteDao;
import janelas.CadastrarPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import metodos.Pessoa;
import log.ArquivoManipular;
import exception.AplicacaoException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metodos.Ficha;

public class PacienteActionListener implements ActionListener {

    private CadastrarPaciente frame;
    private Pessoa pe = new Pessoa();
    private PacienteDao dao = new PacienteDao();

    public PacienteActionListener(CadastrarPaciente frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //todo: VAI TER ACESSO AO CADASTRO
        String mensagem = "";
        if ("gravar".equals(e.getActionCommand())) {
            //o botão gravar foi clicado
            mensagem = "Gravando os dados pessoais";
            //Pessoa pe = frame.getPessoa();
            this.pe = this.frame.getPessoa();
            
            System.out.println(pe.toString());
            try {
                ErrosDad(this.pe.getCodigo(), this.pe.getNome(), this.pe.getIdade(), this.pe.getCpf(), this.pe.getNomePai(), this.pe.getNomeMae());
                dao.insert(pe);                
                JOptionPane.showMessageDialog(null, mensagem = "Operação Salva com Sucesso !");
            } catch (AplicacaoException ex) {
                Logger.getLogger(PacienteActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PacienteActionListener.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, mensagem = ex.getMessage());
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
            }

            if ("cancelar".equals(e.getActionCommand())) {
                frame.dispose();

            }

        }
    
    private void ErrosDad(String codigo, String nome, String idade, String cpf, String nomepai, String nomemae) throws AplicacaoException {

        if (codigo == null || codigo.isEmpty() || nome == null || nome.isEmpty() || idade == null || idade.isEmpty()
                || cpf == null || cpf.isEmpty() || nomepai == null || nomepai.isEmpty() || nomemae == null
                || nomemae.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            throw new AplicacaoException("Todos os campos devem ser preenchidos");
        }
    }

}
