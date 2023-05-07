public class Multiplicar {

	public static void main(String[] args) {
		
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
			multiplicar();
		//*****************************************
		
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1�de Dam!!!");
	}
	
	public static void multiplicar() {
		for(int i=0; i<=10; i++) {
			System.out.println(" \n" + "Tabla del " + i);
			for(int j=0; j<=10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}