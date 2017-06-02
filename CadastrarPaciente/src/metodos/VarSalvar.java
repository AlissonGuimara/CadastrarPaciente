
package metodos;


public class VarSalvar {
    
    Pessoa p = new Pessoa();
    Localizacao l = new Localizacao();
    Ficha f = new Ficha();
    
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

    public String getSalvar() {
        return salvar;
    }
    public String salvar;
    
}
