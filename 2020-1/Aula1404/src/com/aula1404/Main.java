package com.aula1404;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nota;
		double parametro;
		int vetor[] = {0};
		Scanner in = new Scanner(System.in);

		int aaa = 0;
		
		try {
			System.out.println(aaa);
			nota = in.nextInt();// !!!!! Interrompe
			parametro = nota / (nota - 1);

			switch (nota) {
			case 10:
				System.out.println("A+");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
			case 7:
				System.out.println("B");
				break;
			case 6:
				System.out.println("C");
				break;
			case 5:
			case 4:
			case 3:
				System.out.println("R");
				break;
			case 2:
			case 1:
				System.out.println("F");
				break;
			case 0:
				System.out.println(":(");
				break;
			default:
				System.out.println("Isso nem é nota");

			}

			System.out.println(parametro);
			//vetor[1] = 1;
			System.out.println(String.format("%d"));

		} catch (InputMismatchException e) {
			System.out.println("Digitou errado");
		}catch (ArithmeticException e) {
			System.out.println("Dividiu por 0");
		}//catch (Exception e) {
		//	System.out.println("erro geral");
		//}
		
		
		

	}

}
