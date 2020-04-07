package com.notas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Teste t = new Teste();
		t.dividendo = 25;
		//t.divisor = 0;
		t.defineValorDoDivisor(0);
		
		System.out.println(t.divide());
		System.out.println("meu dividendo é"+t.dividendo);
		System.out.println("meu divisor é"+t.RetornaValorDoAtributoDivisor());


	}

}
