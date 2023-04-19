package codigo.rebobinar;

import javax.swing.JOptionPane;

public class rebobinar {
	public static boolean rebobinarPregunta() {
		boolean confirmacion = false;
		int ciclo = JOptionPane.showConfirmDialog(null, "¿Iniciar denuevo? Y/N", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (ciclo == 0) {
			confirmacion = true;
		} else if (ciclo == 1){
			confirmacion = false;
		}
		
		return(confirmacion);
	}
}
