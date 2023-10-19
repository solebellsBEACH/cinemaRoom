package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ator {
	
	Integer idAtor;
	String nome, papel;
	private List<Filme> filmes = new ArrayList<>();
	Random random = new Random();
	
    public Ator(String nome, String papel) {
        this.idAtor = random.nextInt();
        this.nome = nome;
        this.papel = papel;
    }
    
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
        filme.getAtores().add(this);
    }

    public void removerFilme(Filme filme) {
        filmes.remove(filme);
        filme.getAtores().remove(this);
    }
    
    public String getActorDescription() {
    	   return "Descrição do Ator => \nNome: "+this.nome+"\nPapel: "+this.papel;
    }

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public String getNome() {
		return nome;
	}

	public String getPapel() {
		return papel;
	}
    
    
		
}
