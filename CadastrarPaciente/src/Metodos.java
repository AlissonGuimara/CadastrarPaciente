
public class Metodos {

    public Metodos() {
     
    }

    public Metodos(String nome, String nomePai, String nomeMae, String sexo, String email, String cidade, String estado, int telefone, int Idade, int cpf, int regSUS, String nomeDoença, String tipoSangue, String bairro) {
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public int getRegSUS() {
        return regSUS;
    }

    public void setRegSUS(Integer regSUS) {
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
    
    public String nome;
    public String nomePai;
    public String nomeMae;
    public String sexo;
    public String email;
    public String cidade;
    public String estado;
    public String bairro;
    public Integer telefone;
    public Integer Idade;
    public Integer cpf;
    public Integer regSUS;
    public String nomeDoença;
    public String tipoSangue;

}
