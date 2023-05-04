public class Multiplicar {

	public static void main(String[] args) {
		
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			
			tablasDeMultiplicar();
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1�de Dam!!!");
	}
	
	public static void tablasDeMultiplicar() {
	    for (int i = 1; i <= 10; i++) {
	        System.out.println("Tabla del " + i + ":");
	        for (int j = 1; j <= 10; j++) {
	            int resultado = i * j;
	            System.out.println(i + " x " + j + " = " + resultado);
	        }
	        System.out.println(); // Salto de línea para separar las tablas
	    }
	}
}