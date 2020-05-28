package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
//interface é como um contrato
public class Listener implements ActionListener{

	JPanel panel;
	
	public Listener() {
		
	}
	
	public Listener(JPanel p) {
		panel = p;
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton fonte = (JButton) e.getSource();
		System.out.println("Quem apertou? Foi o " + fonte.getLabel());
		if(panel != null) {
			panel.setVisible(true);
		}
		
	}

}
