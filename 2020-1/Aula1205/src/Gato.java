import javax.swing.JOptionPane;

public class Gato extends Animal{

	public Gato(int j, boolean b) {
		super(j, b);
		JOptionPane.showMessageDialog(null, "Contrutor de gato");
	}
	
	public void seApresentar() {
		JOptionPane.showMessageDialog(null, "Oi amiaugo! Me chamo "+nome+"! Eu tenho "+idade+" anos.");
	}
	
	public void ignorarVoce() {
		JOptionPane.showMessageDialog(null, "");
	}
	
	
	public void fazCoco() {
		JOptionPane.showMessageDialog(null, "Jogando areia para todos os lados");
	}
	
	public void fazCoco(int t) {
		JOptionPane.showMessageDialog(null, "... para de me olhar pelo proximos "+t+" anos!");
	}
	
	
}
