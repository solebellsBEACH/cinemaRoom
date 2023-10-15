import java.util.ArrayList;
import java.util.List;

import entities.Ator;
import entities.Filme;
import entities.Sala;
import entities.Sessao;

public class CinemaManager {
	private List<Filme> filmes = new ArrayList<Filme>();
	private List<Ator> atores = new ArrayList<>();
	private List<Sala> salas = new ArrayList<>();
	private List<Sessao> sessoes = new ArrayList<>();
	
	
	public CinemaManager() {}
	
	public String listFilmes() {
		String list = "";
			int i  = 0;
			while(i<filmes.size()) {
				list = list +"\n"+i+"- "+filmes.get(i).getTitulo();
				i++;
			}
	        return list;
	}
	
	
	public Filme getFilmeByIndex(int index) {		
		return filmes.get(index);
	}
	
	public String listAtores() {
		String list = "";
			int i  = 0;
			while(i<atores.size()) {
				list = list +"\n"+i+"- "+atores.get(i).getNome();
				i++;
			}
	        return list;
	}
	
	public void cadastrandoFilmes() {
		Filme f1 = new Filme("Veloses e Furiosos", "Ação", 222);
		Filme f2 = new Filme("De volta para o futuro", "Aventura", 1345);
		Filme f3 = new Filme("As crônicas de Narnia", "Fantasia", 22332);
		Filme f4 = new Filme("Ta dando Onda", "Animação", 2100);
		Filme f5 = new Filme("Gladiador", "Ação", 12);

		f5.adicionarAtor(atores.get(0));
		f5.adicionarAtor(atores.get(1));
		f5.adicionarAtor(atores.get(2));
		
		f4.adicionarAtor(atores.get(0));
		f4.adicionarAtor(atores.get(1));
		f4.adicionarAtor(atores.get(2));

		f2.adicionarAtor(atores.get(0));
		f2.adicionarAtor(atores.get(1));
		f2.adicionarAtor(atores.get(2));
		
		filmes.add(f1);
		filmes.add(f2);
		filmes.add(f3);
		filmes.add(f4);
		filmes.add(f5);
	}
	public void cadastrandoAtores() {
		Ator a1 = new Ator("Wagner Moura", "Protagonista");
		Ator a2 = new Ator("Brad Pitt","Protagonista");
		Ator a3 = new Ator("Cadu Maverick", "Protagonista");
		Ator a4 = new Ator("João Frango", "Protagonista");
		Ator a5 = new Ator("Tank", "Protagonista");
		atores.add(a1);
		atores.add(a2);
		atores.add(a3);
		atores.add(a4);
		atores.add(a5);
	}

	public void cadastrandoSalas() {
		Sala s1 = new Sala(100, "Ultra Wide", "UVV - Campus Boa Vista");
		Sala s2 = new Sala(100, "Ultra Wide", "UVV - Campus Boa Vista");
		Sala s3 = new Sala(100, "Ultra Wide", "UVV - Campus Boa Vista");
		Sala s4 = new Sala(100, "Ultra Wide", "UVV - Campus Boa Vista");
		Sala s5 = new Sala(100, "Ultra Wide", "UVV - Campus Boa Vista");
		salas.add(s1);
		salas.add(s2);
		salas.add(s3);
		salas.add(s4);
		salas.add(s5);
	}
	
}
