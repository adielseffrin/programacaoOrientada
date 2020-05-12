import java.util.Scanner;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		n1 = in.nextInt();
		
		System.out.println("Digite o segundo numero");
		n2 = in.nextInt();
		
		Comparador c = new Comparador();
		int t = c.ExibeMaior(n1, n2);
		System.out.println(t);
		
	}

}
