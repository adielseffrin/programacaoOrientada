package com.notas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		/*Teste t = new Teste();
		t.dividendo = 25;
		//t.divisor = 0;
		t.defineValorDoDivisor(0);
		
		System.out.println(t.divide());
		System.out.println("meu dividendo é"+t.dividendo);
		System.out.println("meu divisor é"+t.RetornaValorDoAtributoDivisor());
		*/
		
		
		int[] numeros = {1,2,3,4,5};
		double[] outrosNum = {1.1, 2, 4.5, 6.2};
		//criar um vetor de inteiros
		//usar um for para imprimir cada numero*
		for(int i = 0; i < numeros.length; i++)
			System.out.println(numeros[i]);
		
		
		System.out.println("-------------------------------");
		
		for(int y : numeros)
			System.out.println(y);
		
		System.out.println("-------------------------------");System.out.println("-------------------------------");
		
		for(int i = 0; i < outrosNum.length; i++)
			System.out.println(outrosNum[i]);
		
		
		System.out.println("-------------------------------");
		
		for(double y : outrosNum)
			System.out.println(y);

	}

}
