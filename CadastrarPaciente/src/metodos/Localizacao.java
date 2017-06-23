package metodos;

public class Localizacao {

    public Localizacao() {
    }
    Pessoa p;

    public Localizacao(String estado, String cidade, String bairro, String email, String telefone, String codigo) {

        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.bairro = bairro;
        this.codigo = p.getCodigo();

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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
       
        
    public String email;
    public String cidade;
    public String estado;
    public String bairro;
    public String telefone;
    public String codigo;

    public boolean isClosed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
