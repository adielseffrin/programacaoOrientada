import javax.swing.JOptionPane;

public class Animal extends SerVivo{
	public String nome;
	public int idade;
	public double peso;
	
	public Animal(int i, boolean b) {
		super(b);
		idade = i;
		JOptionPane.showMessageDialog(null, "Contrutor de animal");
		
	}
	
	public void seApresentar() {
		JOptionPane.showMessageDialog(null, "Oi, eu sou um animal");
	}
	
	public void fazCoco() {
		JOptionPane.showMessageDialog(null, "... para de me olhar!");
	}
	
	
}
