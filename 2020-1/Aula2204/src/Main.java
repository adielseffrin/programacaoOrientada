import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Solicitar a quantidade de participantes (interface gráfica)
		//Cada participante possui id, nome e idade
		//Criar menu para:
		// -> consultar um participante pela id
		// -> listar todos participantes
		// -> sair
		//o programa não pode parar por exceção
		
		//regras
		//todos juntos definem qual grupo faz o que
		// ->Classes, métodos, validações...
		// -> Dividir tarefas
		// -> realizar nos grupos
		// -> alimentar doc online
		
try {
			
			int quantParticipantes = -1;
			String temp = "";
			
			do {
				try {
					temp = JOptionPane.showInputDialog("Informe a quantidade de participantes");
					
					if (temp == null) {
						System.exit(0);
					}
					quantParticipantes = Integer.parseInt(temp);
					
				} catch (Exception e) {
					// TODO: handle exception
					quantParticipantes = -1;
				}
				
				
			}while(quantParticipantes < 0);
			


			Participantes[] participantes = new Participantes[quantParticipantes];


			for(int x = 0;x < participantes.length; x++) {

				try {
					participantes[x] = new Participantes();

					participantes[x].setId(x);
					System.out.println(x);
					participantes[x].setNome(JOptionPane.showInputDialog("Informe o nome do participante"));
					participantes[x].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do "+
							(participantes[x].getNome()))));

				} catch (Exception e) {

					JOptionPane.showMessageDialog(null,"Digitou algo errado");
					x--;

				}


			}


			String idades = "Nomes dos participantes :";
			String[] opcoes = {"Consultar participantes pela id","Listar todos os participantes","Sair" };

			int menu = JOptionPane.showOptionDialog(null, "Escolha uma das opções", "Menu", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null,
					opcoes, opcoes[0]);

			while(menu != 2 && menu != -1) {




				if (menu == 0) {

					int id = Integer.parseInt(JOptionPane.showInputDialog("Qual a id?"));
					JOptionPane.showMessageDialog(null, "O nome do participante é "+participantes[id].getNome() +
							"\n e a idade é "+participantes[id].getIdade() );


				}else if (menu == 1) {

					for(int x = 0;x < participantes.length;x++) {



						idades += "\n"+participantes[x].getNome()+", "+ " idade "+participantes[x].getIdade();
					}
					JOptionPane.showMessageDialog(null, idades);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
