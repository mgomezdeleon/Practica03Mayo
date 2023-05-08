public class Multiplicar {

	public static void main(String[] args) {
		
		// Práctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una función que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			printMultiplicationTables();
	}
	public static void printMultiplicationTables() {
		for (int i = 1; i <= 10; i++) {
        System.out.println("Tabla del " + i + ":");
        for (int j = 1; j <= 10; j++) {
            System.out.println(i + " x " + j + " = " + (i*j));
        }
        System.out.println();
		}
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1ºde Dam!!!");
	}
}