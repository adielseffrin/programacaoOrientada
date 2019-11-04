import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("digite um nro:");
		int idade;
		int x = 0;
		String t="";

		Classe c = new Classe();
		
		
		try {
			c.metodo(in.nextInt());
			x = 2;
			System.out.println(c.meSalva());
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(c.meSalva());
		}
		
		
		

	}

}
