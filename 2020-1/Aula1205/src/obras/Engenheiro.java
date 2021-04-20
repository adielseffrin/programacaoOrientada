package obras;

public class Engenheiro extends Funcionario {
	public RelacaoCompra solicitaOrcamento() {
		RelacaoCompra itens = new RelacaoCompra();
		itens.setObra("Inspecao obra minha casa minha vida");
		
		itens.adicionaProduto(new Produto("Saco de cimento","Votorantin"), 10);
		itens.adicionaProduto(new Produto("Tijolo 8 furos","Olaria Joinville"), 1000);
		
		return itens;
	}
}
