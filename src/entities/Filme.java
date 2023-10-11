package entities;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Filme {
	
	Integer idFilme;
	String titulo, genero;
	long duracao;
	private Set<Ator> atores = new HashSet<>();
	
	Random random = new Random();
	
    public Filme(String titulo, String genero, long duracao) {
        this.idFilme = random.nextInt();
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }
    
    public void adicionarAtor(Ator ator) {
        atores.add(ator);
        ator.getFilmes().add(this);
    }

    public void removerAtor(Ator ator) {
        atores.remove(ator);
        ator.getFilmes().remove(this);
    }

	public Set<Ator> getAtores() {
		return atores;
	}

	public void setAtores(Set<Ator> atores) {
		this.atores = atores;
	}
    
    

	
}
