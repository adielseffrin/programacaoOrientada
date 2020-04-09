package com.notas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		/*
		 * Exercícios
		 * 
		 * 1. Crie um vetor de inteiros (pré definido) e após isso, encontre a soma de
		 * todos os elementos
		 * 
		 * 2. Crie um vetor de inteiros, solicite ao usuário o tamanho do vetor e os
		 * valores de cada posição e após isso, encontre a soma de todos os elementos
		 *
		 * 3. Crie um vetor de Strings, solicite ao usuário o tamanho do vetor e frutas
		 * para cada posição e após isso, procure se alguma palavra é igual a "abacaxi"
		 * 
		 * 4. Crie uma classe para modelar frutas que contenha nome e peso, crie um
		 * vetor de frutas, popule-o, encontre a fruta mais pesada e exiba para o
		 * usuário
		 * 
		 * EXTRAS Crie uma classe de ingredientes com nome e calorias, um vetor para
		 * receita (pode ser de tamanho fixo ou escolhido pelo user), popular o vetor
		 * com ingredientes escolhidos pelo usuário (utilizar um "menu" para escolha)
		 * apresentar o valor de calorias total da receita.
		 * 
		 */
		Scanner leitor = new Scanner(System.in);

		// int variavel = leitor.nextInt();

		int exercicio = 4;
		// Exercicio 1
		if (exercicio == 1) {
			int numero[] = { 1, 2, 3, 4, 5 };
			int soma = 0;
			for (int n = 0; n < numero.length; n++) {
				soma = soma + numero[n];
			}
			System.out.println(soma);
		}

		if (exercicio == 2) {
			System.out.println("Qual o tamanho do vetor?");
			int tamanho = leitor.nextInt();
			int somaDosVetores = 0;
			int[] numeros = new int[tamanho];
			
			//vamos do contador n de 0 até tamanho-1
			for (int n = 0; n < tamanho; n++) {
				//mensagem pro usuario
				System.out.println("Qual o valor para guardar?");
				//guarda na posição n do vetor, o valor digitado
				numeros[n] = leitor.nextInt();
			}

			//vamos do contador n de 0 até tamanho-1
			for (int n = 0; n < tamanho; n++) {
				//pra cada iteração, salvamos em somaDosVetores, a soma entre somaDosVetores com o valor do vetor na posição n
				somaDosVetores = somaDosVetores + numeros[n];
			}
			
			System.out.println(somaDosVetores);
		}
		
		
		
		//3. Crie um vetor de Strings, solicite ao usuário o tamanho do vetor e frutas
		// para cada posição e após isso, procure se alguma palavra é igual a "abacaxi"
		if(exercicio == 3) {
			System.out.println("tamanho");
			int tamanho = leitor.nextInt();
			String[] frutas = new String[tamanho];
			for(int i = 0; i < frutas.length; i++) {
				System.out.println("nome fruta");
				frutas[i] = leitor.next();
			}
			for(int i = 0; i < frutas.length; i++) {
				if(frutas[i].contentEquals("abacaxi")) {
					System.out.println("Achei");
				}
			}
			System.out.println("Acabei");
		
		}
		
		//4. Crie uma classe para modelar frutas que contenha nome e peso, crie um
//		 * vetor de frutas, popule-o, encontre a fruta mais pesada e exiba para o
	//	 * usuário
		if(exercicio == 4) {
			System.out.println("tamanho");
			int tamanho4 = leitor.nextInt();
			Frutas[] frutas4 = new Frutas[tamanho4];
			for(int i = 0; i < frutas4.length; i++) {
				frutas4[i] = new Frutas();
				System.out.println("nome fruta");
				frutas4[i].nome = leitor.next();
				System.out.println("peso fruta");
				frutas4[i].peso = leitor.nextDouble();
			}
			
			double maiorPeso;
			int maiorPos = 0;
			maiorPeso = frutas4[maiorPos].peso;
			for(int i = 1; i < frutas4.length; i++) {
				if(frutas4[i].peso > maiorPeso) {
					maiorPeso = frutas4[i].peso;
					maiorPos = i;
				}
			}
			
			System.out.println("A fruta mais pesada é "+ frutas4[maiorPos].nome + " ("+frutas4[maiorPos].peso+")");
			
			
		}
		
		

//	    String texto = "khkjhj";
//	    string ttt = ""; (ERRADO)
		String a = JOptionPane.showInputDialog("aaaaa?");
		// para comparar o conteudo de strings
		if (a.equals("aaaaa")) {
			System.out.println("aaaaa");
		}
	}

}
