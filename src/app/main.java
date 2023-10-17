package app;
import lib.Forms;
import lib.InOut;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CinemaManager manager = new CinemaManager();
		manager.cadastrandoEntidades();
		
		Forms forms =  new Forms();

		InOut.MsgDeAviso("Olá", "Bem vindo ao UVV Flix, clique em OK e selecione uma das opções a seguir!");
		int opcao = 1000;
		int numOpcoes = 2;
		while(opcao != 0) {
			opcao = InOut.leInt("0-Encerrar operação \n1-Acessar painel de Administrador \n2-Acessar painel de Cliente");
			switch (opcao) {
			case 0: break;
			case 1: {
				forms.ADMINForm(manager);
				break;
			}
			case 2: {
				forms.ClientForm(manager);
				break;
			}
			default:
				throw new IllegalArgumentException("O Valor " + opcao +" não é valido, digite um valor entre 0 e "+ numOpcoes);
			}	
		}
		
		InOut.MsgDeAviso("Até mais ...", "Você digitou 0, até breve!");

	}

}
