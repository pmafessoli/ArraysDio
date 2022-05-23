package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoElementosDois {
	public static void main(String[] args) {

		System.out.println("Ordem aleatória");

		Set<Serie> minhasSeries = new HashSet<>() {
			{

				add(new Serie("got", "fantasia", 60));
				add(new Serie("dark", "drama", 60));
				add(new Serie("that", "comédia", 25));
			}
		};

		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + " - " + serie.getTempoEpisodio());
		}

		System.out.println("Ordem de inserção: ");
		Set<Serie> minhasSeriesDois = new LinkedHashSet<>() {
			{

				add(new Serie("got", "fantasia", 60));
				add(new Serie("dark", "drama", 60));
				add(new Serie("that", "comédia", 25));
			}
		};

		for (Serie serie : minhasSeriesDois) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}

		System.out.println("Ordem Natural");
		Set<Serie> minhasSeriesTres = new TreeSet<>(minhasSeriesDois);
		for (Serie serie : minhasSeriesTres) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

		}
	}
}

class Serie implements Comparable<Serie> {

	private String nome;
	private String genero;
	private Integer tempoEpisodio;

	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public int compareTo(Serie serie) {

		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0)
			return tempoEpisodio;
		
		return this.getGenero().compareToIgnoreCase(serie.getGenero());

	}
}
