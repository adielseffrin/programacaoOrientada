package obras;

public class Secretario extends Funcionario {
	public Orcamento[] realizaOrcamentos(RelacaoCompra itens) {
		Orcamento orcamentos[] = new Orcamento[3];
		
		//Copia os produtos e quantidades da relacao 
		//de compra para cada orcamento
		for (int i = 0; i < orcamentos.length; i++) {
			orcamentos[i] = new Orcamento();
			
			for (int j = 0; j < itens.getTotal(); j++) {
				Produto produto = itens.getProduto(j);
				int quantidade = itens.getQuantidade(j);
				
				orcamentos[i].adicionaProduto(produto, quantidade);
			}
		}
		
		orcamentos[0].setFornecedor("Cassol");
		orcamentos[0].setValor(1000);
		
		orcamentos[1].setFornecedor("Casa Dagua");
		orcamentos[1].setValor(1500);
		
		orcamentos[2].setFornecedor("Balarotti");
		orcamentos[2].setValor(900);
		
		return orcamentos;
	}
}
