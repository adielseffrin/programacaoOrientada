package com.provaD1;

public class Loja {
	private static Tenis tenisDisponiveis[];
	private static Meia meiasDisponiveis[];
	
		
	
	private static void cadastrarTenis() {
		tenisDisponiveis = new Tenis[7];
		tenisDisponiveis[0] = new Tenis("Nike",50,299.90);
		tenisDisponiveis[1] = new Tenis("Adidas",60,349.90);
		tenisDisponiveis[2] = new Tenis("Mizuno",40,250);
		tenisDisponiveis[3] = new Tenis("Olimpikus",45,199.50);
		tenisDisponiveis[4] = new Tenis("Qix",25,200);
		tenisDisponiveis[5] = new Tenis("Topper",70,119.99);
		tenisDisponiveis[6] = new Tenis("Pegada",10,89.30);
		
	}
	
	private static void cadastrarMeia() {
		meiasDisponiveis = new Meia[5];
		meiasDisponiveis[0] = new Meia("Nike",50);
		meiasDisponiveis[1] = new Meia("Adidas",50);
		meiasDisponiveis[2] = new Meia("Mizuno",40);
		meiasDisponiveis[3] = new Meia("Olimpikus",45);
		meiasDisponiveis[4] = new Meia("Sem marca",25);
				
	}
	
	/*********************************************************/
	public static Tenis comprarTenis(int t) {
		if(tenisDisponiveis == null) cadastrarTenis();
		return (t <= tenisDisponiveis.length ? tenisDisponiveis[t] : null);
	}
	
	public static String pegarNomeTenis(int t) {
		if(tenisDisponiveis == null) cadastrarTenis();
		return (t <= tenisDisponiveis.length ? tenisDisponiveis[t].getMarca() : "Sem marca");
	}
	
	public static int pegarLimiteTenis(int t) {
		if(tenisDisponiveis == null) cadastrarTenis();
		return (t <= tenisDisponiveis.length ? tenisDisponiveis[t].getLimiteDeUso() : 10);
	}
	
	public static double pegarPrecoTenis(int t) {
		if(tenisDisponiveis == null) cadastrarTenis();
		return (t <= tenisDisponiveis.length ? tenisDisponiveis[t].getValorAtual() : 59.90);
	}
	/*********************************************************/
	
	
	public static Meia comprarMeia(int m) {
		if(meiasDisponiveis == null) cadastrarMeia();
		return (m <= meiasDisponiveis.length ? meiasDisponiveis[m] : null);
	}
	
	public static String pegarNomeMeia(int t) {
		if(meiasDisponiveis == null) cadastrarMeia();
		return (t <= meiasDisponiveis.length ? meiasDisponiveis[t].getMarca() : "Sem marca");
	}
	
	public static int pegarLimiteMeia(int t) {
		if(meiasDisponiveis == null) cadastrarMeia();
		return (t <= meiasDisponiveis.length ? meiasDisponiveis[t].getLimiteDeUso() : 10);
	}
	
	
}
