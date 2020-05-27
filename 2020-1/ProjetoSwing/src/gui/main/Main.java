package gui.main;

import gui.frame.JanelaComBorderLayout;
import gui.frame.JanelaComFlowLayout;
import gui.frame.JanelaComGridLayout;
import gui.frame.JanelaSemLayout;

public class Main {
	public static void main(String[] args) {
		JanelaSemLayout nulo = new JanelaSemLayout();
		JanelaComFlowLayout flow = new JanelaComFlowLayout();
		JanelaComGridLayout grid = new JanelaComGridLayout();
		JanelaComBorderLayout border = new JanelaComBorderLayout();
		
		nulo.setVisible(true);
		flow.setVisible(true);
		grid.setVisible(true);
		border.setVisible(true);
		
	}
}
