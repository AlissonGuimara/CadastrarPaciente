
package log;

import janelas.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Logar implements ActionListener{

    UltimoUsuario ult = new UltimoUsuario();
  
    private login frame1;
    Login g = new Login();
   

    public LoginC(TelaLogin frame1) {
        this.frame1 = frame1;
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        g.setUsuario(frame1.usuario.getText());
        g.setSenha(frame1.senha.getText());

        
        if ("acessar".equals(ae.getActionCommand())) {

            if ("tuti".equals(frame1.usuario.getText()) && "1234".equals(frame1.senha.getText())) {
                JOptionPane.showMessageDialog(null, "Bem Vindo");
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
              //  frame1.usuario.add(frame1.usuario);
              // log = new Log("usuario " + ultimoLogin.lerArquivo() + " entrou no Cadastro de Cliente no dia ");
                ultimoLogin.UltimoUsuarioLogin(frame1.usuario.getText());
                
                  frame1.dispose();
        
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            }
        }
    }
}




    
}
