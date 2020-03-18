
public class Classe {
	public void metodo(int i) throws Exception {
		switch(i) {
		case 1:
			throw new NullPointerException("Deu erro, po");
		case 2:
			throw new IllegalArgumentException("Deu erro");
		case 3:
			throw new ArrayIndexOutOfBoundsException("Deu erro...");
		}
		
		if(i == 147) {
			throw new MinhaExcecao("231321");
		}
	}
	
	public String meSalva() {
		return "Você está salvo";
	}
}
