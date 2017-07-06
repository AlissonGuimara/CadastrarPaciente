
package metodos;


public class Ficha {
    
    public Ficha (){
    }

    public Ficha(String regSUS, String nomeDoença, String tipoSangue, String altura, String peso, String codigo) {

        this.regSUS = regSUS;
        this.nomeDoença = nomeDoença;
        this.tipoSangue = tipoSangue;
        this.altura = altura;
        this.peso = peso;
        this.codigo = codigo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

    public String regSUS;
    public String nomeDoença;
    public String tipoSangue;
    public String altura;
    public String peso;
    public String codigo;

}

