package com.boletim;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//tipo nomeDaVariavel
		Scanner leitor = new Scanner(System.in);
		
		//tipo nomeDaVariavel
		Aluno andrino = new Aluno("Andriwno");
		Aluno gabriel = new Aluno("Gabriel");
		
		//perguntar a nota do andrino
		System.out.println("Qual a nota do Andrino");
		//tipo nomeDaVariavel
		double notaDoAndrino = leitor.nextDouble();
		
		//colocar nota do andrino
		andrino.setNota(notaDoAndrino);
		
		System.out.println("A nota do "+ andrino.getNome() +" é "+ andrino.getNota());
		

		//TODO (A fazer)
		//Perguntar a nota do gabriel
		//Salvar a nota do gabriel
		//Imprimir a nota do gabriel
		//Imprimir os conceitos
		//Imprimir as médias
		
		
	}

}

/*
 * TIPOS DE DADOS
 * PRIMITIVOS
 * int
 * double
 * float
 * boolean
 * char
 * long
 * 
 * REFERENCIA
 * String
 * "Qualquer classe criada"
 * """"""Aluno"""""" (pq foi criada a classe Aluno) 
 * 
 * */
