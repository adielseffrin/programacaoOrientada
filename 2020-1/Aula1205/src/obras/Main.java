package obras;

public class Main {
	public static void main(String[] args) throws Exception {
		Funcionario e = new Engenheiro();
		Funcionario s = new Secretario();
		Funcionario d = new Diretor();
		Funcionario g = new Gerente();
		
		RelacaoCompra itens = e.solicitaOrcamento();
		Orcamento[] orcamentos = s.realizaOrcamentos(itens);
		
		for (int i = 0; i < orcamentos.length; i++) {
			System.out.println("Gerente pode aprovar (" + 
					orcamentos[i].getFornecedor() + ", R$ " + 
					orcamentos[i].getValor() +
					"): " + 
					g.aprovaOrcamento(orcamentos[i]));

			System.out.println("Diretor pode aprovar (" + 
					orcamentos[i].getFornecedor() + ", R$ " + 
					orcamentos[i].getValor() +
					"): " + 
					d.aprovaOrcamento(orcamentos[i]));
		}
	}
}
