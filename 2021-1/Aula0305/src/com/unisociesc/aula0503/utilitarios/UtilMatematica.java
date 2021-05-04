package com.unisociesc.aula0503.utilitarios;

public class UtilMatematica {
	//sobrecarga
	
	//calculaArea_int
	public int calculaArea(int base) {
		return base * base;
	}
	
	//calculaArea_int_int
	public int calculaArea(int base, int altura) {
		return base * altura;
	}
	
	//calculaArea_double_double
	public double calculaArea(double base, double altura) {
		return base * altura;
	}
	
	//calculaArea_double_int
	public int calculaArea(double altura, int base) {
		return (int)(base * altura);
	}
	
	//calculaArea_int_double
	public int calculaArea(int altura, double base) {
		return (int)(base * altura);
	}
	
}
