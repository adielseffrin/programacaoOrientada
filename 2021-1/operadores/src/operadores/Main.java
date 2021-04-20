package operadores;

public class Main {

	public static void main(String[] args) {
		boolean varA, varB, resultado;
		
		varA = 5 == 4;
		varB = 3 > 1;
		resultado = varA || varB;
		System.out.println(resultado);
		
		System.out.println(!resultado);

	}

}
