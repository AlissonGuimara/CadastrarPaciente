package LerSalvar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Salvar {
    
    
      public void setSalvarPessoa(String nome, String sexo, String idade, String cpf, String pai, String mae) {
        this.salvar = salvar + "Nome: " +nome+ "\r\nSexo: " + sexo + "\r\nIdade: " + idade + "\r\nCPF: " 
                + cpf + "\r\nNome do Pai: " + pai + "\r\nNome da Mãe: " + mae;
                

    }
      public void setSalvarLocalizacao(String estado, String cidade, String bairro, String email, String telefone){
      
        this.salvar = salvar + "Estado: " + estado + "\r\nCidade: " + cidade + "\r\nBairro: " + bairro 
                +"\r\nEmail: " + email + "\r\nTelefone: " + telefone;
          
      }
      
      public void setSalvarFicha(String sangue, String doenca, String sus, String altura, String peso){
      
        this.salvar = salvar +  "Tipo Sanguineo: "+ sangue + "\r\nNome da Doença: " + doenca + 
                "\r\nRegistro SUS: " + sus +"\r\nAltur: "+ altura + "\r\nPeso: " + peso;
          
      }

    public String salvar;
    
    
    public void gravarArquivo(String nomeArquivo) {
           
        JOptionPane.showMessageDialog(null, salvar);
     
     
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(nomeArquivo, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(salvar);
            bufferedWriter.flush();
//Se chegou ate essa linha, conseguiu salvar o arquivo com sucesso.
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: "
                            + ex.getMessage());
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: "
                            + ex.getMessage());
                }
            }
        }
    }
}

