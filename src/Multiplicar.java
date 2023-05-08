public class Multiplicar {

	public static void main(String[] args) {
		
		// Práctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una función que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
		
		tabla();
		
	}
	public static void tabla() {
		for (int i=1; i<11;i++) {
			System.out.println("----------------------------------------------------------------------\n"
					+ "La tabla del:" +i+ "");
			for (int j=1; j<11;j++) {
				System.out.println(i+"*"+j+"="+ i*j);
				
			}
			}
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1ºde Dam!!!");
	}
}