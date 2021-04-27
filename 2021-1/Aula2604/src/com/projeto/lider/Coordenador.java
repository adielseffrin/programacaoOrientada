package com.projeto.lider;

import java.util.Scanner;

import com.projeto.basico.Funcionario;
import com.projeto.basico.Gerente;

public class Coordenador extends Gerente{
	public Coordenador(String nome, String c, String nm, int idade) {
		super(nome, c, nm, idade);
	}
	
	public void cadastrarColaborador(Funcionario vetorDeColabs[], int nCol) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o tipo: (f)uncionario ou gerente");
		String tipo = in.nextLine();
		System.out.println("Digite o nome do Funcionario");
		String nome = in.nextLine();
		System.out.println("Digite o CPF");
		String cpf = in.nextLine();
		System.out.println("Digite o nome da mãe");
		String mae = in.nextLine();
		System.out.println("Digite a idade do Funcionario");
		int idade = in.nextInt();
		Funcionario f;
		
		if(tipo.equals("f")) {
			f = new Funcionario(nome, cpf,mae, idade);
		}else {
			f = new Gerente(nome, cpf,mae, idade);
		}
		
		vetorDeColabs[nCol] = f;
		nCol = 50;
		
	}
	
	public void listarAcoes() {
		System.out.printf("Digite a opção:%n"
				+ "1-Abrir Caixa%n"
				+ "2-Fechar Caixa%n"
				+ "3-Emitir Relatório%n"
				+ "4-Conferir Relatórios%n"
				+ "5-Efetuar Pagamento%n"
				+ "6- Cadastrar colab%n"
				+ "0 - Sair%n");
	}

}
