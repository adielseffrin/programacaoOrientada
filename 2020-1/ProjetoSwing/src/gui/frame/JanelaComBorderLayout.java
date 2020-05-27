package gui.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaComBorderLayout extends JFrame {
	
	public JanelaComBorderLayout() {
		//Atribui o título da janela
		this.setTitle("Janela com BorderLayout");
		
		//Define o posicionamento e dimensão da janela
		//considerando um plano cartesiano
		this.setBounds(200, 100, 500, 500);
		
		//Define a ação padrão de fechar a janela como
		//a finalização do processo da JVM
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cria uma instância de JButton
		//Não precisa determinar o posicionamento e dimensão do 
		//botão pois o BorderLayout ajusta automaticamente a
		//posição e tamanho do componente baseado em uma divisão
		//do container em pontos cardeais
		JButton botao1 = new JButton();
		botao1.setText("Botão 1");
		
		JButton botao2 = new JButton();
		botao2.setText("Botão 2");
		
		JButton botao3 = new JButton();
		botao3.setText("Botão 3");
		
		JButton botao4 = new JButton();
		botao4.setText("Botão 4");
		
		JButton botao5 = new JButton();
		botao5.setText("Botão 5");
		
		Container container = this.getContentPane();
		container.setLayout(new BorderLayout());
		
		container.add(botao1, BorderLayout.NORTH);
		container.add(botao2, BorderLayout.WEST);
		container.add(botao3, BorderLayout.EAST);
		container.add(botao4, BorderLayout.SOUTH);
		container.add(botao5, BorderLayout.CENTER);
	}
}
