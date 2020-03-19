import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nomeParaSalvar ="";
		double valorTransacao = 0;
		
		//exibe um mensagem 
		JOptionPane.showMessageDialog(null, "Olá, bem vindo ao banco!",
				"BANCO", JOptionPane.PLAIN_MESSAGE);
		//exibe uma caixa de input
		//armazena o resultado em nomeParaSalvar
		nomeParaSalvar = JOptionPane.showInputDialog(null, "Qual o nome do titular:",
				"BANCO",JOptionPane.QUESTION_MESSAGE);
		
		/*instanciando e inicializando objeto contaParaUsar
		do tipo Conta*/
		Conta contaParaUsar = new Conta(nomeParaSalvar,0);
		
		JOptionPane.showMessageDialog(null, contaParaUsar.retornaSituacao());
		//
		
		//deposito
		valorTransacao = Double.parseDouble( 
				JOptionPane.showInputDialog(null, "Qual o valor do deposito:",
				"BANCO",JOptionPane.QUESTION_MESSAGE)
				);
		
		contaParaUsar.depositar(valorTransacao);
		JOptionPane.showMessageDialog(null, contaParaUsar.retornaSituacao());
		
		//saque
		valorTransacao = Double.parseDouble( 
				JOptionPane.showInputDialog(null, "Qual o valor do saque:",
				"BANCO",JOptionPane.QUESTION_MESSAGE)
				);
		if(contaParaUsar.podeSacar(valorTransacao))
			contaParaUsar.sacar(valorTransacao);
		else		
			JOptionPane.showMessageDialog(null, "Não tem saldo");
		
		JOptionPane.showMessageDialog(null, contaParaUsar.retornaSituacao());
		
	}

}
