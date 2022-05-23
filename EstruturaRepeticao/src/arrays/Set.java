package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {

		System.out.println("Crie um conjunto e adicione as notas");

		java.util.Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d, 3.6));
		System.out.println(notas.toString());

		System.out.println("Confira se a nota 5.0 est� no conjunto");
		notas.contains(5d);
		System.out.println(notas);

		System.out.println("Exiba a menor nota: " + Collections.min(notas));

		System.out.println("Exiba a maior nota: " + Collections.max(notas));

		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;

		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);

		System.out.println("Media das notas" + (soma / notas.size()));

		System.out.println("Remova a nota zero");
		notas.remove(0d);

		System.out.println("Remova as notas menores que set e exiba a lista: ");

		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) {
				iterator1.remove();

			}

			System.out.println(notas);
		}

		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		java.util.Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		
		System.out.println(notas2.toString());

		System.out.println("Exiba todas as notas na odem crescente: ");
		java.util.Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Remova todo o conjunto: ");
		notas.clear();
		notas2.clear();
		notas3.clear();
		System.out.println("Nota 1: " + notas + " Nota2: " + notas2 + " Nota3: " + notas3);
	}
}
