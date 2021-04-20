package testeArgumentos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JOptionPane exemplo");

		if(args.length > 0) {
			JOptionPane.showMessageDialog(frame, args[0]);
		}else
			JOptionPane.showMessageDialog(frame, "Olá mundo");
		
		System.exit(0);
	}

}
