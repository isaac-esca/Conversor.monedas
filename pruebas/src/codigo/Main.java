package codigo;

import javax.swing.JOptionPane;

import codigo.Monedas.monedasClase;
import codigo.Temperatura.temperaturaClase;
import codigo.rebobinar.rebobinar;

	public class Main {
		
		
				public static void main(String[] args) {
					try {
			int activo = JOptionPane.YES_OPTION;
			do {
				
				boolean rebobinar = true;
				
				// TODO Auto-generated method stub
				String opcionMoneda = (JOptionPane.showInputDialog(null, "Eliga el convertidor deseado.", 
						"Opciones - Convertidor", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Monedas", "Temperatura"}, "selecciona")).toString();
				
				switch (opcionMoneda) {
				
				case "Monedas": {
					
					do  {
						String opcionMonedaExtranjera = (JOptionPane.showInputDialog(null, "Eliga la opcion de cambio.", 
								"Opciones - Convertidor", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Peso mexicano - moneda extranjera", "Moneda extranjera - Peso mexicano"}, "selecciona")).toString();
						switch (opcionMonedaExtranjera) {
						
							case "Peso mexicano - moneda extranjera": {
							
								String monto = JOptionPane.showInputDialog("Ingrese el valor (Mxn)");
						
								while (!Numerico(monto)) {
									JOptionPane.showMessageDialog(null, "Favor de ingresar un monto valido (numeros)");
									monto = JOptionPane.showInputDialog("Monto a convertir", 1);
								}
						
								double montoAceptado = Double.parseDouble(monto);
								monedasClase moneda = new monedasClase();
								moneda.convertidorMoneda(montoAceptado);
								if (codigo.rebobinar.rebobinar.rebobinarPregunta() != rebobinar) {
									rebobinar = false;
									
								}
						
								break;
						
							}
							case "Moneda extranjera - Peso mexicano": {
								monedasClase coin = new monedasClase();
								coin.convertidorMonedaMxn();
								if (codigo.rebobinar.rebobinar.rebobinarPregunta() != rebobinar) {
									rebobinar = false;
								}
								break;
							}
					} 
					}while (rebobinar);
					activo = 1;
					break;
					
				}
					
					
					
		
				
					case "Temperatura": {
						do {
						String opcionTempetatura = (JOptionPane.showInputDialog(null, "Eliga nomenclatura.", 
								"Opciones - Convertidor", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Celcius", "Fahrenheit", "Kelvin"}, "selecciona")).toString();
						
						String grados = JOptionPane.showInputDialog("Ingrese el valor ");
						while (!Numerico(grados)) {
							JOptionPane.showMessageDialog(null, "Favor de ingresar un monto valido (numeros)");
							grados = JOptionPane.showInputDialog("Monto a convertir", 30);
							
						}
						switch (opcionTempetatura) {
						case "Celcius": {
							
							temperaturaClase temperatura =  new temperaturaClase();
							double gradosii = Double.parseDouble(grados);
							temperatura.celcius(gradosii);
							break;
						}
						
						case "Fahrenheit": {
							
							temperaturaClase temperatura =  new temperaturaClase();
							double gradosii = Double.parseDouble(grados);
							temperatura.fahrenheit(gradosii);
							break;
						}
						
						case "Kelvin": {
							
							temperaturaClase temperatura =  new temperaturaClase();
							double gradosii = Double.parseDouble(grados);
							temperatura.kelvin(gradosii);
							break;
						}
						}
						if (codigo.rebobinar.rebobinar.rebobinarPregunta() != rebobinar) {
							rebobinar = false;
						}
					}while(rebobinar);
						activo = 1;
						break;
					}
					
					}
				
			
				
				} while(activo == JOptionPane.YES_OPTION); 
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Buen día :)");
			}
				}
	
		 
		
	//} catch (Exception e) {
				//JOptionPane.showMessageDialog(null, "¡Que tenga buen día! :)");
			//}
		
		
		private static boolean Numerico(String numero) {
			try {
				Double.parseDouble(numero);
				return true;
			} catch (NumberFormatException numformatex) {
				return false;
			}
		}
}
