package regisalbuquerque.utilslib;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author regis
 */
public class CSVWriterUtil {
    
    BufferedWriter buffWriter;
    boolean append = false;
    
    public CSVWriterUtil(String path_fileName) 
    {
    	criarBufferWriter(path_fileName);
    }
    
    public CSVWriterUtil(String path_fileName, boolean append) 
    {
    	this.append = append;
    	criarBufferWriter(path_fileName);
    }

    public CSVWriterUtil(String path, String fileName) 
    {
        String path_fileName = path + fileName;
        criarBufferWriter(path_fileName);
    }
    
    private void criarBufferWriter(String path_fileName)
    {
	    try {
	    	DiretorioUtil.createPathFile(path_fileName);
	        buffWriter = new BufferedWriter(new FileWriter(path_fileName, this.append));
	    } catch (IOException ex) {
	        Logger.getLogger(CSVWriterUtil.class.getName()).log(Level.SEVERE, null, ex);
	    }
    }

    
    public void cabecalho(String cabecalho) 
    {
        try {
            buffWriter.append(cabecalho + "\n");
        } catch (IOException ex) {
            Logger.getLogger(CSVWriterUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void registro(String registro) 
    {
        try {
            buffWriter.append(registro + "\n");
        } catch (IOException ex) {
            Logger.getLogger(CSVWriterUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fechar() 
    {
        try {
            buffWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(CSVWriterUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
