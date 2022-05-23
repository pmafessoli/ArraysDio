package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoElementos {

	public static void main(String[] args) {

		List<Gato> gatos = new ArrayList<Gato>() {
			{
				add(new Gato("Jonh", 18, "preto"));
				add(new Gato("Simba", 6, "tigrado"));
				add(new Gato("Jonh", 12, "amarelo"));
			}
		};

		System.out.println("Ordem de iserção: ");
		System.out.println(gatos);

		System.out.println("Ordem aleatória: ");
		Collections.shuffle(gatos);
		System.out.println(gatos);

		System.out.println("Ordem natural: ");
		Collections.sort(gatos);

		System.out.println("Ordem idade: ");
		gatos.sort(new ComparatorIdade());
//		Collections.sort(gatos, new ComparatorIdade());
		System.out.println(gatos);
		
		System.out.println("Ordem Cor: ");
		gatos.sort(new ComparatorCor());
//		Collections.sort(gatos, new ComparatorIdade());
		System.out.println(gatos);
		
		System.out.println("Ordenar por nome, cor, idade");
		gatos.sort(new ComparatorNomeCorIdade());
		System.out.println(gatos);
		
	}

}

class Gato implements Comparable<Gato> {

	private String nome;
	private Integer idade;
	private String cor;

	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {

		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}


class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) {
			return nome;
		}else {
		
			int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
			if(cor != 0) {
				return cor;
			}
			
		}
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}