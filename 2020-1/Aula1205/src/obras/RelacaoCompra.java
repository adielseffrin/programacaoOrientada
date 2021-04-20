package obras;

public class RelacaoCompra {
	private String obra;
	
	private Produto[] produtos;
	private int[] quantidades;
	
	private int total;
	
	public RelacaoCompra() {
		produtos = new Produto[10];
		quantidades = new int[10];
	}
	
	public void adicionaProduto(Produto produto, int quantidade) {
		produtos[total] = produto;
		quantidades[total] = quantidade;
		
		total++;
	}
	
	public Produto getProduto(int indice) {
		return produtos[indice];
	}
	
	public int getQuantidade(int indice) {
		return quantidades[indice];
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setObra(String obra) {
		this.obra = obra;
	}
	
	public String getObra() {
		return obra;
	}
}
