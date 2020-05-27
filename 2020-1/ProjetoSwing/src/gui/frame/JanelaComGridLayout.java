package gui.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaComGridLayout extends JFrame {
	
	public JanelaComGridLayout() {
		//Atribui o título da janela
		this.setTitle("Janela com GridLayout");
		
		//Define o posicionamento e dimensão da janela
		//considerando um plano cartesiano
		this.setBounds(200, 100, 500, 500);
		
		//Define a ação padrão de fechar a janela como
		//a finalização do processo da JVM
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cria uma instância de JButton
		//Não precisa determinar o posicionamento e dimensão do 
		//botão pois o GridLayout ajusta automaticamente a
		//posição e tamanho do componente baseado em uma divisão
		//do container por um número de linhas e outro de colunas
		JButton botao1 = new JButton();
		botao1.setText("Botão 1");
		
		JButton botao2 = new JButton();
		botao2.setText("Botão 2");
		
		JButton botao3 = new JButton();
		botao3.setText("Botão 3");
		
		JButton botao4 = new JButton();
		botao4.setText("Botão 4");
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(2,2));
		
		container.add(botao1);
		container.add(botao2);
		container.add(botao3);
		container.add(botao4);
	}
}
