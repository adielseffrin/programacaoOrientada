package com.galerao;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaComFlowLayout extends JFrame {
	
	public JanelaComFlowLayout() {
		//Atribui o título da janela
		this.setTitle("Janela com FlowLayout");
		
		//Define o posicionamento e dimensão da janela
		//considerando um plano cartesiano
		this.setBounds(200, 100, 500, 500);
		
		//Define a ação padrão de fechar a janela como
		//a finalização do processo da JVM
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cria uma instância de JButton
		//Não precisa determinar a dimensão do botão pois
		//será utilizado o tamanho preferido do componente
		//baseado no texto do botão
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
		container.setLayout(new FlowLayout());
		
		container.add(botao1);
		container.add(botao2);
		container.add(botao3);
		container.add(botao4);
		container.add(botao5);
	}
}

