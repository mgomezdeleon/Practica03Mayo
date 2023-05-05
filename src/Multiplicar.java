public class Multiplicar {

	public static void main(String[] args) {
		
		// Práctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una función que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			tablasMultiplicar();
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1ºde Dam!!!");
		
	}
	
	private static void tablasMultiplicar() {
		for(int i=1;i<11;i++) {
			System.out.println("\nTabla del "+i+":");
			for(int j=0;j<11;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
}