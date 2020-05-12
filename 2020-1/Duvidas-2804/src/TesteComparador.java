import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteComparador {

	@Test
	void test01() {
		Comparador c = new Comparador();
		int entrada1 = 4;
		int entrada2 = 5;
		int resultadoEsperado = 5;
		int resultadoObtido = c.ExibeMaior(entrada1, entrada2);
		
		assertTrue(resultadoEsperado == resultadoObtido);
	}
	
	@Test
	void test02() {
		Comparador c = new Comparador();
		int entrada1 = 5;
		int entrada2 = 5;
		int resultadoEsperado = 5;
		int resultadoObtido = c.ExibeMaior(entrada1, entrada2);
		
		assertTrue(resultadoEsperado == resultadoObtido);
	}
	
	@Test
	void test03() {
		Comparador c = new Comparador();
		int entrada1 = -4;
		int entrada2 = -5;
		int resultadoEsperado = -4;
		int resultadoObtido = c.ExibeMaior(entrada1, entrada2);
		
		assertTrue(resultadoEsperado == resultadoObtido);
	}
	
	@Test
	void test04() {
		Comparador c = new Comparador();
		int entrada1 = 4;
		int entrada2 = -5;
		int resultadoEsperado = 4;
		int resultadoObtido = c.ExibeMaior(entrada1, entrada2);
		
		assertTrue(resultadoEsperado == resultadoObtido);
	}

}
