package log;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ArquivoManipular {

    protected RandomAccessFile io_file = null;

    private String is_filename = "";

    private int in_end_of_file = -1;

    protected ArquivoManipular() {

    }

    public ArquivoManipular(
            final String as_filename
    )
            throws FileNotFoundException {
        is_filename = as_filename;
    }
    public final ArquivoManipular Abrir()
            throws FileNotFoundException {
        io_file = new RandomAccessFile(is_filename, "rw");

        return (this);
    }
    public final void Fechar() {
        if (io_file != null) {
            String ls_exception = "\r\n";

            try {
                io_file.close();

                io_file = null;
            } catch (Exception ex) {
                System.err.println(ls_exception);
            }
        }
    }

    public final static void EscreverArquivo(
            String as_filename,
            String as_converter,
            boolean ab_append
    )
            throws IOException,
            FileNotFoundException {
        ByteToFile(
                as_filename,
                as_converter.getBytes(),
                ab_append
        );
    }

    private final static void ByteToFile(
            String as_filename,
            byte[] ah_buffer,
            boolean ab_append
    )
            throws IOException,
            FileNotFoundException {
        FileOutputStream lo_os_file = new FileOutputStream(
                as_filename,
                ab_append
        );

        try {
            lo_os_file.write(ah_buffer);
        } finally {
            lo_os_file.close();
        }
    }

    public final String LerLinha()
            throws Exception {
        String ls_line = null;

        try {
            if (in_end_of_file < 0
                    && (ls_line = io_file.readLine()) != null
                    && (in_end_of_file = ls_line.indexOf(0x1A)) != 0) {
                if (in_end_of_file > 0) {
                    ls_line = ls_line.substring(0, in_end_of_file);
                }
            }

        } catch (IOException ex) {
            throw new Exception(ex);
        }
        return (ls_line);
    }
}
