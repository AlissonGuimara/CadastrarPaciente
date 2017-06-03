package metodos;

public class Pessoa {

    public Pessoa() {
    }

    public Pessoa(String nome, String sexo, String Idade, String cpf, String nomePai, String nomeMae) {

        this.nome = nome;
        this.sexo = sexo;
        this.Idade = Idade;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String nome;
    public String nomePai;
    public String nomeMae;
    public String sexo;
    public String Idade;
    public String cpf;
    public Integer codigo;
}