package entities;

public class Sessao {

	boolean statusSessao; //	True é para iniciada e False é para encerrada
	String horario;
	Filme filme; 
	Sala sala;
	
	public Sessao(String horario, Filme filme, Sala sala) {
		this.statusSessao = false;
		this.horario = horario;
        this.filme = filme;
        this.sala = sala;
	}

	public boolean isStatusSessao() {
		return statusSessao;
	}

	public void setStatusSessao(boolean statusSessao) {
		this.statusSessao = statusSessao;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public String getSessaoDescription() {
		String status = this.statusSessao ? "Iniciada":"Não iniciada";
		return "\nHorario: "+this.horario+"\nFilme: "+this.filme.getTitulo() +"\nStatus da Sessão: "+status;
	}
		
		
}
