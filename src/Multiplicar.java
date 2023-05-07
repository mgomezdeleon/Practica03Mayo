public class Multiplicar {

	public static void main(String[] args) {
		
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		tablasDeMultiplicar();
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1�de Dam!!!");
	}
	public static void tablasDeMultiplicar() {
		
		for(int i=1; i<=10; i++) {
			System.out.println("Tabla del "+i);
			for(int j=1; j<=10; j++) {
				System.out.println(i+" * "+ j+ " = "+(i*j));
			}
		}
		
	}
}