
package metodos;


public class VarSalvar {
    
    Pessoa p = new Pessoa();
    Localizacao l = new Localizacao();
    Ficha f = new Ficha();
    
      public void setSalvar() {
        this.salvar = "Nome: " + p.getNome() + "\r\nSexo: " + p.getSexo() + "\r\nIdade: " + p.getIdade() + "\r\nCPF: " + p.getCpf() + "\r\nNome do Pai: " + p.getNomePai() + "\r\nNome da Mãe: " + p.getNomeMae()
                + "\r\nEstado: " + l.getEstado() + "\r\nCidade: " + l.getCidade() + "\r\nBairro: " + l.getBairro() + "\r\nEmail: " + l.getEmail() + "\r\nTelefone: " + l.getTelefone() + "\r\nTipo Sanguineo: "
                + f.getTipoSangue() + "\r\nNome da Doença: " + f.getNomeDoença() + "\r\nRegistro SUS: " + f.getRegSUS() + "\r\nAltur: "
                + f.getAltura() + "\r\nPeso: " + f.getPeso();

    }

    public String getSalvar() {
        return salvar;
    }
    public String salvar;
    
}
