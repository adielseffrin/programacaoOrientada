package com.provaD1;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(5, 3);

		if (p.possoComprarTodosTenis(2))
			p.comprarAlgunsTenis(2);

		if (p.possoComprarTodosTenis(2))
			p.comprarAlgunsTenis(2);

		if (p.possoComprarTodasMeias(1))
			p.comprarAlgumasMeias(1);
		try {

			p.usarTenisComMeia(p.getMeusTenis()[0], p.getMinhasMeias()[0]);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		System.out.println(p.listarMeias());
		System.out.println(p.listarTenisComTotal());

	}

}
