package com.provaD1;
public class Pessoa {
	private Tenis meusTenis[];
	private int tenisComprados;
	private int meiasCompradas;
	private Meia minhasMeias[];
	
	//Construtor com quantidade de tenis e meia via parametros iniciais
	//Necessario atribuir as variaveis recebidas as variaveis da classe
	//public Pessoa(int, int)
	//sem retorno
	public Pessoa(int qt, int qm) {
		meusTenis = new Tenis[qt > 0 ? qt : 0];
		tenisComprados = 0;
		minhasMeias = new Meia[qm > 0 ? qm : 0];
		meiasCompradas = 0;
	}
	
	/*** Getters e Setters ***/
	public Tenis[] getMeusTenis() {
		return meusTenis;
	}
	public void setMeusTenis(Tenis[] meusTenis) {
		this.meusTenis = meusTenis;
	}
	public int getTenisComprados() {
		return tenisComprados;
	}
	public void setTenisComprados(int tenisComprados) {
		this.tenisComprados = tenisComprados;
	}
	public int getMeiasCompradas() {
		return meiasCompradas;
	}
	public void setMeiasCompradas(int meiasCompradas) {
		this.meiasCompradas = meiasCompradas;
	}
	public Meia[] getMinhasMeias() {
		return minhasMeias;
	}
	public void setMinhasMeias(Meia[] minhasMeias) {
		this.minhasMeias = minhasMeias;
	}

	
	//Verifica se pode comprar a quantidade informada
	//retorna true: se a quantidade a ser comprada juntamente com a ja adquirida 
	//nao ultrapassar o limite de tenis
	//retorna false: caso contrario
	public boolean possoComprarTodosTenis(int q) {
		return tenisComprados + q <= meusTenis.length;
	}
	
	//Adiciona "q" tenis aos meusTenis
	public void comprarAlgunsTenis(int q) {
		int numeroAleatorio;
		for(int i = 0; i < q; i++) {
			numeroAleatorio = Util.numeroAleatorio(7);
			meusTenis[tenisComprados++] = new Tenis(Loja.pegarNomeTenis(numeroAleatorio),Loja.pegarLimiteTenis(numeroAleatorio),Loja.pegarPrecoTenis(numeroAleatorio));
		}
	}
	
	//Verifica se pode comprar a quantidade informada
	//retorna true: se a quantidade a ser comprada juntamente com a ja adquirida 
	//nao ultrapassar o limite de meias
	//retorna false: caso contrario
	public boolean possoComprarTodasMeias(int q) {
		return meiasCompradas + q <= minhasMeias.length;
	}
	
	//adiciona "q" meias as minhasMeias
	public void comprarAlgumasMeias(int q) {
		int numeroAleatorio;
		for(int i = 0; i < q; i++) {
			numeroAleatorio = Util.numeroAleatorio(5);
			minhasMeias[meiasCompradas++] = new Meia(Loja.pegarNomeMeia(numeroAleatorio),Loja.pegarLimiteMeia(numeroAleatorio));
		}
	}
	
	//Lista todas as meias adquiridas na forma
	//Marca: xxx Furada: S
	//Marca: xxx Furada: N
	//Marca: xxx Furada: ...
	public String listarMeias() {
		String listaDeMeias = "";
		for(Meia m : minhasMeias) {
			if(m != null) {
				listaDeMeias += String.format("Marca: %s Furada: %s%n", m.getMarca(), (m.isFurada()?"S":"N"));
			}
		}
		return listaDeMeias;
	}
	
	//Calcular e retornar o valor total dos tenis ja comprados
	//retorna um double com o valor somado de cada tenis adquirido
	public double calculaTotalTenis() {
		double total = 0;
		for(Tenis m : meusTenis) {
			if(m != null) {
				total += m.getValorAtual();
			}
		}
		return total;
	}
	
	//Lista todos os tenis adquiridos na forma
	//Marca: xxx Valor: R$xxx.xx
	//Marca: xxx Valor: R$xxx.xx
	//Marca: xxx Valor: R$xxx.xx
	//...
	//Valor total: R$ xxx.xx
	public String listarTenisComTotal() {
		String listaDeTenis = "";
		String valorTotal = String.format("Valor total: R$ %.2f", calculaTotalTenis());
		for(Tenis m : meusTenis) {
			if(m != null) {
				listaDeTenis += String.format("Marca: %s Valor: %.2f%n", m.getMarca(), m.getValorAtual());
			}
		}
		
		return listaDeTenis+valorTotal;
	}
	
	//chama a acao de usar do tenis - sem meia
	public void usarTenisSemMeia(Tenis t) throws Exception {
		t.usar(null);
	}
	
	//chama a acao de usar do tenis - com meia
	public void usarTenisComMeia(Tenis t,Meia m) throws Exception {
		t.usar(m);
	}
}