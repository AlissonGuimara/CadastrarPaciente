
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Salvar {

    //public String nomeArquivo;
    //public String textoArquivo;
     
    Metodos mt = new Metodos();

    public void gravarArquivo(String arquivo, String nomeArquivo) {
        //String nomeArquivo = Integer.toString(mt.getCpf());
       // String nomeArquivo = "ooii";
              JOptionPane.showMessageDialog(null, arquivo);
        //JOptionPane.showMessageDialog(null, arquivo);
     

        
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(nomeArquivo, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(arquivo);
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

