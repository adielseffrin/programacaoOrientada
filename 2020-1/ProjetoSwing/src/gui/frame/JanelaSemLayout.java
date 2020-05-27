package gui.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaSemLayout extends JFrame {
	
	public JanelaSemLayout() {
		//Atribui o título da janela
		this.setTitle("Janela sem layout");
		
		//Define o posicionamento e dimensão da janela
		//considerando um plano cartesiano
		this.setBounds(200, 100, 500, 500);
		
		//Define a ação padrão de fechar a janela como
		//a finalização do processo da JVM
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cria uma instância de JButton
		JButton botao = new JButton();
		
		//Atribui o texto a ser exibido pelo botão
		botao.setText("Click-me");
		
		//Atribui o texto de dica ao manter o ponteiro do mouse
		//sobre o botão
		botao.setToolTipText("Dica do botão");
		
		//Define o posicionamento e dimensão do botão
		//considerando um plano cartesiano
		botao.setBounds(20, 10, 100, 30);
		
		//Obtem a instância do container da janela
		Container container = this.getContentPane();
		
		//Define o layout do container da janela como nulo
		//Neste caso, o posicionamento dos componentes é
		//absoluto, isto é, todo componente precisa especificar
		//suas coordenadas e dimensões
		container.setLayout(null);
		
		//Adiciona o botão no container da janela
		container.add(botao);
	}
}
