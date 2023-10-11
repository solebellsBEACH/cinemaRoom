package entities;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ator {
	
	Integer idAtor;
	String nome, papel;
	private Set<Filme> filmes = new HashSet<>();
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

	public Set<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(Set<Filme> filmes) {
		this.filmes = filmes;
	}

	public String getNome() {
		return nome;
	}

	public String getPapel() {
		return papel;
	}
    
    
		
}
