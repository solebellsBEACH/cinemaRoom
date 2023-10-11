package entities;

import java.util.Random;

public class Sala {
	
	Integer idSala, numAssentos;
	String tipoTela, localizacao;
	Random random = new Random();
	
	public Sala( Integer numAssentos, String tipoTela, String localizacao) {
		this.idSala = random.nextInt();
		this.numAssentos = numAssentos;
		this.tipoTela = tipoTela;
		this.localizacao = localizacao;
	}

	public Integer getNumAssentos() {
		return numAssentos;
	}

	public String getTipoTela() {
		return tipoTela;
	}

	public String getLocalizacao() {
		return localizacao;
	}
	
	public void cadastrarUmaNovaSessao(String horario, Filme filme, Sala sala) {
		try {
			Sessao sessao = new Sessao(horario, filme, sala );
			System.out.println("Sessão cadastrada com sucesso!"+sessao);
		} catch (Exception e) {
			System.out.println("Erro em cadastrar Sessão");
			System.out.println(e);
		}
	}
}
