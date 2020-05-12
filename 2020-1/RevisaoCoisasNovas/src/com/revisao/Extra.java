package com.revisao;

import javax.swing.JOptionPane;

public class Extra {
	private int id;

	public Extra(int i) {
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public static int multiplica(int a, int b){ //multiplica_int_int
		return a * b;
	}
	
	
	
	public static double multiplica(double a, double b) { //multiplica_double_double
		return 2 * a * b;
	}
	
	public static double multiplica(int a, double c) {//multiplica_int_double
		return a * c;
	}
	
	public static double multiplica(double c, int a) throws Exception{//multiplica_double_int
		if(c == 0) throw new Exception("Não gosto de 0");
		return a * c;
	}
	
	
	
}
