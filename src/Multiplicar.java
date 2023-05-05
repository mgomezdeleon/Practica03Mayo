public class Multiplicar {

	public static void main(String[] args) {
		
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			
		multiplicar();
		
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes Primero de Dam!!!");
	}
	public static void multiplicar() {
		String linea="";
		int numero=10;
		
		for(int i=10;i>=1 ; i--) {
		
			for (numero=10; numero>=1;numero--) {
				linea+=(numero+ " * "+i +" = " + (i*numero)+ "\t");
			}System.out.println(linea);
			linea="";
		}
		
	}
}