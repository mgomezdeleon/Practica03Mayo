public class Multiplicar {

	public static void main(String[] args) {
		
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			
			for(int i = 1; i <= 10; i++) {
				System.out.println("\nTabla del " + i);
				for(int j = 1; j <= 10; j++) {
					System.out.println(i  + " * " + j + " = " + i*j);
				}
		            
			}
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1�de Dam!!!");
	}
}