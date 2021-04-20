
public class Main {

	public static void main(String[] args) {
		Monstros m1 = new Monstros();
		Monstros m2 = new Monstros();
		Monstros m3 = new Monstros();
		Monstros m4 = new Monstros();
		Koppa k1 = new Koppa();
		Koppa k2 = new Koppa();
		Koppa k3 = new Koppa();
		Koppa k4 = new Koppa();
		
		m1.setVelocidade(5);
		System.out.println(m1.getVelocidade());
		
		k1.cor = "verde";
		k1.patas = 5;
		k2.patas = 15;
		k1.andar();
		System.out.println(k1.cor);

	}

}
