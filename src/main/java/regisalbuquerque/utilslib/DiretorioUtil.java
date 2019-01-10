package regisalbuquerque.utilslib;

import java.io.File;

public class DiretorioUtil {

	public static void createPath(String path)
	{
	
		File diretorio = new File(path); // 
		if (!diretorio.exists()) {
		   diretorio.mkdirs(); //mkdir() cria somente um diretório, mkdirs() cria diretórios e subdiretórios.
		} else {
		   //System.out.println("Diretório já existente");
		}
	}
	
}
