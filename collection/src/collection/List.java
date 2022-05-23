package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class List {
	public static void main(String[] args) {

		System.out.println("Crie uma lista e adicione as sete notas: ");
		java.util.List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		System.out.println(notas);
		System.out.println(notas.toString());

		System.out.println("Exeiba a posi��o da nota 5.0: " + notas.indexOf(5d));

		System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");
		notas.add(4, 8d);
		System.out.println(notas);

		System.out.println("Subistitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);

		System.out.println("Confira se a nota 5.0 est� na lista: " + notas.contains(5d));

		System.out.println("Informe todas as notas na ordem em que foram informados: ");
		for (Double nota : notas) {
			System.out.println(nota);

			System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
			System.out.println(notas.toString());

			System.out.println("Exiba a menor nota: " + Collections.min(notas));
			System.out.println("Exiba a maior nota: " + Collections.max(notas));

			System.out.println("Exiba a soma dos valores");
			Iterator<Double> iterator = notas.iterator();
			Double soma = 0d;
			while (iterator.hasNext()) {
				Double next = iterator.next();
				soma += next;
			}

			System.out.println("Exiba a media das notas: " + (soma / notas.size()));

//			System.out.println(soma);
//
//			System.out.println("Informe a m�dica das notas");
//			int aux = 0;
//			for (Double nota1 : notas) {
//				nota1 += nota1;
//				aux++;
//				Double media = nota1 / aux;
//				System.out.println(media);
//
//			}
			System.out.println("remova a nota zero: ");
			notas.remove(0d);
			System.out.println("notas");

			System.out.println("Remova a nota da posi��o zero: ");
			notas.remove(0);
			System.out.println(notas);

			
			System.out.println("Remova as notas menos que 7 e exiba a lista");
			Iterator<Double> iterator2 = notas.iterator();
			while(iterator2.hasNext()) {
			double next = iterator2.next();
			if(next < 7) iterator2.remove();
			}
			
			System.out.println(notas);
		}
		
		System.out.println("Apague toda a lista");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("Confira se a lista est� vazia: "+ notas.isEmpty());
	}
}
