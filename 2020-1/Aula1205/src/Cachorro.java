import javax.swing.JOptionPane;

public class Cachorro extends Animal {
	
	public Cachorro(int j, boolean b) {
		super(j, b);
		JOptionPane.showMessageDialog(null, "Contrutor de cachorro");
	}
	
	@Override
	public void seApresentar() {
		JOptionPane.showMessageDialog(null, "Oi aumigo! Me chamo "+nome+"! Eu tenho "+idade+" anos.");
	}
	
	public void pegarBolinha() {
		JOptionPane.showMessageDialog(null, "Peguei a bolinha e me sinto com menos de "+peso+"kg");
	}
	
	public void seDespedir() {
		JOptionPane.showMessageDialog(null, "Tchau amigo!");
	}
	
	
}
