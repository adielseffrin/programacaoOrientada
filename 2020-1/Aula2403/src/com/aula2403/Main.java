package com.aula2403;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Perguntas quantas notas o aluno teve
		//Perguntar quais s�o as notas
		//Exibir a m�dia
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas");
		int qtdNotas = leitor.nextInt();
		double nota = 0, totalNota = 0;
		
		int x = 0;
		while(x < qtdNotas) {
			System.out.println(String.format("Diz a %d� nota:",x+1));
			nota = leitor.nextDouble();
			totalNota += nota;
			++x;
		}
		
		System.out.println(String.format("A m�dia das notas �: %f%nParab�ns; N�o fez mais que a obriga��o.",totalNota/qtdNotas));

		
		//++a <- o ++ ta antes da variavel -> arruma a variavel -> faz o resto
		//a++ <- o ++ t� depois da variavel -> faz o que a linha pede -> arruma a variavel
		
		

		
		
	}

}


/*PARA QUEM QUISER TREINAR MAIS*/
/*Tentar fazer sem pedir a quantidade de notas*/
/*Como deixar a m�dia com 2 casas depois da v�rgula*/
