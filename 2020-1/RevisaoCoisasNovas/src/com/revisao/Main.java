package com.revisao;

import javax.swing.JOptionPane;

public class Main {

	public static int aumenta(int i) {
		return i += 7;
	}

	public static void main(String[] args) throws Exception {
		/*
		 * int idade = 0; boolean teveErro = false; String aux;
		 * 
		 * do { try { aux = JOptionPane.showInputDialog("Qual sua idade"); if(aux ==
		 * null) System.exit(1); idade = Integer.parseInt(aux); teveErro = false; }
		 * catch (Exception e) { JOptionPane.showMessageDialog(null,
		 * "Digite um número!"); teveErro = true; } }while(teveErro);
		 * 
		 * 
		 * int outraIdade = idade * 2;
		 * 
		 * JOptionPane.showMessageDialog(null, "O dobro da idade é " + outraIdade);
		 * 
		 * 
		 * int x, y; x = 3; y = 4;
		 * 
		 * if (x > 5) if (y > 5) System.out.println("os dois sao maiores"); else
		 * System.out.println("x < 5");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * for(int i = 0; i <= 100; i++){ if(i % 7 == 0) System.out.println(i); }
		 * 
		 * for(int i = 0; i <= 100; i++){
		 * 
		 * if(i*7 > 100) break; System.out.println(i*7); }
		 * 
		 * for (int i = 0; i <= 100; i+=7) { System.out.println(i); }
		 */

		int variavel = 7;
/*
		int ns[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// tipo de dado : Extra
		// marcação de vetor : []
		// nome da variável : coisas
		// sinal de atribuição : =
		// sinal de criação de vetor : new
		// new o que? : Extra
		// Que Extra : um vetor -> de que tamanho? : 8
		Extra[] nomeDoVetor = new Extra[15];// Declaração de um novo vetor de 8 posições

		for (int i = 0; i < nomeDoVetor.length; i++) {
			nomeDoVetor[i] = new Extra(i);// criando um objeto do tipo Extra
		}

		for (Extra d : nomeDoVetor)
			System.out.println(d.getId());

		switch (variavel) {
		case 1:
			System.out.println("é 1");
			break;
		case 2:
			System.out.println("É dois");
			break;
		case 3:
			System.out.println("É nois");
		case 4:
			System.out.println("Cansei");
			break;
		default:
			System.out.println("blz");

		}
		*/
		
		
		String retorno = String.format("O resultado da multiplicação é %d", Extra.multiplica(4,5));
		System.out.println(retorno);
		 retorno = String.format("O resultado da multiplicação é %f", Extra.multiplica(0.0,2));
		System.out.println(retorno);
	

	}

}
