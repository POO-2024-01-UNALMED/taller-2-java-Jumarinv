package test;

public class Auto {
	
	String modelo;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int precio;
	int registro;
	static int cantidadCreados;
	
	 
	
	int cantidadAsientos () {
		
		int numAsientos = 0;
		
		for (int i = 0; i < asientos.length; i++) {
			
			
			if (asientos[i] != null){
				
				numAsientos++;	
				
			}
			
		}
		
		return numAsientos;
		
	}
	
	String verificarIntegridad () {
		
		if (motor.registro != registro) {
			
			return ("Las piezas no son originales");
		
		}
		
		for (int i = 0; i< asientos.length; i++) {
			
			if (asientos[i] != null) {
			
				if (asientos[i].registro != registro) {
				
					return ("Las piezas no son originales");
				
				
				}
			}else {
				
				return ("Auto original");
			}
			
		}return ("Auto original");
		
		
		
	}
	
	
	
	
	

}
