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
    
    public String getElenco() {
        StringBuilder elencoStr = new StringBuilder("Elenco do Filme: " + titulo + "\n\n");
        
        for (Ator ator : atores) {
            elencoStr.append("Nome: ").append(ator.getNome()).append(" / Papel: ").append(ator.getPapel()).append("\n");
        }
        System.out.println(elencoStr.toString());
        return elencoStr.toString();
    }
        
    public void adicionarAtor(Ator ator) {
    	
        atores.add(ator);
        ator.getFilmes().add(this);
        
        System.out.println("Ator: "+ator.getNome()+" acionado com sucesso!\n");
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
