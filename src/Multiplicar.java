public class Multiplicar {

	public static void main(String[] args) {

		// Pr�ctica Tablas de Multiplicar
		saludar();

		// *****************************************
		// Crear una funci�n que imprima las 10 tablas de
		// multiplicar
		// *****************************************

		for (int i = 0; i <= 10; i++) {
			System.out.println("Tabla de multiplicar del " + i + ":");
			System.out.println("-----------------------------");

			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}

			System.out.println();
		}
	}

	public static void saludar() {

		System.out.println("Buenos tardes 1�de Dam!!!");
	}
}