package codigo.Temperatura;

import javax.swing.JOptionPane;

public class temperaturaClase {

	public void celcius(double temperaturaInicial) {
		double temperaturaF = temperaturaInicial * 1.8000 + 32;
		double temperaturaK = temperaturaInicial +273.15;
		double temperaturaFinalF = (double) Math.round(temperaturaF * 100.0) / 100.0;
		double temperaturaFinalK = (double) Math.round(temperaturaK * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, temperaturaInicial + " °C -->    " + temperaturaFinalF + " °F  ---  " + temperaturaFinalK + " °K.", 
				"Convertidor Temperatura (Celcius)", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void fahrenheit(double temperaturaInicial) {
		double temperaturaC = (temperaturaInicial - 32) * 5/9;
		double temperaturaK = ((temperaturaInicial - 32 )* 5/9 )+ 273.15;
		double temperaturaFinalC = (double) Math.round(temperaturaC * 100.0) / 100.0;
		double temperaturaFinalK = (double) Math.round(temperaturaK * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, temperaturaInicial + " °F -->    " + temperaturaFinalC + " °C  ---  " + temperaturaFinalK + " °K.", 
				"Convertidor Temperatura (Fahrenheit)", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void kelvin(double temperaturaInicial) {
		double temperaturaC = (temperaturaInicial - 273.15);
		double temperaturaF = ((temperaturaInicial - 273.15 )* 9/5) +32;
		double temperaturaFinalC = (double) Math.round(temperaturaC * 100.0) / 100.0;
		double temperaturaFinalF = (double) Math.round(temperaturaF * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, temperaturaInicial + " °K -->    " + temperaturaFinalC + " °C  ---  " + temperaturaFinalF + " °F.", 
				"Convertidor Temperatura (Kelvin)", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
