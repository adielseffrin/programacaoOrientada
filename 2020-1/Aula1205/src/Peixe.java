import javax.swing.JOptionPane;

public class Peixe extends Animal{
	
	public Peixe(int j, boolean b) {
		super(j, b);
	}
	
	public String cor;
	
	public void seApresentar() {
		JOptionPane.showMessageDialog(null, "Glub! Glub! Glub! "+nome+"! Glub "+cor+" Glub! "+idade+" Glub!.");
	}
	
	public void seDespedir() {
		JOptionPane.showMessageDialog(null, "Glub Glub!");
	}
}
