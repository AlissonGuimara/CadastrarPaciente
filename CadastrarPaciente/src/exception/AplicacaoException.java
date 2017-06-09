

package exception;

public class AplicacaoException extends Exception{
        
    public AplicacaoException(){
        super("Ocorreu um erro inesperado!");
    }

    public AplicacaoException(String msg){
        super(msg);
    }

}
