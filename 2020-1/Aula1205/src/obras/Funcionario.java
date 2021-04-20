package obras;

public class Funcionario {
	private String nome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public RelacaoCompra solicitaOrcamento() throws Exception {
		throw new Exception("Operacao nao permitida");
	}
	
	public Orcamento[] realizaOrcamentos(RelacaoCompra itens) throws Exception {
		throw new Exception("Operacao nao permitida");
	}
	
	public boolean aprovaOrcamento(Orcamento orcamento) throws Exception {
		throw new Exception("Operacao nao permitida");
	}
}
