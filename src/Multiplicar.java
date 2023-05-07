public class Multiplicar {

	public static void main(String[] args) {
		
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				int r=i*j;
				System.out.println(i+" x "+j+" = "+r);
			}
		}
		
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1�de Dam!!!");
	}
}