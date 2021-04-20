import javax.swing.JOptionPane;

public class SerVivo {
	boolean podeRespirar;
	
	public SerVivo(boolean k) {
		podeRespirar = k;
		JOptionPane.showMessageDialog(null, "Contrutor de ser vivo");
	}
}
