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
	
	public static void tablasMultiplicar() {
		
		for(int i=1;i<11;i++) {
			System.out.println("\nTabla de Multiplicar del "+i+":\n");
			for(int j=0;j<11;j++) {
				System.out.println("\t"+i+" * "+j+" = "+(i*j));
			}
		}
	}
}