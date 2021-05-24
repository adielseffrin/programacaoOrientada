package com.unisociesc.aula0503;

import java.util.Scanner;

import com.unisociesc.aula0503.traducoes.Ingles;
import com.unisociesc.aula0503.traducoes.Portugues;
import com.unisociesc.aula0503.traducoes.Traducao;
import com.unisociesc.aula0503.utilitarios.UtilMatematica;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("O que temos para hoje:");
		System.out.println("Finalizar herança -> Sobrecarga e Sobreposição : ok!");
		System.out.println("Erros e exceção: ok - throw/throws");
		System.out.println("tratamento de exceção: ok - try..catch");
		System.out.println("-------- extra pra aula ---------");
		System.out.println("verificar instalação de BD local");
		
		Traducao t = null;
		System.out.println("BR - Português");
		System.out.println("EN - English");
		Scanner in = new Scanner(System.in);
		/*
		String escolha = in.next();
		if(escolha.equals("BR"))
			t = new Portugues();
		if(escolha.equals("EN"))
			t = new Ingles();
		
		System.out.println(t.getSaudacao());
		System.out.println(t.showMenuOptions());
		
		Traducao t2 = new Traducao();
		System.out.println(t2.getSaudacao());
		
		Portugues p = new Portugues();
		System.out.println(p.getSaudacao());
		
		UtilMatematica um = new UtilMatematica();
		double a = in.nextDouble(); //5.5
		double b = in.nextDouble(); //6.7
		double area2 = um.calculaArea(a, b);
		System.out.println(area2);
		
		int c = 7;
		int d = 9;
		int area = um.calculaArea(c, d);
		System.out.println(area);
		
		*/
		//System.out.println(Math.absExact(Integer.MIN_VALUE));
		try		{ //tentar
			int[] valores = {1, 2, 3};
			
			System.out.println(valores[1]);
			System.out.println(valores[2]);
			System.out.println(valores[3]);
		}catch(ArrayIndexOutOfBoundsException e) { //capturar
			System.out.println("posição inválida");
		}catch(Exception e) { //capturar
			System.out.println("Algo de errado não deu certo");
		}
		
		//if(x == 0 && y == 1) {} //e
		//if(x == 0 || y == 1) {} //ou
		//ou exclusivo -> xor ^
		
		String aa = "aaa";
		String bb = "bbb";
		
		if(aa.equals("aa") ^ bb.equals("bb")) {
			System.out.println("Acerto mizerávi!");
		}
		System.out.println("terminei vivo");
		
		Traducao t2 = new Traducao();
		System.out.println(t2.getSaudacao());
		try {
			t2.lancaExcecao();
		}catch(MinhaException e) {
			System.out.println(e);
		}
		
		System.out.println("🎆🎇");
		

	}

}
