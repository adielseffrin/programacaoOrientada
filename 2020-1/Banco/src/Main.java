import java.util.Calendar;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nomeParaSalvar ="";
		double valorTransacao = 0;
		
		//Exibe uma mensagem 
		JOptionPane.showMessageDialog(null, "Olá, bem vindo ao banco!",
				"BANCO", JOptionPane.PLAIN_MESSAGE);
		
		//Exibe uma caixa de input e armazena o resultado em nomeParaSalvar
		nomeParaSalvar = JOptionPane.showInputDialog(null, "Qual o nome do titular:",
				"BANCO",JOptionPane.QUESTION_MESSAGE);
		
		/*Instancia e inicializa objeto contaParaUsar do tipo Conta*/
		Conta contaParaUsar = new Conta(nomeParaSalvar,0);
		
		int opcao = 0;
		
		while (opcao != 3 && opcao != -1) {
			//Exibe menu de opções
			opcao = JOptionPane.showOptionDialog(null, 
						"Selecione a opção", //Mensagem
						"Menu", //Titulo
						JOptionPane.YES_NO_CANCEL_OPTION, //Tipo do menu de opções 
						JOptionPane.INFORMATION_MESSAGE, //Tipo da mensagem
						null, //Icone a ser utilizado na mensagem (padrão)
						new String[] { "Depositar", "Sacar", "Informações", "Sair" }, //Opções do menu
						"Informações"); //Opção destacada (padrão)
			
			if (opcao == 0) {  //Depósito
				valorTransacao = Double.parseDouble( 
						JOptionPane.showInputDialog(null, "Qual o valor do deposito:",
						"BANCO",JOptionPane.QUESTION_MESSAGE)
						);
				
				contaParaUsar.depositar(valorTransacao);
			} else if (opcao == 1) { //Saque
				valorTransacao = Double.parseDouble( 
						JOptionPane.showInputDialog(null, "Qual o valor do saque:",
						"BANCO",JOptionPane.QUESTION_MESSAGE)
						);
				
				if(contaParaUsar.podeSacarSaldo(valorTransacao)) {
					if(contaParaUsar.podeSacarHorario(valorTransacao)) {
						contaParaUsar.sacar(valorTransacao);
					}else {
						JOptionPane.showMessageDialog(null, "Saque acima do limite");
					}
				}else		
					JOptionPane.showMessageDialog(null, "Não tem saldo");
			} else if (opcao == 2) { //Informações da conta
				JOptionPane.showMessageDialog(null, contaParaUsar.retornaSituacao());
			}
		}
	}
}
