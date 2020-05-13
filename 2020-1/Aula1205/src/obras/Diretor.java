package obras;

public class Diretor extends Funcionario {
	public boolean aprovaOrcamento(Orcamento orcamento) {
		//Qualquer orcamento o diretor pode aprovar
		return true;
	}
}
