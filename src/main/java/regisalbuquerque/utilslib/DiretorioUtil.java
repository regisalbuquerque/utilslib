package regisalbuquerque.utilslib;

import java.io.File;
import java.io.IOException;

public class DiretorioUtil {

	public static void createPath(String path)
	{
	
		File diretorio = new File(path); // 
		if (!diretorio.exists()) {
		   diretorio.mkdirs(); //mkdir() cria somente um diretório, mkdirs() cria diretórios e subdiretórios.
		}
	}
	
	public static void createPathFile(String pathFile) throws IOException
	{
	
		File file = new File(pathFile); // 
		if (!file.exists())
		{
			if (!file.getParentFile().exists())
			{
				//Create 
				file.getParentFile().mkdirs();
			}
			file.createNewFile();
		}
	}
	
}
