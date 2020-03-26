package com.aula2403;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Perguntas quantas notas o aluno teve
		//Perguntar quais são as notas
		//Exibir a média
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas");
		int qtdNotas = leitor.nextInt();
		double nota = 0, totalNota = 0;
		
		int x = 0;
		while(x < qtdNotas) {
			System.out.println(String.format("Diz a %dª nota:",x+1));
			nota = leitor.nextDouble();
			totalNota += nota;
			++x;
		}
		
		System.out.println(String.format("A média das notas é: %f%nParabéns; Não fez mais que a obrigação.",totalNota/qtdNotas));

		
		//++a <- o ++ ta antes da variavel -> arruma a variavel -> faz o resto
		//a++ <- o ++ tá depois da variavel -> faz o que a linha pede -> arruma a variavel
		
		

		
		
	}

}


/*PARA QUEM QUISER TREINAR MAIS*/
/*Tentar fazer sem pedir a quantidade de notas*/
/*Como deixar a média com 2 casas depois da vírgula*/
