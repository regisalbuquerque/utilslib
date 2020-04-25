package regisalbuquerque.utilslib;

import java.awt.Toolkit;

public class SoundUtil {
	
	public static void playWindowsSoundAlert() {
		Runnable sound1 =
			      (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.default");
			    if(sound1 != null) sound1.run();
	}

}
