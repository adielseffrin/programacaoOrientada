package com.notas;

public class Teste {
	public int dividendo;
	private int divisor;
	
	
	//para definir valor de variavel -> set (definir)
	//setDivisor
	//jogarValorDoDivisorParaDentroDaVariavelDoObjetoInstanciado()
	public void defineValorDoDivisor(int v) {
		if(v ==0) {
			v = 1;
			System.out.println("Não dá pra dividir pro ZERO!!!!!!11!!1!");
		}
		divisor = v;
	}
	
	public void setDivisor(int v) {
		if(v ==0) {
			v = 1;
			System.out.println("Não dá pra dividir pro ZERO!!!!!!11!!1!");
		}
		divisor = v;
	}
	
	//para retornar (para fora do objeto) o valor de um atributo -> get(pegar)
	//getDivisor()
	public int RetornaValorDoAtributoDivisor() {
		return divisor;
	}
	
	
	public int divide() {
		return dividendo/divisor;
	}
}
