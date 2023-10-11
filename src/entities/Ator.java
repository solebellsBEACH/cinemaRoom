package entities;
import java.util.Random;

public class Ator {
	
	Integer idAtor;
	String nome, papel;
	
	
	Random random = new Random();
	
    public Ator(String nome, String papel) {
        this.idAtor = random.nextInt();
        this.nome = nome;
        this.papel = papel;
    }

	public Integer getIdAtor() {
		return idAtor;
	}

	public String getNome() {
		return nome;
	}

	public String getPapel() {
		return papel;
	}
    
    public String getActorDescription() {
    	   return "Descrição do Ator => \nNome: "+this.nome+"\nPapel: "+this.papel;
    }
		
}
