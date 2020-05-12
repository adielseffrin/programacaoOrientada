import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Cachorro izzie = new Cachorro(2,true);
		izzie.nome = "Izzie";
		izzie.peso = 5.5;
		//izzie.idade = 2;
		izzie.podeRespirar = true;
		JOptionPane.showMessageDialog(null, izzie.idade);
		//izzie.seApresentar();
		//izzie.pegarBolinha();
		//izzie.fazCoco();
		
		Gato sofia = new Gato(3,true);
		sofia.nome = "Sofia";
		//sofia.idade = 3;
		
		//sofia.seApresentar();
		//sofia.ignorarVoce();
		//sofia.fazCoco();
		//sofia.fazCoco(81);
		
		/*Peixe maiconjequisson = new Peixe(1,false);
		maiconjequisson.nome = "Maico Jequisson";
		//maiconjequisson.idade = 1;
		maiconjequisson.peso = 0.2;
		maiconjequisson.cor = "Preto e branco";*/
		
		//maiconjequisson.seApresentar();
		//maiconjequisson.seDespedir();
		//maiconjequisson.fazCoco();
		
		
		Animal novo = new Animal(5,false);
		//novo.seApresentar();
		//novo.fazCoco();
		JOptionPane.showMessageDialog(null, novo.idade);
		
		//como colocar essa galera num vetor
		Animal meusPets[] = new Animal[3];
		meusPets[0] = izzie;
		meusPets[1] = sofia;
		//meusPets[2] = maiconjequisson;
		
		//for(Animal a : meusPets)
		//	JOptionPane.showMessageDialog(null, a.nome);

	}

}
