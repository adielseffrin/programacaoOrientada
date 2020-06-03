package gui.listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
		
		if(panel != null) {
			switch(fonte.getLabel()) {
			case "Verde":
				panel.setBackground(Color.green);
				break;
			case "Amarelo":
				panel.setBackground(Color.yellow);
				break;
			case "Vermelho":
				panel.setBackground(Color.red);
				break;
			}
			panel.setVisible(true);
		}
		
		
	}

}
