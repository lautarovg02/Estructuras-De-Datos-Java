package Ejercicio9;
/*Verificar si una cadena de texto es palindroma (capicua).*/
public class Ejercicio9 {
	public static void main(String[] args) {
		String cadena = "zorra";
		if(esCapicua(cadena)) {
			System.out.println("Es capicua: " + "cadena  : " + cadena  );
		}else {
			System.out.println("No es capicua: " + "cadena: " + cadena );
		}
		
	}
	
	public static boolean esCapicua(String cadena){
		cadena = cadena.toLowerCase();// convierto el string en minuscula
		cadena = cadena.replaceAll("\\s+", ""); 
		int izquierda = 0;
		int derecha = cadena.length() - 1;
		while(izquierda < derecha) {
			/* comparo cada letra, si una es distinta no es capicua,
				recorre desde atraz hacia delante y desde delante hacia atraz
			*/
			if(cadena.charAt(izquierda) != cadena.charAt(derecha)) {
				return false;
			}
			izquierda++;
			derecha--;
			
		}
		return true;
	}

}
