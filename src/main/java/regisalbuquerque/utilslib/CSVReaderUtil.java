package regisalbuquerque.utilslib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSVReaderUtil {
	
	BufferedReader buffReader;
	
	public CSVReaderUtil(String path_filename)
	{
		criarBufferReader(path_filename);
	}
	
	private void criarBufferReader(String path_filename)
	{
		try {
			buffReader = new BufferedReader(new FileReader(path_filename));
		} catch (IOException ex) {
			Logger.getLogger(CSVReaderUtil.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public String lerLinha()
	{
		String line = null;
		try {
			line = buffReader.readLine();
		} catch (IOException ex) {
			Logger.getLogger(CSVReaderUtil.class.getName()).log(Level.SEVERE, null, ex);
		}
		return line;
	}
	
	public static String[] lerColuna(String registro, String separador)
	{
		if (separador == null) separador = ",";
		String[] columns = registro.split(separador);
		return columns;
	}
	
	public List<String> lerTudo()
	{
		List<String> listaLinhas = new ArrayList<String>();
		while(true)
		{
			String linha = lerLinha();
			if (linha == null) break;
			listaLinhas.add(linha);
		}
		return listaLinhas;	
	}
	
	public void fechar() 
    {
        try {
        	buffReader.close();
        } catch (IOException ex) {
            Logger.getLogger(CSVWriterUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	

}
