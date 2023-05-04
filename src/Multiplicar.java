public class Multiplicar {

	public static void main(String[] args) {
		
		// Práctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una función que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
		
			String linea="";
			for(int i=1; i<=10; i++) {
				for(int j=1;j<=10;j++) {
					linea+= j + " * "+ i + "= "+(j*i)+ "\t";
					
				}
				System.out.println(linea);
				linea="";
			}
			System.out.println("modificado por Marta Tirador");
			
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1ºde Dam!!!");
	}
	
	
}