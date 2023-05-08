public class Multiplicar {

	public static void main(String[] args) {
		
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			int tabla = 10;
			System.out.println("Tabla del " + tabla);
			for (int i = 0; i <= 10; i++) {
				System.out.println(tabla + " * " + i + " = " + (tabla * i));
			}
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1�de Dam!!!");
	}
}