package lib;

import entities.Filme;
import app.CinemaManager;

public class Forms {
	private String ADMINPassword = "1234";
	public void ClientForm (CinemaManager manager) {
		int opcao = 1000;
		int numOpcoes = 4;
		while(opcao != 0) {
			opcao = InOut.leInt("0-Encerrar operação \n1-Listar os filmes disponíveis \n2-Listar Elenco de um determinado Filme \n3-Listar Atores \n4-Listar Sessoes  ");
				switch (opcao) {
				case 0: break;
				case 1: {
					InOut.MsgDeAviso("Lista de Filmes", manager.listFilmes());
					break;
				}
				case 2: {
					int index = InOut.leInt("Insira o index do filme desejado");
					Filme filme = manager.getFilmeByIndex(index);
					InOut.MsgDeAviso("Elenco do filme: "+filme.getTitulo(), filme.getElenco());
					break;
				}
				case 3: {
					InOut.MsgDeAviso("Lista de Atores", manager.listAtores());
					break;
				}
				case 4: {
					InOut.MsgDeAviso("Lista de Sessoes", manager.listSessoes());
					break;
				}
				default:
					throw new IllegalArgumentException("O Valor " + opcao +" não é valido, digite um valor entre 0 e "+ numOpcoes);
				}			
		}
	}
	
	private boolean validateADMINPassword(String password) {
		return this.ADMINPassword.equals(password);
	}
	
	private void addAtorInFilme(CinemaManager manager) {
		int indexAtor = InOut.leInt("Insira o index do ator desejado");
		int indexFilme = InOut.leInt("Insira o index do filme desejado");
		Filme filme = manager.getFilmeByIndex(indexFilme);
		filme.adicionarAtor(manager.getAtorByIndex(indexAtor));
		InOut.MsgDeAviso("Elenco do filme: "+filme.getTitulo(), filme.getElenco());
	}
	
	public void ADMINForm (CinemaManager manager) {

		String password = InOut.leString("Por favor, digite sua senha de ADMINISTRADOR");
		System.out.println(!this.validateADMINPassword(password));
		if(!this.validateADMINPassword(password)) {
			InOut.MsgDeErro("Error ao Autenticar", "A senha informada está incorreta, tente novamente uma outra hora!!");
		}else {
			int opcao = 1000;
			int numOpcoes = 5;
			while(opcao != 0) {
				opcao = InOut.leInt(
						"0-Encerrar operação \n1-Listar os filmes disponíveis \n2-Listar Elenco de um determinado Filme \n3-Listar Atores \n4-Listar Sessoes \n-5-Adicionar o ator em um filme");
					switch (opcao) {
					case 0: break;
					case 1: {
						InOut.MsgDeAviso("Lista de Filmes", manager.listFilmes());
						break;
					}
					case 2: {
						int index = InOut.leInt("Insira o index do filme desejado");
						Filme filme = manager.getFilmeByIndex(index);
						InOut.MsgDeAviso("Elenco do filme: "+filme.getTitulo(), filme.getElenco());
						break;
					}
					case 3: {
						InOut.MsgDeAviso("Lista de Atores", manager.listAtores());
						break;
					}
					case 4: {
						InOut.MsgDeAviso("Lista de Sessoes", manager.listSessoes());
						break;
					}
					case 5:{
						this.addAtorInFilme(manager);
					}
					default:
						throw new IllegalArgumentException("O Valor " + opcao +" não é valido, digite um valor entre 0 e "+ numOpcoes);
					}			
			}
		}

	}
}
