public class Multiplicar {

	public static void main(String[] args) {
		
		// Practica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funcion que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			
		for (int i = 1; i < 11; i++) {
			System.out.println("--> Tabla del " + i + " <--");
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		System.out.println("\n");
			
		}
	}
	
	public static void saludar() {
		System.out.println("Buenos tardes 1º de Dam!!!\n");
	}
}


