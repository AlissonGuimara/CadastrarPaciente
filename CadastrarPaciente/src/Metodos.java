
public class Metodos {

    public Metodos() {
     
    }

    public Metodos(String nome, String nomePai, String nomeMae, String sexo, String email, String cidade, String estado, 
    String telefone, int Idade, String cpf, String regSUS, String nomeDoença, String tipoSangue, String bairro, String altura, String peso) {
        this.nome = nome;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.sexo = sexo;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.Idade = Idade;
        this.cpf = cpf;
        this.regSUS = regSUS;
        this.nomeDoença = nomeDoença;
        this.tipoSangue = tipoSangue;
        this.bairro = bairro;
        this.altura = altura;
        this.peso = peso;
    }
    public void  setSalvar(){
        this.salvar = "Nome: "+getNome()+"\r\nSexo: "+getSexo()+"\r\nIdade: "+getIdade()+"\r\nCPF: "+getCpf()+"\r\nNome do Pai: "+getNomePai()+"\r\nNome da Mãe: "+getNomeMae()
                +"\r\nEstado: "+getEstado()+"\r\nCidade: "+getCidade()+"\r\nBairro: "+getBairro()+"\r\nEmail: "+getEmail()+"\r\nTelefone: "+getTelefone()+"\r\nTipo Sanguineo: "
                +getTipoSangue()+"\r\nNome da Doença: "+getNomeDoença()+"\r\nRegistro SUS: "+getRegSUS()+"\r\nAltur: "
                +getAltura()+"\r\nPeso: "+getPeso();
             
    }
    public String getSalvar(){
        return salvar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegSUS() {
        return regSUS;
    }

    public void setRegSUS(String regSUS) {
        this.regSUS = regSUS;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNomeDoença() {
        return nomeDoença;
    }

    public void setNomeDoença(String nomeDoença) {
        this.nomeDoença = nomeDoença;
    }
    
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public String nome;
    public String nomePai;
    public String nomeMae;
    public String sexo;
    public String email;
    public String cidade;
    public String estado;
    public String bairro;
    public String telefone;
    public Integer Idade;
    public String cpf;
    public String regSUS;
    public String nomeDoença;
    public String tipoSangue;
    public String salvar;
    public String altura;
    public String peso;

    
}
