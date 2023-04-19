package codigo.Monedas;

import javax.swing.JOptionPane;

public class monedasClase {
	
	public void convertidorMoneda(double montoInicial) {
		String moneda = JOptionPane.showInputDialog(null, "Pesos mexicanos (Mxn) -> ", "Lista monedas", 
			JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Dolar", "Euro", "Libras", "Yen", "Won"}, "Seleccion").toString();
	switch (moneda) {
	case "Dolar": {
		//pesos a dollares
		double montoFinal = montoInicial / 18.01;
		montoFinal = (double) Math.round(montoFinal * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, montoInicial + "$ pesos = " + montoFinal + "$ dolares");
		break;
	}
	
	
	case "Euro": {
		double montoFinal = montoInicial / 19.81;
		montoFinal = (double) Math.round(montoFinal * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, montoInicial + "$ pesos = " + montoFinal + "$ euros");
		break;
	}
	
	
	case "Libras": {
		double montoFinal = montoInicial / 22.37;
		montoFinal = (double) Math.round(montoFinal * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, montoInicial + "$ pesos = " + montoFinal + "$ libras esterlinas");
		break;
	}
	
	case "Yen": {
		double montoFinal = montoInicial / 0.13;
		montoFinal = (double) Math.round(montoFinal * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, montoInicial + "$ pesos = " + montoFinal + "$ yen-japones");
		break;
	}
	
	case "Won": {
		double montoFinal = montoInicial / 0.014;
		montoFinal = (double) Math.round(montoFinal * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, montoInicial + "$ pesos = " + montoFinal + "$ won-coreano");
		break;
	}
	
	}
	}	
	

	public void convertidorMonedaMxn() {
		String monedaExtranjera = (JOptionPane.showInputDialog(null, "Eliga la opcion de cambio.", 
				"Opciones - Convertidor", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Dolar", "Euro", "Libras", "Yen", "Won"}, "selecciona")).toString();
		String monto = (JOptionPane.showInputDialog("Ingrese el monto")).toString();
		while (!Numerico(monto)) {
			JOptionPane.showMessageDialog(null, "Favor de ingresar un monto valido (numeros)");
			monto = JOptionPane.showInputDialog("Monto a convertir", 1);
			
		}
		double montoAceptado = Double.parseDouble(monto);
		montoAceptado = (double) Math.round(montoAceptado * 100.0) / 100.0;
		
		switch (monedaExtranjera) {
		case "Dolar": {
			double montoFinal = montoAceptado * 18.01;
			montoFinal = (double) Math.round(montoFinal * 1000.0) / 1000.0;
			JOptionPane.showMessageDialog(null, montoAceptado + "$ Dolares =" + montoFinal + "$ Pesos Mexicanos");
			break;
		}
		
		case "Euro": {
			double montoFinal = montoAceptado * 0.051;
			montoFinal = (double) Math.round(montoFinal * 1000.0) / 1000.0;
			JOptionPane.showMessageDialog(null, montoAceptado + "$ Dolares =" + montoFinal + "$ Pesos Mexicanos");
			break;
		}
		
		
		case "Libras": {
			double montoFinal = montoAceptado * 0.045;
			montoFinal = (double) Math.round(montoFinal * 1000.0) / 1000.0;
			JOptionPane.showMessageDialog(null, montoAceptado + "$ Dolares =" + montoFinal + "$ Pesos Mexicanos");
			break;
		}
		
		case "Yen": {
			double montoFinal = montoAceptado * 7.46;
			montoFinal = (double) Math.round(montoFinal * 1000.0) / 1000.0;
			JOptionPane.showMessageDialog(null, montoAceptado + "$ Dolares =" + montoFinal + "$ Pesos Mexicanos");
			break;
		}
		
		case "Won": {
			double montoFinal = montoAceptado * 73.20;
			montoFinal = (double) Math.round(montoFinal * 1000.0) / 1000.0;
			JOptionPane.showMessageDialog(null, montoAceptado + "$ Dolares =" + montoFinal + "$ Pesos Mexicanos");
			break;
		}
		
		
		
	}
	
}
	private static boolean Numerico(String numero) {
		try {
			Double.parseDouble(numero);
			return true;
		} catch (NumberFormatException numformatex) {
			return false;
		}
	}
}