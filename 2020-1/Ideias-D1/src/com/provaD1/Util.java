package com.provaD1;

import java.util.Random;

public class Util {
	
	//Retorna um numero aleatorio entre 0 e limite (sem incluir o limite)
	public static int numeroAleatorio(int limite) {
		Random r = new Random();
		return r.nextInt(limite);
		
	}
}
