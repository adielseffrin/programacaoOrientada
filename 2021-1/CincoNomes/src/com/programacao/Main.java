package com.programacao;

import java.util.Scanner;
import com.programacao.cartorio.Cartorio;
import com.programacao.extraterrestrer.ET;
import com.programacao.pessoa.*;

public class Main {

	public static void main(String[] args) {
		Cartorio cart = new Cartorio();
		Pessoa a = new Pessoa("Adiel", 30);
		Scanner s = new Scanner(System.in);
		

		a.apelido = "Juarez";
		a.fazUmPix(5000);
		a.fazUmPix(-10);
		a.apresentar();
		
		/*Crianca cc = new Crianca();
		cc.fazUmPix(500);
		cc.setNome("gugu");
		cc.apresentar();
		cc.chorar();
		*/
		Adulto ad = new Adulto("Rodrigo", 25);
		
		ad.apelido = "Roro";
		
		ad.fazUmPix(0.01);
		ad.apresentar();
		ad.chorar();
		/*S
		ET et = new ET();
		et.setNome("Bilu");
		et.trazerMensagem();
	
		*/
		Pessoa b = new Pessoa("bianca", 20);
		/*
		Pessoa c = new Pessoa();
		c.setNome("Carlos");
		c.idade = 18;
		Pessoa d = new Pessoa();
		d.setNome("Daniela");
		d.idade = 12;
		Pessoa e = new Pessoa();
		e.setNome("Eustáquio");
		e.idade = 78;
		
		cart.Renomear(b, "Bruna");
		*/
		//a.dizerNumeroDaSorte();
		
		
		
		/*
		b.dizerNumeroDaSorte();
		b.apresentar();
		c.dizerNumeroDaSorte();
		d.dizerNumeroDaSorte();
		e.dizerNumeroDaSorte();
		 */
		
	}

}
