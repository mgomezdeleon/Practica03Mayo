public class Multiplicar {

	public static void main(String[] args) {
		
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
		tablasMultiplicar();
		
	}
	public static void saludar() {
		
		System.out.println("Buenos tardes 1�de Dam!!!");
	}
	
	public static void tablasMultiplicar() {
		String temp = "Las tablas de multiplicar:\n";
		for (int i= 1; i <= 10; i++) {
			temp += "\t-Tabla del " + i + ":\n\t";
			for (int j= 1; j <= 10;  j++) {
				temp += "\t" + i + " * " + j +" = " + (i * j);
				temp += (j% 5 == 0)? "\n\t":"";
			}
			temp +="\n";
		}
		System.out.println(temp);
	}
}