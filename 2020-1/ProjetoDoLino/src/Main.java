import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patentes vDeVariavel = new Patentes();
		
		System.out.println(vDeVariavel.patentes[3]);
		
		//JOptionPane.showInputDialog("Fala ai que..", "eu to cansado");
		
		int opt = JOptionPane.showConfirmDialog(null, "Cadastro", "?", JOptionPane.YES_NO_OPTION,
				JOptionPane.DEFAULT_OPTION);
		if(opt == 0) {
			System.out.println("Aeeeeee");
		}else {
			System.out.println("Ah :(");
		}
		//System.out.println(opt);
		
		String[] opts = {"Um", "dois", "tres","Um", "dois", "tres"};
		JOptionPane.showOptionDialog(null, "msg", "title", JOptionPane.YES_NO_OPTION,
				JOptionPane.DEFAULT_OPTION, null, opts, opts[2]);
		
		
		
	}

}
