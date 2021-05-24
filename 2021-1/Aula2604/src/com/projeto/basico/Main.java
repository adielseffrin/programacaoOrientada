package com.projeto.basico;
import java.util.Scanner;

import com.projeto.basico.Funcionario;
import com.projeto.basico.Gerente;
import com.projeto.lider.Coordenador;


public class Main {

	public static void main(String[] args) {
		/*
		Criar um cadastro de funcionarios
		para uma empresa de 10 pessoas.
		Cargos:
		- Gerente
		- Coordenador
		- Funcionário
		
		Onde:
		- (ok)Funcionario, tem acesso as rotinas administrativas: Abrir caixa, fechar caixa, emitir relatório
		- (ok)Gerente, tem acesso à todas funções de funcionário, além de conferir relatório, efetuar pagamento.
		- (ok)Coordenador, tem acesso a tudo que o funcionario tem, além das funções de gerente, bem como pode cadastrar novos 
		colaboradores, desde que respeite o limite de 10 pessoas.
		
		* (+-ok)Somente funcionário tem acesso a função "ver dados pessoais" (nome, cpf, nome da mãe)
		* (+-ok)Somente funcionario e gerente possuem acesso à "efetuar reclamação de coord."
		*/
		Funcionario colab[] = new Funcionario[10];
		int user;
		Scanner in = new Scanner(System.in);
		int colaboradoresCadastrados = 0;
		
		if(colab[0] == null) {
			
			System.out.println("Digite o nome do Coordenador");
			String nome = in.nextLine();
			System.out.println("Digite o CPF");
			String cpf = in.nextLine();
			System.out.println("Digite o nome da mãe");
			String mae = in.nextLine();
			System.out.println("Digite a idade do Coordenador");
			int idade = in.nextInt();
			
			Coordenador c = new Coordenador(nome, cpf,mae, idade);
			
			colab[colaboradoresCadastrados++] = c;
		}
		do {
			System.out.println("Selecione um usuário");
			for(Funcionario f: colab) {
				if(f != null)
				f.verDadosPessoais();
				System.out.println("-------");
			}
			user = in.nextInt();
			colab[user].listarAcoes();
			
			int opt = in.nextInt();
			while(opt != 0) {
				switch(opt) {
				case 1:
					colab[user].abrirCaixa();
					break;
				case 2:
					colab[user].fecharCaixa();
					break;
				case 3:
					colab[user].emitirRelatorio();
					break;
				case 4:
					//como resolver esse erro para gerente e coord.
					((Gerente)colab[user]).conferirRelatorios();
					break;
				case 5:
					//como resolver esse erro para gerente e coord.
					((Gerente)colab[user]).efetuarPagamento();
					break;
				case 6:
					//como resolver esse erro para gerente e coord.
					//Aqui, como é um vetor, foi passada uma referência
					((Coordenador)colab[user]).cadastrarColaborador(colab, colaboradoresCadastrados++);
					break;
				case 7:
					for(Funcionario f: colab) {
						if(f != null)
						f.verDadosPessoais();
					}
				}
				//c.listarAcoes();
				opt = in.nextInt();
			}
			
			
		}while(user >= 0);
		
		
		
		
		
		
		

	}

}
