package obras;

public class Gerente extends Funcionario {
	public boolean aprovaOrcamento(Orcamento orcamento) {
		return orcamento.getValor() <= 1000;
	}
}
